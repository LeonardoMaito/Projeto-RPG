/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.movement;

import com.unipar.menu.Combat;
import com.unipar.enemies.Enemies;
import com.unipar.enemies.Traps;
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
    Combat menus = new Combat();
    static RandomPositionGenerator random = new RandomPositionGenerator();
    static Enemies enemies = new Enemies();
    static Hero hero = new Hero();

    public void heroMovement(Hero hero, Map map, RandomPositionGenerator random) {
        input = JOptionPane.showInputDialog("Digite a posição");

        //Captura o que ele escreve e ve o que tem nessa chave, retornando seu valor.
        String keyValue = map.getMap().get(input);

        //Verifica se o valor escrito é correto, se for troca de lugar.
        if (checkMovement(input, map)) {
            map.getMap().replace(map.getPos(), hero.getHeroName(), random.getSearchedRoom());
            map.getMap().put(input, hero.getHeroName());
            map.setPos(input);

            //Ira verifciar o que tem na chave e gerar opções do encontra 
            randomItemSearch(keyValue);
        } else {
            JOptionPane.showMessageDialog(null, "Valor incorreto, digite o correto");
            heroMovement(hero, map, random);
        }

    }

    public void randomItemSearch(String keyValue) {

        if (keyValue.equals(random.getEnemies())) {
            random.randomTypeOfEnemy();
        } else if (keyValue.equals(random.getTrapRoom())) {
            random.randomTypeOfTrap(hero);
        } else {
            System.out.println("random.randomTypeOfItem();");
        }
    }

    public boolean checkMovement(String input, Map map) {
        boolean isMovementPossible = map.getMap().containsKey(input);
        return isMovementPossible;
    }
}
