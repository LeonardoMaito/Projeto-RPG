package com.unipar.enemies;

public class EnemyOrc extends Enemies {

    private double orcHp = 30;
    private double orcAtk = 8;
    private double orcDef = 0.06;

    public EnemyOrc() {
        super.setHp(orcHp);
        super.setAtk(orcAtk);
        super.setDef(orcDef);
    }
}
