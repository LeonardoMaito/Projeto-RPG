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
public class TrapsDef extends Traps {

    private double trapsDefHp = 1;
    private double trapsDefAtk = 10;
    private double trapsDefDef = 0;

    public TrapsDef() {
        super.setHp(trapsDefHp);
        super.setAtk(trapsDefAtk);
        super.setDef(trapsDefDef);
    }
}
