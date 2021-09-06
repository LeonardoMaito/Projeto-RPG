/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.EnemyType;
import com.unipar.enemies.TrapType;
import com.unipar.heros.HeroType;
import com.unipar.items.ItemType;

import java.util.Random;
import java.util.TreeMap;

public class Map {

    private TreeMap<String, Object> map = new TreeMap<>();
    private String HERO_POS = "1_0";
    private int maxLineBoxes = 5;
    private int maxColumnBoxes = 5;

    public void addObjectToMap(HeroType hero) {

        map.put(HERO_POS, hero);
        for (int i = 1; i < maxLineBoxes + 1; i++) {
            for (int j = 0; j < maxColumnBoxes + 1; j++) {

                Random aleatorio = new Random();
                int value = aleatorio.nextInt(4);
                int random = aleatorio.nextInt(3);

                switch (value) {
                    case 1:

                        EnemyType enemyType = EnemyType.values()[random];
                        map.put(i + "_" + j, enemyType);

                        break;

                    case 2:

                        TrapType trapType = TrapType.values()[random];
                        map.put(i + "_" + j, trapType);

                        break;

                    case 3:
                        ItemType itemType = ItemType.values()[random];
                        map.put(i + "_" + j, itemType);

                        break;
                }
            }
        }
        printMap();
    }

    public void printMap() {
        System.out.println(map);
    }
}
