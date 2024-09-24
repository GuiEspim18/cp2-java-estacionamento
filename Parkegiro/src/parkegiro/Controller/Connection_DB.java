/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Controller;

import java.net.URL;
import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author guiespim
 */
public class Connection_DB {
    
    // Variáveis de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost/parkegiro";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
 
    public static String connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            return "Driver e Bancos de Dados carregados com sucesso!";
        } catch (Exception e) {
            return "Driver nao pode ser carregado!\n ou DB Inexistente";
        }
    }
    
    public static Connection connection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);  
        } catch(SQLException e) {
            return null;
        }
    }
    
}
