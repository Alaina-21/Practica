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
public class Pea extends Animal {
    public String peapea ;
    @Override
    public String getSonido(){
        return peapea;
    }
    
    public Pea (String peapea){
        this.peapea = peapea;
    }
                
    
}
