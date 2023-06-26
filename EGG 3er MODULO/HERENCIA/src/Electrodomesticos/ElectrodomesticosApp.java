/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

import Electrodomesticos.Entidades.Electrodomesticos;
import Electrodomesticos.Entidades.Lavadora;
import Electrodomesticos.Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucho
 */
public class ElectrodomesticosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        lavadora1.precioFinal(lavadora1);
        System.out.println(lavadora1.getConsumoEnergetico());
        System.out.println(lavadora1.getColor());
        System.out.println("El precio final es: $" + lavadora1.getPrecio());
        
        System.out.println("------------------");
        
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        televisor1.precioFinal(televisor1);
        System.out.println(televisor1.getConsumoEnergetico());
        System.out.println(televisor1.getColor());
        System.out.println("El precio final es: $" + televisor1.getPrecio());
//        List<Electrodomesticos> electrodomesticos = new ArrayList();
//
//        Lavadora lavadora1 = new Lavadora(35, 1500, "Azul", 'A', 18);
//        
//        electrodomesticos.add(lavadora1);
//        Lavadora lavadora2 = new Lavadora(20, 2000, "Negro", 'F', 55);
//        electrodomesticos.add(lavadora2);
//        Televisor televisor1 = new Televisor(39, true, 2500, "Blanco", 'E', 25);
//        electrodomesticos.add(televisor1);
//        Televisor televisor2 = new Televisor(45, false, 3000, "Amarillo", 'B', 80);
//        electrodomesticos.add(televisor2);
//
//        for (Electrodomesticos elementos : electrodomesticos) {
//            if (elementos instanceof Lavadora) {
//                System.out.println("LAVADORA");
//                Lavadora object = (Lavadora) elementos;
//                object.precioFinal(object);
//                System.out.println("El precio final es: $" + object.getPrecio());
//            }
//            if (elementos instanceof Televisor) {
//                System.out.println("TELEVISOR");
//                Televisor aux = (Televisor) elementos;
//                aux.precioFinal(aux);
//                System.out.println("El precio final es: $" + aux.getPrecio());
//            }
//
//        }
//
//        double preciolavadoras = 0;
//        double preciotelevisores = 0;
//        double precioelectrodomesticos = 0;
//
//        for (Electrodomesticos elementos : electrodomesticos) {
//            if (elementos instanceof Lavadora) {
//                preciolavadoras += elementos.getPrecio();
//            }
//            if (elementos instanceof Televisor) {
//                preciotelevisores += elementos.getPrecio();
//            }
//            precioelectrodomesticos += elementos.getPrecio();
//        }
//
//        System.out.println("El precio de todas las lavadoras es: $" + preciolavadoras);
//        System.out.println("El precio de todos los televisores es: $" + preciotelevisores);
//        System.out.println("El precio de todos los electrodomesticos es: $" + precioelectrodomesticos);
//
    }

}
