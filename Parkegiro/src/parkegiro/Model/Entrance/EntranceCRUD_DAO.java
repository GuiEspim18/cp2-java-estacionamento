/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Model.Entrance;

import java.sql.SQLException;
import parkegiro.Controller.Connection_DB;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author guiespim
 */
public class EntranceCRUD_DAO {
    
    public static void create(Entrance_DAO data) {
        try {
            Connection connection = Connection_DB.connection();
            String sql = "INSERT INTO entrance(plate,brand,model,hour) values('"+data.plate+"','"+data.brand+"','"+data.model+"',"+data.hour+"')";
            try {
                PreparedStatement insert = (PreparedStatement) connection.prepareStatement(sql);
                insert.execute();
                JOptionPane.showMessageDialog(null, "\nEntrada adicionada com sucesso!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }
        } catch (SQLException e) {
            
        }
    }
    
}
