/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.menu;

import com.unipar.heros.Hero;

/**
 *
 * @author Leonardo Maito
 */
public class PotionCount {

    private double hpPotionHeal = 10;
    private int potionAmount = 0;

    public void getPotionHeal(Hero hero) {
        if (potionAmount > 0) {
            hero.setHp(hero.getHp() + hpPotionHeal);
            potionAmount--;
            System.out.println("Poção utilizada, HP aumentado em: " + hpPotionHeal);
        }
    }
}
