/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.items;

import com.unipar.heros.Hero;

/**
 *
 * @author Leonardo Maito
 */
public class PotionATK extends Potion implements PotionInterface {

    private int atkBuff = 10;

    @Override
    public void applyPotionBuff(Hero hero) {
        hero.setAtk(hero.getAtk() + atkBuff);

    }

}
