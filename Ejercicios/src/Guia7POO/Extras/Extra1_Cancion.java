/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra1_Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cancion cancion1 = new Cancion();
        System.out.println(cancion1.getTitulo() + " " + cancion1.getAutor());
        
        Cancion cancion2 = new Cancion("Touch Me", "Mees");
        System.out.println(cancion2.getTitulo() + " de, " + cancion2.getAutor());
        
        System.out.println("Nos damos cuenta que el autor de Cancion2 le falta el apellido, se lo incorporamos");
        cancion2.setAutor("Mees Salome");
        System.out.println(cancion2.getTitulo() + " de, " + cancion2.getAutor());
    }
    
}
