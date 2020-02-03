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
public class Infantry extends FightingForce {
    

    public Infantry() {
        super(25, 75);
    }

    @Override
    public String toString() {
        return "\nInfataria:\tAtaque->"+super.getAttack()+"\tDefesa->"+super.getDefense();
    }
    
    
}
