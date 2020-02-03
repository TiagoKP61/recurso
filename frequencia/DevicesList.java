/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencia;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author tiago
 */
public class DevicesList {
        private ArrayList<Mobiledevice> MobilePhone;
        private ArrayList<Mobiledevice> Tablet;

    public DevicesList() {
    }

    public DevicesList(int Mobiles, int Tablets) {
        MobilePhone = new ArrayList<Mobiledevice>();
        Tablet = new ArrayList<Mobiledevice>();
    }
        
       public void addMobilePhone(Mobiledevice Mobile) {
        this.MobilePhone.add(Mobile);
       }
        public void addMobileTablet(Mobiledevice Tablet) {
        this.MobilePhone.add(Tablet);
    }
}