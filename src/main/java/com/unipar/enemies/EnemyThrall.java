package com.unipar.enemies;

public class EnemyThrall extends Enemies {

    private double thrallHp = 50;
    private double thrallAtk = 12;
    private double thrallDef = 0.10;

    public EnemyThrall() {
        super.setHp(thrallHp);
        super.setAtk(thrallAtk);
        super.setDef(thrallDef);
    }

}
