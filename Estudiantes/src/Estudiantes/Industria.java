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
public class Industria extends Estudiante {
    public double Azulsubido ;
    
    @Override
    public double getColor(){
        return Azulsubido;
    }
    
    public Industria (double Azulsubido){
        this.Azulsubido = Azulsubido;
    }
    }
    
