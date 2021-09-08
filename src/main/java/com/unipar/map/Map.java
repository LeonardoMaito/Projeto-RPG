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
    private int maxLineBoxes = 6;
    private int maxColumnBoxes = 6;

    public void addObjectToMap(HeroType hero) {

        for (int i = 1; i < maxLineBoxes; i++) {
            for (int j = 1; j < maxColumnBoxes; j++) {

                Random aleatorio = new Random();
                int value = aleatorio.nextInt(2);
                int random = aleatorio.nextInt(2);

                switch (value) {

                    case 0:

                        EnemyType enemyType = EnemyType.values()[random];
                        map.put(i + "_" + j, enemyType);

                        break;

                    case 1:

                        TrapType trapType = TrapType.values()[random];
                        map.put(i + "_" + j, trapType);

                        break;

                    case 2:
                        ItemType itemType = ItemType.values()[random];
                        map.put(i + "_" + j, itemType);

                        break;
                }
            }
        }
        map.put(HERO_POS, hero);
        printMap();
    }

    public void printMap() {
        System.out.println(map);
    }

    public TreeMap<String, Object> getMap() {
        return map;
    }

    public String getHERO_POS() {
        return HERO_POS;
    }

    public void setHERO_POS(String HERO_POS) {
        this.HERO_POS = HERO_POS;
    }
}
