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
public class Pollito extends Animal {
    public String piopio ;
    @Override
    public String getSonido(){
        return piopio;
    }
    
    public Pollito (String piopio){
        this.piopio = piopio;
    }
}
