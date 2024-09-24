/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Model.Entrance;

import java.sql.SQLException;
import parkegiro.Controller.Connection_DB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import parkegiro.View.Home_GUI;

/**
 *
 * @author guiespim
 */
public class EntranceCRUD_DAO {
    
    private static List<Entrance_DAO> entrances = new ArrayList<>();
    
    public static void create(Entrance_DAO data) {
        Connection connection = Connection_DB.connection();
        if (connection != null) {
            String sql = "INSERT INTO entrance(plate,brand,model,hour) values(?, ?, ?, ?)";
            try {
                if (data.plate.length() > 0 && data.brand.length() > 0 && data.model.length() > 0 && data.hour.length() > 0) {
                    PreparedStatement insert = (PreparedStatement) connection.prepareStatement(sql);
                    insert.setString(1, data.plate);
                    insert.setString(2, data.brand);
                    insert.setString(3, data.model);
                    insert.setString(4, data.hour);
                    insert.execute();
                    JOptionPane.showMessageDialog(null, "\nEntrada adicionada com sucesso!");
                    clearFields();
                    getAll();
                } else {
                    JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", 0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            } catch (SQLException ex) {
                Logger.getLogger(EntranceCRUD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
        }

    }
    
    public static void getAll() {
        entrances = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM entrance";
        try (PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                entrances.add(new Entrance_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour")));
            }
            load();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void getOne(String plate) {
        entrances = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM entrance WHERE plate = ?";
        try {
            if (plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, plate);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Entrance_DAO entrance = new Entrance_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour"));
                    populateFields(entrance);
                    entrances.add(entrance);
                }
                load();
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void update(Entrance_DAO entrance) {
        Connection connection = Connection_DB.connection();
        String sql = "UPDATE entrance SET plate = ?, brand = ?, model = ?, hour = ? WHERE plate = ?";
        try {
            if (entrance.plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, entrance.plate);
                statement.setString(2, entrance.brand);
                statement.setString(3, entrance.model);
                statement.setString(4, entrance.hour);
                statement.setString(5, entrance.plate);
                statement.execute();
                getAll();
                clearFields();
                JOptionPane.showMessageDialog(null, "\nEntrada editada com sucesso!");  
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void delete(String plate) {
        Connection connection = Connection_DB.connection();
        String sql = "DELETE FROM entrance WHERE plate = ?";
        try {
            if (plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, plate);
                statement.execute();
                getAll();
                clearFields();
                JOptionPane.showMessageDialog(null, "\nEntrada excluída com sucesso!");  
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void load() {
        ArrayList<Object[]> rows = new ArrayList<Object[]>();
        for (Entrance_DAO entrance : entrances) {
            rows.add(new Object[] { entrance.plate, entrance.brand, entrance.model, entrance.hour });
        }
        Object[][] data = new Object[rows.size()][];
        String[] columns = new String[] {"Placa", "Marca", "Modelo", "Horário"}; 
        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        DefaultTableModel model = new DefaultTableModel(data, columns);
        Home_GUI.entrances.setModel(model);
    }
    
    
    public static void clearFields() {
        Home_GUI.plateEntrance.setText("");
        Home_GUI.modelEntrance.setText("");
        Home_GUI.brandEntrance.setText("");
        Home_GUI.hourEntrance.setText("");
    }
    
    private static void populateFields(Entrance_DAO entrance) {
        Home_GUI.plateEntrance.setText(entrance.plate);
        Home_GUI.modelEntrance.setText(entrance.model);
        Home_GUI.brandEntrance.setText(entrance.brand);
        Home_GUI.hourEntrance.setText(entrance.hour);
    }
    
}
