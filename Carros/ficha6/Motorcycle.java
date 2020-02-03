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
public class Motorcycle extends Vehicle{
        private int visor;
        
        public Motorcycle (){
            super();
            this.visor = 0;
        }

    public Motorcycle(int visor) {
        this.visor = visor;
    }
        

    public Motorcycle(int visor, int year, String brand, String model, int price, String color) {
        super(year, brand, model, price, color);
        this.visor = visor;
    }
         @Override
    public String toString() {
         return super.toString() + ", Visor: " + visor;
    }
}
