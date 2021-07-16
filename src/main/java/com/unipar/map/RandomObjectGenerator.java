/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.Enemies;
import java.util.Random;

/**
 *
 * @author Leonardo Maito
 */
public class RandomObjectGenerator {

    private String empetyRoom = "Vazio", trapRoom = "Obstaculo", searchedRoom = "Vasculhado", enemies = "Inimigo";

    public String randomObject() {

        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);
        String randomObject = "";

        switch (value) {
            case 0:
                randomObject = enemies;
                break;
            case 1:
                randomObject = trapRoom;
                break;

            case 2:
                randomObject = empetyRoom;
                break;
        }
        return randomObject;
    }

    
    
    
    
//    Get and Set
    public String getTrapRoom(){
        return trapRoom;
    }
    public String getEmpetyRoom(){
        return empetyRoom;
    }
    
    public String getSearchedRoom() {
        return searchedRoom;
    }
    public String getEnemies(){
        return enemies;
    }

}
