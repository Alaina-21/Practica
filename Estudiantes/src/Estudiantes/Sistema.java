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
public class Sistema extends Estudiante {
    public double Azulcielo ;
    
    @Override
    public double getColor(){
        return Azulcielo;
    }
    
    public Sistema (double Azulcielo){
        this.Azulcielo = Azulcielo;
    }
    }
