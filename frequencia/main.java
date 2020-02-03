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

 
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobiledevice MobilePhone = new MobilePhone("sonny", "xperia", 2016, 123456, "ola123", "Meo");
        Mobiledevice Tablet = new Tablet ("Apple", "iPad Air Pro 2", 2017, 876543, "A10", true);
        System.out.println(MobilePhone.toString());
        System.out.println(Tablet.toString());

    }
    
}
