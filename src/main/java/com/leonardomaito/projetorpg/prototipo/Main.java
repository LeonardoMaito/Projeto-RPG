/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.projetorpg.prototipo;

/**
 *
 * @author Leonardo Maito
 */
public class Main {
    
    public static void main(String[] args) {
        ObjetoTeste dummy = new ObjetoTeste();      
        Mapa teste = new Mapa();
        teste.posicionar(dummy);
        teste.brincadeira(dummy);
    }
    
}
