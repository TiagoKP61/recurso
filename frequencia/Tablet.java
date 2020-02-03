/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencia;

/**
 *
 * @author tiago
 */
public class Tablet extends Mobiledevice{
    
    
    private Boolean pencil;
    
    public Tablet(){
        super();
        this.pencil = false;
    }

    public Tablet(String operator, Boolean caneta) {
        this.pencil = pencil;
    }
       
     public Tablet(String brand, String model, int year, int serialNumber, String cpu, Boolean pencil) {
        super(brand, model, year, serialNumber, cpu);
        this.pencil = pencil;
    }
@Override
         public String toString() {
    return super.toString()+ ", pencil: " + pencil; 
    }

    @Override
    public int compare(Mobiledevice t, Mobiledevice t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
