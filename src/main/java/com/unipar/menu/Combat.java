package com.unipar.menu;

import com.unipar.enemies.Enemies;
import com.unipar.heros.Hero;
import java.util.Scanner;

/**
 *
 * @author phtar
 */
public class Combat {

    private String playerChoice;
    static Hero hero = new Hero();
    static Enemies enemies = new Enemies();

    void start() {
        //Checando se o HP de ambos é acima de 0 para continuar ou acabar o jogo
//        checkCondition();
        //Sem esse IF parece nao funcionar muito bem, melhor deixar
        if (hero.getHeroHP() > 0 && enemies.getObjectGoblin().getEnemyHp() > 0) {
            Scanner choice = new Scanner(System.in);
            System.out.println("Jogada sua: Atacar, Defender ou conferir status");
            playerChoice = choice.nextLine();

//            if (playerChoice.equalsIgnoreCase("Atacar")) {
//                attack();
//            }
//else if (playerChoice.equalsIgnoreCase("Defender")) {
//                //Aumentar a o status de defesa
//                defend();
//                System.out.format("HP defesa atual: " + String.format("%.2f", def) + "\n");
//                bossMove();
//            } 
        }
    }
}
