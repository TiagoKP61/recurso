/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6;

/**
 *
 * @author tiago
 */
public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private int price;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int year, String brand, String model, int price, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
       @Override
    public String toString() {
        return"year: " + year + ", Brand: " + brand + ", Color: " + color + ", Price: " + price + ", model: " + model;
    }

    
}
