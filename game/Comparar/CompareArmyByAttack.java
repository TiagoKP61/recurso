/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparar;

import game.*;
import java.util.Comparator;

/**
 *
 * @author LEUNAME
 */
public class CompareArmyByAttack implements Comparator<FightingForce>{

    /**
     *
     * @param t
     * @param t1
     * @return
     */
    @Override
    public int compare(FightingForce t, FightingForce t1) {
        return t1.getAttack()-t.getAttack();
    }

    
}
