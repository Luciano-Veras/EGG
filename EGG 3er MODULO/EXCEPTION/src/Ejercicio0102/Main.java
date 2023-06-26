/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0102;

import Ejercicio0102.Entidades.Persona;
import Ejercicio0102.Servicios.PersonaServicio;
import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio aux = new PersonaServicio();

        ArrayList<Persona> list = new ArrayList();

        Persona persona1 = new Persona("Luciano", 25);
        list.add(persona1);

        //// EJERCICIO 1 ////
//        Persona persona2 = null;
//        list.add(persona2);
//        try {
//            for (Persona elementos : list) {
//                System.out.println(aux.esMayorDeEdad(elementos));
//            }
//        } catch (Exception e) {
//            System.out.println("Error : Obejto vacio.\n" + e);
//        }      
        //// EJERCICIO 2 ////
        
        try {
            for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i).getNombre());
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de rango.\n" + e);
        }
        
    }

}
