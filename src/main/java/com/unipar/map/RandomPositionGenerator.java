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
public class RandomPositionGenerator {

    static Enemies enemies = new Enemies();
    private String emptyRoom = "Vazio", trapRoom = "Obstaculo", searchedRoom = "Vasculhado", enemy = "Inimigo";

    public String randomObject() {

        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);
        String randomObject;

        switch (value) {
            case 0:
                return randomObject = enemy;

            case 1:
                return randomObject = trapRoom;

            case 2:
                return randomObject = emptyRoom;

        }
        return null;
    }

    public void randomTypeOfEnemy() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);

        switch (value) {
            case 0:
                enemies.minorEnemyStatus();
            case 1:
                enemies.mediumEnemyStatus();
            case 2:
                enemies.greatEnemyStatus();
        }
        System.out.println("Você encontrou o " + enemies.getoo());
    }

    //Get and Set
    public String getTrapRoom() {
        return trapRoom;
    }

    public String getEmptyRoom() {
        return emptyRoom;
    }

    public String getSearchedRoom() {
        return searchedRoom;
    }

    public String getEnemies() {
        return enemy;
    }
}
