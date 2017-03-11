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
public class Administracion extends Estudiante {
    public double Rojo ;
    
    @Override
    public double getColor(){
        return Rojo;
    }
    
    public Administracion (double Rojo){
        this.Rojo = Rojo;
    }
    }
