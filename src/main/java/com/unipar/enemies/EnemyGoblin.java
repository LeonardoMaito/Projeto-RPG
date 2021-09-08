package com.unipar.enemies;

public class EnemyGoblin extends Enemies{
    private double goblinHp = 20;
    private double goblinAtk = 5;
    private double goblinDef = 0.02;
    
    public EnemyGoblin(){
        super.setHp(goblinHp);
        super.setAtk(goblinAtk);
        super.setDef(goblinDef);
    }
}
