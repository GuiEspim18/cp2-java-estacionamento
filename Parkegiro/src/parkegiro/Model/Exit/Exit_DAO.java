/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkegiro.Model.Exit;

/**
 *
 * @author guiespim
 */
public class Exit_DAO {
    
    public String plate;
    public String brand;
    public String model;
    public String hour;
    public String entranceHour;
    public Double price;
    
    public Exit_DAO(String plate, String brand, String model, String hour, String entranceHour, Double price) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.hour = hour;
        this.entranceHour = entranceHour;
        this.price = price;
    }
    
}
