/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.enemies;

/**
 *
 * @author Leonardo Maito
 */
public class TrapsHp extends Traps {
    private double trapsHealthHp = 1;
    private double trapsHealthAtk = 10;
    private double trapsHealthDef = 0;
    
    public TrapsHp(){
        super.setHp(trapsHealthHp);
        super.setAtk(trapsHealthAtk);
        super.setDef(trapsHealthDef);
    }
}
