/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.Enemies;
import com.unipar.enemies.Traps;
import com.unipar.heros.Hero;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class RandomPositionGenerator {

    static Enemies enemies = new Enemies();
    static Traps trap = new Traps();

    private String emptyRoom = "Vazio", trapRoom = "Obstaculo", searchedRoom = "Vasculhado",
            enemy = "Inimigo", item = "Poção";

    public String randomObject() {

        Random aleatorio = new Random();
        int value = aleatorio.nextInt(4);
        String randomObject;

        switch (value) {
            case 0:
                return randomObject = enemy;

            case 1:
                return randomObject = trapRoom;

            case 2:
                return randomObject = emptyRoom;

            case 3:
                return randomObject = item;

        }
        return null;
    }

    public void randomTypeOfEnemy() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);

        switch (0) {
            case 0:
                enemies.minorEnemyStatus();
                JOptionPane.showMessageDialog(null, "Você encontrou o " + enemies.getObjectGoblin().getEnemyName());
                break;
            case 1:
                enemies.mediumEnemyStatus();
                JOptionPane.showMessageDialog(null, "Você encontrou o " + enemies.getObjectOrc().getEnemyName());
                break;
            case 2:
                enemies.greatEnemyStatus();
                JOptionPane.showMessageDialog(null, "Você encontrou o " + enemies.getObjectThrall().getEnemyName());
                break;

        }

    }

    public void randomTypeOfTrap(Hero hero) {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);

        switch (value) {
            case 0:
                trap.trapDebuffATK(hero);
                JOptionPane.showMessageDialog(null, "Você caiu na armadilha, perdeu ATK");
                break;
            case 1:
                trap.trapDebuffDEF(hero);
                JOptionPane.showMessageDialog(null, "Você caiu na armadilha, perdeu DEF");
                break;
            case 2:
                trap.trapDebuffHP(hero);
                JOptionPane.showMessageDialog(null, "Você caiu na armadilha, perdeu HP");
                break;
        }
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
