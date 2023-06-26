/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Cadena;

import Guia9POO.Cadena.Entidades.Cadena;
import Guia9POO.Cadena.Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio1_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cadenaS =  new CadenaServicio();
        Cadena cadena = cadenaS.crearCadena();
        cadenaS.mostrarVocales(cadena);
        cadenaS.invertirFrase(cadena);
        System.out.println("Ingrese una letra que desea saber las veces que se repite");
        cadenaS.vecesRepetido(cadena, leer.nextLine());
        System.out.println("Ingrese una frase para comparar la longitud con la frase del objeto");
        cadenaS.compararLongitud(cadena, leer.nextLine());
        System.out.println("Ingrese una frase que desea unir a la frase del obejto");
        cadenaS.unirFrase(cadena, leer.nextLine());
        System.out.println("Ingrese una letra que reemplazar la letra a en el objeto");
        cadenaS.reemplazar(cadena, leer.nextLine());
        System.out.println("Ingrese una letra que desea verificar si se encuentra en la frase del objeto");
        boolean verificacion = cadenaS.contiene(cadena, leer.nextLine());
        System.out.println(verificacion);
        System.out.println(cadena.toString());
    }
    
}
