package com.unipar.combatMenu;

import com.unipar.enemies.Enemies;
import com.unipar.map.Map;
import com.unipar.map.RandomObjectGenerator;
import com.unipar.movement.Movement;

/**
 *
 * @author phtar
 */
public class Menu {

    static Movement move = new Movement();
    static RandomObjectGenerator random = new RandomObjectGenerator();
    static Enemies enemies = new Enemies();
    Map maps = new Map();

    public void rote(String teste) {

        if (teste.equals(random.getEnemies())) {
                enemies.randomEnemy();
        }
        else if (teste.equals(random.getTrapRoom())) {
            System.out.println("2");
        } else {
            System.out.println("tchau");
        }
    }
}
