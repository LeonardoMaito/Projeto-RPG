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

  
    double bossHp;
    double bossAttackMax;
    double bossAttackMin;
    String bossName;

    public void randomEnemy() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);
      
        switch (value) {
            case 0:
                diaboStatus();               
            case 1:
                diabinhoStatus();
            case 2:
                diabaoStatus();
        }
        System.out.println("Você encontrou o "+ bossName);
    }

    void diaboStatus() {
        bossName = "Diabo";
        bossHp = 70;
        bossAttackMax = 40;
        bossAttackMin = 0;
    }

    void diabinhoStatus() {
        bossName = "Diabinho";
        bossHp = 50;
        bossAttackMax = 30;
        bossAttackMin = 0;
    }

    void diabaoStatus() {
        bossName = "Diabão";
        bossHp = 100;
        bossAttackMax = 50;
        bossAttackMin = 25;
    }
    
    void bossMove() {

        double bossAtk = (Math.random() * ((bossAttackMax - bossAttackMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O "+ bossName + " faz sua jogada" + "\n");

        bossAtk = (bossAtk);
        bossHp = (bossHp - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f" ) + "\n");
        
    }
}
