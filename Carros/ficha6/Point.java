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
public class Point {
        private double x;
        private double y;
        
   public Point(){
       x= 0.0;
       y = 0.0;

   }
   public Point(double x, double y){
       this.x = x;
       this.y = y;
   }
   public double getX(){
    return x;
}
   public double getY(){
       return y;
   }
   public void setX(){
       this.x=x;
   }
    public void setY(){
       this.y=y;
   }
     public void setXY(){
       this.x=x;
       this.y=y;
   }
     public double distance(Point b){
         return Math.sqrt(Math.pow((b.x - this.x), 2)+ Math.pow((b.y - this.y), 2));
                 
     }
}

