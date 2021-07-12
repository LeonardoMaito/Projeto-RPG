/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipar.map;

import com.unipar.enemies.Enemies;
import java.util.Random;

/**
 *
 * @author Leonardo Maito
 */
public class RandomObjectGenerator {

    private String area = "Vazio", obstaculo = "Obstaculo";

    public String randomObject(Enemies enemies) {

        Random aleatorio = new Random();
        int value = aleatorio.nextInt(3);
        String randomObject = "";

        switch (value) {
            case 0:
                randomObject = enemies.getNameEnemy();
                break;
            case 1:
                randomObject = obstaculo;
                break;

            case 2:
                randomObject = area;
                break;
        }
        return randomObject;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(String obstaculo) {
        this.obstaculo = obstaculo;
    }
}
