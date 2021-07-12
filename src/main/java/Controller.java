/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.unipar.enemies.Enemies;
import com.unipar.heros.Hero;
import com.unipar.map.Map;
import com.unipar.map.RandomObjectGenerator;
import com.unipar.movement.Movement;
import java.util.HashMap;

/**
 *
 * @author Pedro Tartari
 */
public class Controller {

    Map maps = new Map();
    Hero hero = new Hero();
    Movement move = new Movement();
    RandomObjectGenerator random = new RandomObjectGenerator();
    Enemies enemy = new Enemies();

    void iniciate() {
        maps.addObjectToMap(hero, enemy, random);
        move.heroMovement(hero, maps, random);
        maps.printMap();
    }
}
