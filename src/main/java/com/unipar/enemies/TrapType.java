package com.unipar.enemies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Leonardo Maito
 */

public enum TrapType {
    
    TRAPSATK {
        @Override
        public Traps getTrapType() {
            return new TrapsAtk();
        }
    },
    
    TRAPSDEF {
        @Override
        public Traps getTrapType() {
            return new TrapsDef();
        }
    },
    
    TRAPSHP {
        @Override
        public Traps getTrapType() {
            return new TrapsHp();
        }
    };

    public abstract Traps getTrapType();
}


