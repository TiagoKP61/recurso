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
public abstract class cpu {
    private int cores;
    private int bits;
    private int speed;

    public int getBits() {
        return bits;
    }

    public int getCores() {
        return cores;
    }

    public int getSpeed() {
        return speed;
    }

    

  
    
@Override
    public String toString() {
        return"cores: " + cores + ", bits: " + bits + ", cores: " + cores;

    }
 
    
}
