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
public class Catapult extends FightingForce {

    public Catapult() {
        super(100,1);
    }
    @Override
    public String toString() {
        return "\nCataputas:\tAtaque->"+super.getAttack()+"\tDefesa->"+super.getDefense();
    }
    
}
