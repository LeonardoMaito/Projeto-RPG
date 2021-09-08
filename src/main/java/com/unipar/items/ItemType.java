/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.items;

import com.unipar.items.Potion;

/**
 *
 * @author Leonardo Maito
 */
public enum ItemType {

    POTION_HP {
        @Override
        public Items getItemType() {
            return new PotionHP();
        }
    },
    POTION_ATK {
        @Override
        public Items getItemType() {
            return new PotionATK();
        }
    },
    POTION_DEF {
        @Override
        public Items getItemType() {
            return new PotionDEF();
        }
    };

    public abstract Items getItemType();
}
