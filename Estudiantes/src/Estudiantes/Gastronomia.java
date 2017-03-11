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
public class Gastronomia extends Estudiante {
    public double Blanco ;
    
    @Override
    public double getColor(){
        return Blanco;
    }
    
    public Gastronomia (double Blanco){
        this.Blanco = Blanco;
    }
    }