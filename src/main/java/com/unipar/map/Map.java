/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.Enemies;
import com.unipar.heros.Hero;
import java.util.HashMap;

public class Map {

    private HashMap<String, String> map = new HashMap<>();
    private String pos = "1_0";

    public void addObjectToMap(Hero hero, Enemies enemies, RandomObjectGenerator random) {

        int sizeMap = 5;

        map.put(pos, hero.getName());

        for (int i = 1; i < sizeMap; i++) {
            map.put("1_" + i, random.randomObject(enemies));
            for (int j = 0; j < sizeMap; j++) {
                map.put("2_" + j, random.randomObject(enemies));
            }
        }
        System.out.println(map);
    }

    public void printMap() {
        System.out.println(map);
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
