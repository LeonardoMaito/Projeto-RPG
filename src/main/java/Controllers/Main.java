package Controllers;

import com.unipar.heros.Hero;
import com.unipar.heros.HeroType;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.unipar.map.Map;
import com.unipar.movement.Movement;

/**
 *
 * @author Pedro Tartari
 */
public class Main {

    public static void main(String[] args) {

        String[] buttons = {"Knight", "Mage", "Rogue", "Cancel"};
        int returnValue = JOptionPane.showOptionDialog(null, "Escolha um tipo de herói para prosseguir: ", "Escolha de herói", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

        HeroType heroType = HeroType.values()[returnValue];
        Hero hero = heroType.getHeroType();

        Map map = new Map();
        map.addObjectToMap(heroType);
        
        Movement move = new Movement();
        move.heroMovement(heroType,map);
        
        map.printMap();
    }
}
