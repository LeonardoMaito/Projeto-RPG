/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.enemies;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Enemies {

    double enemyHP;
    double enemyAttackMax;
    double enemyAttackMin;
    String enemyType;

    static Enemies orc = new Enemies();
    static Enemies goblin = new Enemies();
    static Enemies thrall = new Enemies();

    public void mediumEnemyStatus() {
        orc.enemyType = "Orc";
        orc.enemyHP = 70;
        orc.enemyAttackMax = 40;
        orc.enemyAttackMin = 0;
    }

    public void minorEnemyStatus() {
        goblin.enemyType = "Goblin";
        goblin.enemyHP = 50;
        goblin.enemyAttackMax = 30;
        goblin.enemyAttackMin = 0;
    }

    public void greatEnemyStatus() {
        thrall.enemyType = "Thrall";
        thrall.enemyHP = 100;
        thrall.enemyAttackMax = 50;
        thrall.enemyAttackMin = 25;
    }

    void bossMove() {

        double bossAtk = (Math.random() * ((enemyAttackMax - enemyAttackMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O " + enemyType + " faz sua jogada" + "\n");

        bossAtk = (bossAtk);
        enemyHP = (enemyHP - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f") + "\n");

    }
    
    
    public Enemies getoo(){
        return this;
    }
}
