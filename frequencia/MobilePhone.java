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
public class MobilePhone extends Mobiledevice{
    
    
    private String operator;
    
    public MobilePhone(){
        super();
        this.operator = "G";
    }

    public MobilePhone(String operator, Boolean caneta) {
        this.operator = operator;
    }
       
     public MobilePhone(String brand, String model, int year, int serialNumber, String cpu, String operator) {
        super(brand, model, year, serialNumber, cpu);
        this.operator = operator;
    }
@Override
         public String toString() {
    return super.toString()+ ", operador: " + operator; 
    }

    @Override
    public int compare(Mobiledevice t, Mobiledevice t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
