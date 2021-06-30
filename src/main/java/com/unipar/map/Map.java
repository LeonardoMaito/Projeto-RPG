/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemys.Enemy;
import com.unipar.heros.Hero;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Map {

    Hero heros = new Hero();
    Enemy enemys = new Enemy();
    HashMap<String, String> mapLineOne = new HashMap<>();
    HashMap<String, String> mapLineTwo = new HashMap<>();
//    public void captureNewPosition(){
//         //contains key e value para o if
//        String input = JOptionPane.showInputDialog("Digite a posição");
//        if (mapHash.containsValue(dummy)) {
//            mapHash.get(pos);
//            mapHash.replace(pos, dummy, area);
//        }
//        mapHash.put(input, dummy);
//        pos = input;
//        System.out.println(mapHash.toString());
//    }

    public String randomObject() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(2);
        String randomObject = "";

        switch (value) {
            case 0:
                randomObject = enemys.getNameEnemy();
                break;
            case 1:
                randomObject = "Vazio";
                break;
        }

        return randomObject;
    }

    public void addObjetoToMap() {
        int sizeMap = 5;
        mapLineOne.put("1_0", heros.getNameHero());

        for (int i = 1; i < sizeMap; i++) {
            mapLineOne.put("1_" + i, randomObject());
            if (i == 4) {
                for (int j = 0; j < sizeMap; j++) {
                     mapLineTwo.put("2_" + j, randomObject());
                }
            }
        }

        // Print size and content
        System.out.println("Size of mapHash is:- "
                + mapLineOne.size());
        System.out.println(mapLineOne + "\n" + mapLineTwo);
    }
}
