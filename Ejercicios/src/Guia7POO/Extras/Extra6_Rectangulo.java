/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Rectangulo;



/**
 *
 * @author lucho
 */
public class Extra6_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        Rectangulo r2 = r.crearRectangulo();
        System.out.println(r2.toString());
        r2.calcularArea(r2);
        r2.imprimirArea(r2);
    }
    
}
