package com.unipar.heros;

public class HeroMage extends Hero {
    private double mageHp = 55;
    private double mageAtk = 17;
    private double mageDef = 0.10;
    
    public HeroMage(){
        super.setHp(mageHp);
        super.setAtk(mageAtk);
        super.setDef(mageDef);
    }
}
