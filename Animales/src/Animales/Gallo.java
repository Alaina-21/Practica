
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author ALAINA
 */
public class Gallo extends Animal {
    public String quiquiriqui ;
    @Override
    public String getSonido(){
        return quiquiriqui;
    }
    
    public Gallo (String quiquiriqui){
        this.quiquiriqui = quiquiriqui;
    }
    }

