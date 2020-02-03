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
public class Car extends Vehicle{
    
    private int doors;
    
    public Car(){
        super();
        this.doors = 0;
    }

    public Car(int doors) {
        this.doors = doors;
    }
    
    

    public Car(int doors, int year, String brand, String model, int price, String color) {
        super(year, brand, model, price, color);
        this.doors = doors;
    }
    
    @Override
    public String toString() {
    return super.toString() + ", Doors: " + doors ; 
    }
}
