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
    
    public Integer id;
    public String brand;
    public String model;
    public String hour;
    public Double price;

    public Exit_DAO(Integer id, String brand, String model, String hour, Double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.hour = hour;
        this.price = price;
    }
    
    
    
}
