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
public class Turismo extends Estudiante {
    public double Amarillo ;
    
    @Override
    public double getColor(){
        return Amarillo;
    }
    
    public Turismo (double Amarillo){
        this.Amarillo = Amarillo;
    }
    }