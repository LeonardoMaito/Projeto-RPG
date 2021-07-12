/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.movement;

import com.unipar.heros.Hero;
import com.unipar.map.Map;
import com.unipar.map.RandomObjectGenerator;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class Movement {

    public void heroMovement(Hero hero, Map map, RandomObjectGenerator random) {
        String input = JOptionPane.showInputDialog("Digite a posição");
        checkMovement(input,map);
        
        if(checkMovement(input,map)){
        map.getMap().replace(map.getPos(), hero.getName(), random.getArea());
        map.getMap().put(input, hero.getName());
        map.setPos(input);
        }
        else{
            System.out.println("Erro");
        }
    }

    public boolean checkMovement(String input, Map map) {
        
        boolean isMovementPossible = map.getMap().containsKey(input);
        return isMovementPossible;
    }
}
