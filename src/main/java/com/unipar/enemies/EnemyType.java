/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.enemies;

/**
 *
 * @author Leonardo Maito
 */
public enum EnemyType {

    Goblin {
        @Override
        public Enemies getEnemyType() {
            return new EnemyGoblin();
        }
    },
    Orc {
        @Override
        public Enemies getEnemyType() {
            return new EnemyOrc();
        }
    },
    Thrall {
        @Override
        public Enemies getEnemyType() {
            return new EnemyThrall();
        }
    };

    public abstract Enemies getEnemyType();

}
