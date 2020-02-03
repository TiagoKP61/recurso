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
public class Triangle extends Shape{
    private double altura;
    private double lado;
    private double base;

    public Triangle() {
        super();
        this.altura= 0;
        this.lado = 0;
        this.base = 0;
    }

    public Triangle(double lado1, double lado2, double base) {
        this.altura = lado1;
        this.lado = lado2;
        this.base = base;
    }

    public Triangle(double lado1, double lado2, double base, Point position) {
        super(position);
        this.altura = lado1;
        this.lado = lado2;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   
    
    
   
}
