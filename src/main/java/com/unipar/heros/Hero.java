/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.heros;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Hero {

    public double hp;
    public double def;
    public double atk;
    public double backStab;
    public double heal;
    private String heroChoice;

    public Hero(double hp, double def, double atk, double backStab, double heal) {
    	this.hp = hp;
    	this.def = def;
    	this.atk = atk;
    	this.backStab = backStab;
    	this.heal = heal;
    	this.heroChoice = heroChoice;
    }
    
    public void heroChoice() {
        heroChoice = JOptionPane.showInputDialog("Escolha seu herói: Knight, Mage ou Rogue");

        if (heroChoice.equalsIgnoreCase("Knight")) {
        	HeroKnight knight = new HeroKnight(65, 15, 0.2, 0, 1);
//            hp = 65;
//            atk = 15;
//            def = 0.2;
//            backStab = 0;
//            heal = 1;
        }
        if (heroChoice.equalsIgnoreCase("Mage")) {
        	HeroMage mage = new HeroMage(55, 20, 0.10, 0, 15);
//            hp = 55;
//            atk = 20;
//            def = 0.10;
//            backStab = 0;
//            heal = 15;
        }
        if (heroChoice.equalsIgnoreCase("Rogue")) {
        	HeroRogue rogue = new HeroRogue(45, 13, 0.08, 1.5, 1);
//            hp = 45;
//            atk = 13;
//            def = 0.08;
//            backStab = 1.5;
//            heal = 1;
        }
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getHeroName() {
        return heroChoice;
    }

    public double getHp() {
        return hp;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }
}
