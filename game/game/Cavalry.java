/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author LEUNAME
 */
public class Cavalry extends FightingForce {
    public Cavalry() {
        super(50,50);
    }

    @Override
    public String toString() {
        return "\nCavalaria:\tAtaque->"+super.getAttack()+"\tDefesa->"+super.getDefense();
    }
    
}
