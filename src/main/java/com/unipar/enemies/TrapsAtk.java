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
public class TrapsAtk extends Traps {

    private double trapsAtkHp = 1;
    private double trapsAtkAtk = 10;
    private double trapsAtkDef = 0;

    public TrapsAtk() {
        super.setHp(trapsAtkHp);
        super.setAtk(trapsAtkAtk);
        super.setDef(trapsAtkDef);
    }

}
