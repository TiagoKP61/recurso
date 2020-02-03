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
public class Circle extends Shape{
     private double radius;

    public Circle() {
        super();
        this.radius = 0;  
    }
    

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
  
    
}
