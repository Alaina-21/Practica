/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

/**
 *
 * @author ALAINA
 */
public class Energias extends Estudiante {
    public double Negro ;
    
    @Override
    public double getColor(){
        return Negro;
    }
    
    public Energias (double Negro){
        this.Negro = Negro;
    }
    }

