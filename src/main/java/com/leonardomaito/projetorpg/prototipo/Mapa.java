package com.leonardomaito.projetorpg.prototipo;

import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

public class Mapa {

    HashMap<String, Object> map = new HashMap<>();
    ObjetoTeste area = new ObjetoTeste();  
    String pos;

    public ObjetoTeste random() {
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(4);
        area.name  = "vazio";
        return area;
    }

    public void posicionar(ObjetoTeste dummy) {
        pos = "1_0";
        dummy.name = "heroi";
        map.put(pos, dummy);

        for (int i = 1; i < 5; i++) {
            map.put("1_" + i, random());
        }
        // Print size and content
        System.out.println("Size of map is: " + map.size());
        System.out.println(map.toString());
    }

    public void brincadeira(ObjetoTeste dummy) {
        
        //contains key e value para o if
        String input = JOptionPane.showInputDialog("Digite a posição");
        if (map.containsValue(dummy)) {
            map.get(pos);
            map.replace(pos, dummy, area);
        }
        map.put(input, dummy);
        pos = input;
        System.out.println(map.toString());
    }
}
