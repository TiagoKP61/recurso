/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5;

/**
 *
 * @author tiago
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Retangulo {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Retangulo() {
       this.topLeftPoint = new Point();
       this.height = height;
       this.width = width;
    }

    public Retangulo(Point topLetftPoint, double height, double width) {
        this.topLeftPoint = topLetftPoint;
        this.height = height;
        this.width = width;
    }

    Retangulo(Point p, Point p2, Point p3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getHeight() {
        return height;
    }

    public Point getTopLetftPoint() {
        return topLeftPoint;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopLetftPoint(Point topLetftPoint) {
        this.topLeftPoint = topLetftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return (getHeight() * getWidth());
    }
    public double perimetro(){
       return (2*getHeight() + 2*getWidth());  
    }
    public boolean contains(Point point){
        boolean contains = false;
        Point topRightCorner = new Point (topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRightCorner = new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - height());
        Point bottomLeftCorner = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        
        if(point.getX() > topLeftPoint.getX() && point.getX() < topRightCorner.getX()
                && point.getY() > bottomRightCorn)
    }
}