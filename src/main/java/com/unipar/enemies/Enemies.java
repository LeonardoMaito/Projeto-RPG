/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.enemies;

/**
 *
 * @author Pedro Tartari
 */
public class Enemies {

    private double enemyHP;
    private double enemyAttackMax;
    private double enemyAttackMin;
    private String enemyName;

//    static Enemies orc = new Enemies();
//    static Enemies goblin = new Enemies();
//    static Enemies thrall = new Enemies();

    public Enemies(String enemyName, double enemyHP, double enemyAttackMax, double enemyAttackMin) {
    	this.enemyName = enemyName;
    	this.enemyHP = enemyHP;
    	this.enemyAttackMax = enemyAttackMax;
    	this.enemyAttackMin = enemyAttackMin;
    }
    
    public EnemyOrc mediumEnemyStatus() {
    	EnemyOrc orc = new EnemyOrc("orc", 70, 40, 0);
//        orc.enemyName = "Orc";
//        orc.enemyHP = 70;
//        orc.enemyAttackMax = 40;
//        orc.enemyAttackMin = 0;
    	return orc;
    }

    public EnemyGoblin minorEnemyStatus() {
    	EnemyGoblin goblin = new EnemyGoblin("Goblin", 50, 30, 0);
//        goblin.enemyName = "Goblin";
//        goblin.enemyHP = 50;
//        goblin.enemyAttackMax = 30;
//        goblin.enemyAttackMin = 0;
    	return goblin;
    }

    public EnemyThrall greatEnemyStatus() {
    	EnemyThrall thrall = new EnemyThrall("Thrall", 100, 50, 25);
//        thrall.enemyName = "Thrall";
//        thrall.enemyHP = 100;
//        thrall.enemyAttackMax = 50;
//        thrall.enemyAttackMin = 25;
    	return thrall;
    }

    void bossMove() {

        double bossAtk = (Math.random() * ((enemyAttackMax - enemyAttackMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O " + enemyName + " faz sua jogada" + "\n");

        bossAtk = (bossAtk);
        enemyHP = (enemyHP - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f") + "\n");

    }

//    public EnemyGoblin returnGoblin() {
//        return goblin;
//    }
//
//    public EnemyOrc returnOrc() {
//        return orc;
//    }
//
//    public EnemyThrall returnThrall() {
//        return thrall;
//    }

    public String getEnemyName() {
        return enemyName;
    }

    public double getEnemyHp() {
        return enemyHP;
    }
}
