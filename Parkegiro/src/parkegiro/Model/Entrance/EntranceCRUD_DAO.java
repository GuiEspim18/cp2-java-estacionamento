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

/**
 *
 * @author guiespim
 */
public class EntranceCRUD_DAO {
    
    public static void create(Entrance_DAO data) {
        Connection connection = Connection_DB.connection();
        if (connection != null) {
            String sql = "INSERT INTO entrance(plate,brand,model,hour) values(?, ?, ?, ?)";
            try {
                PreparedStatement insert = (PreparedStatement) connection.prepareStatement(sql);
                insert.setString(1, data.plate);
                insert.setString(2, data.brand);
                insert.setString(3, data.model);
                insert.setString(4, data.hour);
                insert.execute();
                JOptionPane.showMessageDialog(null, "\nEntrada adicionada com sucesso!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            } catch (SQLException ex) {
                Logger.getLogger(EntranceCRUD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
        }

    }
    
    public static List<Entrance_DAO> getAll() {
        List<Entrance_DAO> entrances = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM entrance";
        try (PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                entrances.add(new Entrance_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return entrances;
    }
    
}
