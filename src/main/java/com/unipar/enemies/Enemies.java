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

    static Enemies orc = new Enemies();
    static Enemies goblin = new Enemies();
    static Enemies thrall = new Enemies();

    public void mediumEnemyStatus() {
        orc.enemyName = "Orc";
        orc.enemyHP = 70;
        orc.enemyAttackMax = 40;
        orc.enemyAttackMin = 0;
    }

    public void minorEnemyStatus() {
        goblin.enemyName = "Goblin";
        goblin.enemyHP = 50;
        goblin.enemyAttackMax = 30;
        goblin.enemyAttackMin = 0;

    }

    public void greatEnemyStatus() {
        thrall.enemyName = "Thrall";
        thrall.enemyHP = 100;
        thrall.enemyAttackMax = 50;
        thrall.enemyAttackMin = 25;
    }

    void bossMove() {

        double bossAtk = (Math.random() * ((enemyAttackMax - enemyAttackMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O " + enemyName + " faz sua jogada" + "\n");

        bossAtk = (bossAtk);
        enemyHP = (enemyHP - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f") + "\n");

    }

    public Enemies getObjectGoblin() {
        return goblin;
    }

    public Enemies getObjectOrc() {
        return orc;
    }

    public Enemies getObjectThrall() {
        return thrall;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public double getEnemyHp() {
        return enemyHP;
    }
}
