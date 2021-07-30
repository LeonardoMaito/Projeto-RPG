/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.Enemies;
import com.unipar.heros.Hero;
import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    private TreeMap<String, String> map = new TreeMap<>();
    private String pos = "1_0";
    private int sizeMap = 5;
    private int maxLineBoxes = 5;
    private int maxColumnBoxes = 5;
    

    public void addObjectToMap(Hero hero, Enemies enemies, RandomPositionGenerator random) {

        map.put(pos, hero.getHeroName());
        //FOR THAT GENERATE LINES ACCORDING TO A MAX NUMBER OF "LINE BOXES" SETTED
        for (int i = 1; i < maxLineBoxes + 1; i++) {
        	//after a line is generated...
        	//A FOR THAT GENERATE "COLUMN BOXES" ACCORDING TO A MAX NUMBER SETTED
        	for (int j = 0; j < maxColumnBoxes + 1; j++)
        		map.put(i+"_"+j, random.randomObject());
        }
        printMap();
    }

    public void printMap() {
        System.out.println(map);
    }

    public TreeMap<String, String> getMap() {
        return map;
    }

    public void setMap(TreeMap<String, String> map) {
        this.map = map;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
