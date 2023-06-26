/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Cafetera;

import Guia8POO.Cafetera.Entidades.Cafetera;
import Guia8POO.Cafetera.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio2_Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cafeS = new CafeteraServicio();
        Cafetera cafe2007A = cafeS.llenarCafetera();
        System.out.println("Ingrese tamaño de la taza");
        cafeS.servirTaza(cafe2007A, leer.nextInt());
        cafeS.vaciarCafetera(cafe2007A);
        System.out.println("Ingrese cantidad de capsulas que desea agregar");
        cafeS.agregarCafe(cafe2007A, leer.nextInt());
        System.out.println(cafeS.estadoCafetera(cafe2007A));     
    }
}
