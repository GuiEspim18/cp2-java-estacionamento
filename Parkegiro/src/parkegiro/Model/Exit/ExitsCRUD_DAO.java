/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Model.Exit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parkegiro.Controller.Connection_DB;
import parkegiro.Model.Entrance.EntranceCRUD_DAO;
import parkegiro.Model.Entrance.Entrance_DAO;
import parkegiro.View.Home_GUI;

/**
 *
 * @author guiespim
 */
public class ExitsCRUD_DAO {
    
    private static List<Exit_DAO> exits = new ArrayList<>();
    
    public static void create (Exit_DAO data) {
        Connection connection = Connection_DB.connection();
        if (connection != null) {
            String sql = "INSERT INTO exits(plate, brand, model, hour, price) values(?, ?, ?, ?, ?)";
            try {
                if (data.plate.length() > 0 && data.brand.length() > 0 && data.model.length() > 0 && data.hour.length() > 0 && data.price > 0) {
                    PreparedStatement insert = (PreparedStatement) connection.prepareStatement(sql);
                    insert.setString(1, data.plate);
                    insert.setString(2, data.brand);
                    insert.setString(3, data.model);
                    insert.setString(4, data.hour);
                    insert.setString(5, String.valueOf(data.price)); 
                    insert.execute();
                } else {
                    JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", 0);
                }
                sql = "DELETE FROM entrance WHERE plate = ?";
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, data.plate);
                statement.execute();
                EntranceCRUD_DAO.getAll();
                EntranceCRUD_DAO.clearFields();
                JOptionPane.showMessageDialog(null, "\nSaída adicionada com sucesso!");
                getAll();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            } catch (SQLException ex) {
                Logger.getLogger(ExitsCRUD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
        }
    }
    
    public static void getAll() {
        exits = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM exits";
        try (PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                exits.add(new Exit_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour"), resultSet.getDouble("price")));
            }
            load();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void load() {
        ArrayList<Object[]> rows = new ArrayList<Object[]>();
        for (Exit_DAO exit : exits) {
            rows.add(new Object[] { exit.plate, exit.brand, exit.model, exit.hour, exit.price });
        }
        Object[][] data = new Object[rows.size()][];
        String[] columns = new String[] {"Placa", "Marca", "Modelo", "Horário", "Valor"}; 
        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        DefaultTableModel model = new DefaultTableModel(data, columns);
        Home_GUI.exits.setModel(model);
    }
    
    private static void clearFields() {
        Home_GUI.plateExit.setText("");
        Home_GUI.brandExit.setText("");
        Home_GUI.modelExit.setText("");
        Home_GUI.hourExit.setText("");
        Home_GUI.valueExit.setText("");
    }
    
}
