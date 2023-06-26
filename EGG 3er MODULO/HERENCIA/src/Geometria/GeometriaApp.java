/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

import Geometria.Entidades.Circulo;
import Geometria.Entidades.Rectangulo;

/**
 *
 * @author lucho
 */
public class GeometriaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(15, 12);
        System.out.println("El area del rectagulo es: " + rectangulo.calcularArea());
        System.out.println("El area del perimetro es: " + rectangulo.calcularPerimetro());
        
        Circulo circulo = new Circulo(15, 12);
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El area del circulo es: " + circulo.calcularPerimetro());
    }
    
}
