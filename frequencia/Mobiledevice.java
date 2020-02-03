/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencia;

import java.util.Comparator;

/**
 *
 * @author tiago
 */
public abstract class Mobiledevice implements Comparator<Mobiledevice> {
    private String brand;
    private String model;
    private int year;
    private int serialNumber;
    private String cpu;
    

    public Mobiledevice() {
    }

    public Mobiledevice(String brand, String model, int year, int serialNumber, String cpu) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getYear() {
        return year;
    }
    
@Override
    public String toString() {
        return"brand: " + brand + ", model: " + model + ", year: " + year + ", serialNumber: " + serialNumber + ", cpu: " + cpu;

    }
 
    
}
