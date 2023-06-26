/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Cadena.Servicios;

import Guia9POO.Cadena.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CadenaServicio {
    Scanner leer =  new Scanner(System.in);
    
    public Cadena crearCadena() {
        System.out.println("Ingrese una frase");
        Cadena newcadena =  new Cadena(leer.nextLine());
        return newcadena;
    }
    
    public void mostrarVocales(Cadena newcadena) {
        int cantVocales = 0;
        for (int i = 0; i < newcadena.getLongitud(); i++) {
            String letra = newcadena.getFrase().substring(i, i + 1);
            switch (letra.toLowerCase()) {
                case "a":
                    cantVocales++;
                    break;
                case "e":
                    cantVocales++;
                    break;
                case "i":
                    cantVocales++;
                    break;
                case "o":
                    cantVocales++;
                    break;
                case "u":
                    cantVocales++;
                    break;
            }
        }
        System.out.println("La cantidad de vocales que tiene la frase es: " + cantVocales);
    }
    
    public void invertirFrase(Cadena newcadena) {
        String invertFrase = "";
        for (int i = newcadena.getLongitud(); i > 0; i--) {
            invertFrase += newcadena.getFrase().substring(i - 1, i );
        }
        System.out.println("Mostramos la frase invertida");
        System.out.println(invertFrase);
        //StringBuilder sb = new StringBuilder(frase);
        //String invertida = sb.reverse().toString();
    }
    
    public void vecesRepetido(Cadena newcadena, String letra) {
        int contLetra = 0;
        for (int i = 0; i < newcadena.getLongitud(); i++) {
            if (newcadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contLetra++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + contLetra + " veces");
    }
    
    public void compararLongitud(Cadena newcadena, String frase) {
        int newlong = frase.length();
        System.out.println("El objeto Cadena creado tiene una longitud de " + newcadena.getLongitud());
        System.out.println("La frase ingresada por el usuario tiene una longitud de " + newlong);
    }
    
    public void unirFrase(Cadena newcadena, String frase) {
        String origin = newcadena.getFrase() + " ";
        for (int i = 0; i < frase.length(); i++) {
         String add = frase.substring(i, i +1);
         origin += add;
        }
        //String unida = newcadena.getFrase().concat(" ").concat(frase);
        System.out.println("Unimos las frases");
        System.out.println(origin);
    }
    
    public void reemplazar(Cadena newcadena, String letra) {
       String origin = "";
       String add = letra;
        for (int i = 0; i < newcadena.getLongitud(); i++) {
            if (newcadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                origin += letra;
            } else {
                origin += newcadena.getFrase().substring(i, i + 1);
            }
        }
        System.out.println(origin);
    }
    
    public boolean contiene(Cadena newcadena, String letra) {
        int cont = 0;
        for (int i = 0; i < newcadena.getLongitud(); i++) {
            if (newcadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
                break;
            }
        }
        if (cont > 0) {
            return true;
        } else {
            return false;
        }
    }
}
