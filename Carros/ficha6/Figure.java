/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Figure {
    private ArrayList<Shape>shapes;

    
    public Figure() {
        this.shapes = new ArrayList<>();
    }
    
    public void add (Shape shape){
        this.shapes.add(shape);
    }
    public  ArrayList<Shape> getShapes() {
        return shapes;
    }
    
}
