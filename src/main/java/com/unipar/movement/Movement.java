/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.movement;

import com.unipar.combatMenu.Menu;
import com.unipar.heros.Hero;
import com.unipar.map.Map;
import com.unipar.map.RandomPositionGenerator;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class Movement {

    public String input;
    Menu menus = new Menu();

    public void heroMovement(Hero hero, Map map, RandomPositionGenerator random) {
        input = JOptionPane.showInputDialog("Digite a posição");
        checkMovement(input,map);
        String keyValue = map.getMap().get(input);
        if (checkMovement(input, map)) {
            map.getMap().replace(map.getPos(), hero.getHeroName(), random.getSearchedRoom());
            map.getMap().put(input, hero.getHeroName());
            map.setPos(input);

            menus.rote(keyValue);

        } else {
            System.out.println("Erro");
        }
    }

    public boolean checkMovement(String input, Map map) {
        boolean isMovementPossible = map.getMap().containsKey(input);
        return isMovementPossible;
    }
}
