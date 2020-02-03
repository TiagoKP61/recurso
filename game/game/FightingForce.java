/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Objects;

/**
 *
 * @author LEUNAME
 */
public abstract class FightingForce implements Comparable<FightingForce>{
    private int attack = 0;
    private int defense = 0;
    private float lucky = 0;

    public FightingForce(int attack,int defense) {
        this.attack=attack;
        this.defense=defense;
    }
    
    
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public float getLucky() {
        return lucky;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setLucky(float lucky) {
        this.lucky = lucky;
    }

    @Override
    public int compareTo(FightingForce t) {
        return this.defense-t.getDefense();
    }
}
