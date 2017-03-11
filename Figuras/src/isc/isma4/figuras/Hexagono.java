/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author ALAINA
 */
public class Hexagono extends Figura {
    public double perimetro;
    public double apotema;
    public double lado;
    @Override
    public double getArea(){
        return (perimetro*apotema)/2;
    } 
    public double getperimetro(){
        return lado*6;
        
    }
    public Hexagono(double perimetro, double apotema, double lado) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.lado = lado;
    }
    }
    
