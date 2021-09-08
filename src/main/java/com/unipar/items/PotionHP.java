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
public class PotionHP extends Potion implements PotionInterface {

    private int hpBuff = 10;

    @Override
    public void applyPotionBuff(Hero hero) {
        hero.setHp(hero.getHp() + hpBuff);
        
    }
    
}
