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

    public void randomEnemy() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);

        switch (value) {
            case 0:
                minorEnemyStatus();
            case 1:
                mediumEnemyStatus();
            case 2:
                greatEnemyStatus();
        }
        System.out.println("Você encontrou o " + enemyType);
    }

    void mediumEnemyStatus() {
        enemyType = "Orc";
        enemyHP = 70;
        enemyAttackMax = 40;
        enemyAttackMin = 0;
    }

    void minorEnemyStatus() {
        enemyType = "Goblin";
        enemyHP = 50;
        enemyAttackMax = 30;
        enemyAttackMin = 0;
    }

    void greatEnemyStatus() {
        enemyType = "Thrall";
        enemyHP = 100;
        enemyAttackMax = 50;
        enemyAttackMin = 25;
    }

    void bossMove() {

        double bossAtk = (Math.random() * ((enemyAttackMax - enemyAttackMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O " + enemyType + " faz sua jogada" + "\n");

        bossAtk = (bossAtk);
        enemyHP = (enemyHP - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f") + "\n");

    }
}
