/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import Comparar.CompareArmyByAttack;
import Comparar.CompareArmyByDefense;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author LEUNAME
 */
public class Army {

    private ArrayList<FightingForce> attackForces;
    private ArrayList<FightingForce> defenseForces;

    public Army() {
    }

    public Army(int attCat, int attCav, int attInf, int defCat, int defCav, int defInf) {
        attackForces = new ArrayList<FightingForce>();
        defenseForces = new ArrayList<FightingForce>();
        for (int i = 0; i < attCat; i++) {
            this.attackForces.add(new Catapult());
        }
        for (int j = 0; j < attCav; j++) {
            this.attackForces.add(new Cavalry());
        }
        for (int l = 0; l < attInf; l++) {
            this.attackForces.add(new Infantry());
        }
        for (int i1 = 0; i1 < defCat; i1++) {
            this.defenseForces.add(new Catapult());
        }
        for (int j1 = 0; j1 < defCav; j1++) {
            this.defenseForces.add(new Cavalry());
        }
        for (int l1 = 0; l1 < defInf; l1++) {
            this.defenseForces.add(new Infantry());
        }
    }

    public void addAttack(FightingForce attack) {
        this.attackForces.add(attack);
    }

    public void addDefense(FightingForce defense) {
        this.defenseForces.add(defense);
    }

    public ArrayList<FightingForce> getAttackForces() {
        return attackForces;
    }

    public ArrayList<FightingForce> getDefenseForces() {
        return defenseForces;
    }

    public void OrganizeDef() {
        Collections.sort(this.defenseForces, new CompareArmyByDefense());
    }

    public void OrganizeAtt() {
        Collections.sort(this.attackForces, new CompareArmyByAttack());
    }

    public int CalculateAttackForce() {
        int Power = 0;
        for (int i = 0; i < getAttackForces().size(); i++) {
            Power += getAttackForces().get(i).getAttack();
        }
        return Power;
    }

    public int CalculateDefenseForce() {
        int Power = 0;
        for (int i = 0; i < getDefenseForces().size(); i++) {
            Power += getDefenseForces().get(i).getDefense();
        }
        return Power;
    }

    public void CalculateLucky() {
        for (int i = 0; i < getAttackForces().size(); i++) {
            getAttackForces().get(i).setLucky((float) Math.random());
        }
    }

    
    public int realAttackForce() {
        float power = 0;
        for (int i = 0; i < getAttackForces().size(); i++) {
            power += getAttackForces().get(i).getLucky() * getAttackForces().get(i).getAttack();
        }
        return (int) power;
    }

    public void removeDefense(int damage) {
        for (int i = 0; i < getDefenseForces().size(); i++) {
            if (getDefenseForces().get(i).getDefense() < damage) {
                damage -= getDefenseForces().get(i).getDefense();
                getDefenseForces().remove(i);
                i--;
            } else if (getDefenseForces().get(i).getDefense() > damage && damage > 0) {
                getDefenseForces().get(i).setDefense((getDefenseForces().get(i).getDefense() - damage));
                damage = 0;
                i--;
            }
        }
    }

    public void Attack(Army b) {
        b.OrganizeDef();
        CalculateLucky();
        b.removeDefense(realAttackForce());
    }
}
