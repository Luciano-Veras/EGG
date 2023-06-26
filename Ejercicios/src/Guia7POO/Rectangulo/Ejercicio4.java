/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Rectangulo;

import Guia7POO.Rectangulo.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo figura =  new Rectangulo(5,5);
        System.out.println(figura.getBase() + " " + figura.getAltura());
        
        System.out.println("Ingrese la base y la altura del rectangulo");
        
        //figura = figura.crearRectangulo(leer.nextInt(), leer.nextInt());
        
        figura.setBase(leer.nextInt());
        figura.setAltura(leer.nextInt());
        
        System.out.println(figura.getBase() + " " + figura.getAltura());
        
        System.out.println("La superficie de la figura es: " + figura.superficie(figura));
        System.out.println("");
        System.out.println("El perimetro de la figura es: " + figura.perimetro(figura));
        
        System.out.println("Representacion grafica");
        
        figura.grafico(figura);
        
    }
    
}
