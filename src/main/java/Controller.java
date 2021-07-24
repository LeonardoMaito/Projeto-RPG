/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.unipar.menu.Combat;
import com.unipar.enemies.Enemies;
import com.unipar.heros.Hero;
import com.unipar.map.Map;
import com.unipar.map.RandomPositionGenerator;
import com.unipar.menu.PotionCount;
import com.unipar.movement.Movement;

/**
 *
 * @author Pedro Tartari
 */
public class Controller {

    Map maps = new Map();
    Hero hero = new Hero(0, 0, 0, 0, 0);
    Movement move = new Movement();
    RandomPositionGenerator random = new RandomPositionGenerator();
    Enemies enemy = new Enemies();

    Combat menus = new Combat();

    void iniciate() {
        hero.heroChoice();
        maps.addObjectToMap(hero, enemy, random);

        move.heroMovement(hero, maps, random);

    }
}
