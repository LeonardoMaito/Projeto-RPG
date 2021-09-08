package com.unipar.heros;

public class HeroRogue extends Hero {

    private double rogueHp = 45;
    private double rogueAtk = 18;
    private double rogueDef = 0.08;

    public HeroRogue() {
        super.setHp(rogueHp);
        super.setAtk(rogueAtk);
        super.setDef(rogueDef);
    }
}
