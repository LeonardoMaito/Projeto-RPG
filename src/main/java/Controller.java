/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.unipar.heros.Hero;
import com.unipar.map.Map;

/**
 *
 * @author Pedro Tartari
 */
public class Controller {
    
    Map maps = new Map();
    Hero heros = new Hero();
    
    void iniciate(){
        
        //Mapa
        maps.addObjetoToMap();
    }
    
}
