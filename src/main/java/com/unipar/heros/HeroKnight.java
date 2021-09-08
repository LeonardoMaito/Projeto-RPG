package com.unipar.heros;

public class HeroKnight extends Hero {
    private double knightHp = 65;
    private double knightAtk = 15;
    private double knightDef = 0.2;
    
    public HeroKnight(){
        super.setHp(knightHp);
        super.setAtk(knightAtk);
        super.setDef(knightDef);
    }
}
