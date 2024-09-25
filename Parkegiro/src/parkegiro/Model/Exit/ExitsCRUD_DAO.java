/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Model.Exit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parkegiro.Controller.Connection_DB;
import parkegiro.Model.Entrance.EntranceCRUD_DAO;
import static parkegiro.Model.Entrance.EntranceCRUD_DAO.clearFields;
import static parkegiro.Model.Entrance.EntranceCRUD_DAO.getAll;
import parkegiro.Model.Entrance.Entrance_DAO;
import parkegiro.View.Home_GUI;
import static parkegiro.View.Home_GUI.hourEntrance;

/**
 *
 * @author guiespim
 */
public class ExitsCRUD_DAO {
    
    private static List<Exit_DAO> exits = new ArrayList<>();
    
    public static void create (String plate) {
        Connection connection = Connection_DB.connection();
        if (connection != null) {
            String sql = "SELECT * FROM entrance WHERE plate = ?";
            try {
                if (plate.length() > 0 ) {
                    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                    statement.setString(1, plate);
                    ResultSet resultSet = statement.executeQuery();
                    
                    while(resultSet.next()) {
                        sql = "INSERT INTO exits(plate, brand, model, hour, price, entrance_hour) values(?, ?, ?, ?, ?, ?)";
        
                        statement = (PreparedStatement) connection.prepareStatement(sql);

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                        LocalTime currentHours = LocalTime.now();
                        LocalTime entranceHours = LocalTime.parse(resultSet.getString("hour"), formatter);


                        Duration duration;
                        if (currentHours.isBefore(entranceHours)) {
                            duration = Duration.between(currentHours, entranceHours);
                        } else {
                            // Caso a hora atual já tenha passado, calcular para o dia seguinte
                            duration = Duration.between(currentHours, entranceHours.plusHours(24));
                        }

                        long horas = duration.toHours();
                        long minutos = duration.toMinutes() % 60;

                        double total = horas + (minutos / 60.0);

                        // Multiplicando a diferença de horas por 15
                        if (total < 0) {
                            total = total * -1;
                        }
                        double value = total * 15;

                        statement.setString(1, plate);
                        statement.setString(2, resultSet.getString("brand"));
                        statement.setString(3, resultSet.getString("model"));
                        statement.setString(4, currentHours.format(formatter));
                        statement.setString(5, String.valueOf(value)); 
                        statement.setString(6, resultSet.getString("hour"));
                        statement.execute();

                        sql = "DELETE FROM entrance WHERE plate = ?";
                        statement = (PreparedStatement) connection.prepareStatement(sql);
                        statement.setString(1, plate);
                        statement.execute();                      
                    }
                    
                    JOptionPane.showMessageDialog(null, "\nSaída adicionada com sucesso!");
                    EntranceCRUD_DAO.getAll();
                    EntranceCRUD_DAO.clearFields();
                    getAll();
                } else {
                    JOptionPane.showMessageDialog(null, "\nPreencha a placa do carro!", "ERRO!", 0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            } catch (SQLException ex) {
                Logger.getLogger(ExitsCRUD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
        }
    }
    
    public static void cancel(String plate) {
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM exits WHERE plate = ?";
        try {
            if (plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, plate);
                ResultSet resultSet = statement.executeQuery();
             
                while (resultSet.next()) {
                    sql = "INSERT INTO entrance(plate,brand,model,hour) values(?, ?, ?, ?)";
                    statement = (PreparedStatement) connection.prepareStatement(sql);
                    statement.setString(1, resultSet.getString("plate"));
                    statement.setString(2, resultSet.getString("brand"));
                    statement.setString(3, resultSet.getString("model"));
                    statement.setString(4, resultSet.getString("entrance_hour"));
                    statement.execute();
                    
                    sql = "DELETE FROM exits WHERE plate = ?;";
                    statement = (PreparedStatement) connection.prepareStatement(sql);
                    statement.setString(1, resultSet.getString("plate"));
                    statement.execute();
                }
                JOptionPane.showMessageDialog(null, "\nSaída cancelada com sucesso!");
                getAll();
                EntranceCRUD_DAO.getAll();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha a placa do carro!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar entradas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void getAll() {
        exits = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM exits";
        try (PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                exits.add(new Exit_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour"), resultSet.getString("entrance_hour"), resultSet.getDouble("price")));
            }
            load();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar saídas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void update(Exit_DAO exit) {
        Connection connection = Connection_DB.connection();
        String sql = "UPDATE exits SET plate = ?, brand = ?, model = ?, hour = ?, price = ? WHERE plate = ?";
        try {
            if (exit.plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, exit.plate);
                statement.setString(2, exit.brand);
                statement.setString(3, exit.model);
                statement.setString(4, exit.hour);
                statement.setString(5, String.valueOf(exit.price));
                statement.setString(6, exit.plate);
                statement.execute();
                getAll();
                clearFields();
                JOptionPane.showMessageDialog(null, "\nSaída editada com sucesso!");  
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha todos os campos necessários!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar saídas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void getOne(String plate) {
        exits = new ArrayList<>();
        Connection connection = Connection_DB.connection();
        String sql = "SELECT * FROM exits WHERE plate = ?";
        try {
            if (plate.length() > 0) {
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
                statement.setString(1, plate);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Exit_DAO exit = new Exit_DAO(resultSet.getString("plate"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("hour"), resultSet.getString("entrance_hour"), resultSet.getDouble("price"));
                    populateFields(exit);
                    exits.add(exit);
                }
                load();
            } else {
                JOptionPane.showMessageDialog(null, "\nPreencha a placa do carro!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\nErro ao buscar saídas!", "ERRO!", JOptionPane.ERROR_MESSAGE);
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
    
       private static void populateFields(Exit_DAO exit) {
        Home_GUI.plateExit.setText(exit.plate);
        Home_GUI.modelExit.setText(exit.model);
        Home_GUI.brandExit.setText(exit.brand);
        Home_GUI.hourExit.setText(exit.hour);
        Home_GUI.valueExit.setText(String.valueOf(exit.price));
    }
    
}
