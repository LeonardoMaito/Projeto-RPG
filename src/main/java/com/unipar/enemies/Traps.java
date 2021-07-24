/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.enemies;

import com.unipar.heros.Hero;

/**
 *
 * @author Leonardo Maito
 */
public class Traps {

    private double debuffHp = 10;
    private double debuffAtk = 2;
    private double debuffDef = 0.01;

    public void trapDebuffHP(Hero hero) {
        hero.setHp(hero.getHp() - debuffHp);
    }

    public void trapDebuffATK(Hero hero) {
        hero.setHp(hero.getAtk() - debuffAtk);
    }

    public void trapDebuffDEF(Hero hero) {
        hero.setHp(hero.getDef() - debuffDef);
    }
}
