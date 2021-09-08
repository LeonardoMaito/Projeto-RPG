package com.unipar.movement;
import com.unipar.heros.HeroType;
import com.unipar.map.Map;
import javax.swing.JOptionPane;

/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Maito
 */
public class Movement {

    public void heroMovement(HeroType hero, Map map) {
        String input = JOptionPane.showInputDialog("Digite a posição");
        map.getMap().replace(map.getHERO_POS(), hero, "Searched");
        map.getMap().put(input, hero);
    }
}
