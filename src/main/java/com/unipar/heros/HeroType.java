/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.heros;

/**
 *
 * @author Leonardo Maito
 */
public enum HeroType {
    
    Knight {
        @Override
        public Hero getHeroType() {
            return new HeroKnight();
        }
    },
    
    Mage {
        @Override
        public Hero getHeroType() {
            return new HeroMage();
        }
    },
    
    Rogue {
        @Override
        public Hero getHeroType() {
            return new HeroRogue();
        }
    };

    public abstract Hero getHeroType();
}
