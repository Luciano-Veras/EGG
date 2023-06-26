/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra2.Servicios;

import Guia9POO.Extra2.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author lucho
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] palabra(String palabra){
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i+1).toUpperCase();
        }
        return vector;
    }
    
    public Ahorcado crearJuego(Ahorcado newJuego) {
        System.out.println("Ingrese la palabra secreta");
        String newpalabra = leer.next();
        newJuego.setPalabraSecreta(palabra(newpalabra));
        newJuego.setJugadasMaximas(newpalabra.length());
        String[] vectorEncontrado = new String[newpalabra.length()];
        Arrays.fill(vectorEncontrado, "_");
        newJuego.setVectorEncontrado(vectorEncontrado);
        return newJuego;
        
    }
    
    
    public void mostrarLongitud(Ahorcado newJuego){
        System.out.println("Longitud de la palabra: " + newJuego.getPalabraSecreta().length);
    }
    
    public void buscar(Ahorcado newJuego, String letra) {
        int longitud = newJuego.getPalabraSecreta().length;
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (letra.equalsIgnoreCase(newJuego.getPalabraSecreta()[i])) {
                newJuego.getVectorEncontrado()[i] = letra.toUpperCase();
                cont++;
            }

        }
        if (cont > 0) {
            System.out.println("La letra se encuentra en la palabra " + cont + " veces");
        } else {
            System.out.println("La letra no se encuentra en la plabra");
        }
    }
    
      public boolean encontradas(Ahorcado newJuego, String letra) {
        int cont = 0;
        for (int i = 0; i < newJuego.getPalabraSecreta().length; i++) {
            if (letra.equalsIgnoreCase(newJuego.getPalabraSecreta()[i])) {
                cont++;
            }
        }
        newJuego.setLetrasEncontradas(newJuego.getLetrasEncontradas() + cont);
        System.out.println("Encontraste " + newJuego.getLetrasEncontradas()+ " Letras");
        System.out.println("Faltan encontrar " + ( newJuego.getPalabraSecreta().length - newJuego.getLetrasEncontradas()));
        return cont>0;        
    }
      
      public void intentos(Ahorcado newJuego, String letra) {
          boolean condicion = encontradas(newJuego, letra);
          if (!condicion) {
              newJuego.setJugadasMaximas(newJuego.getJugadasMaximas()-1);
          }
          System.out.println("Quedan: " + newJuego.getJugadasMaximas() + " intentos");
      }
      
      public boolean verficarIngreso(Ahorcado newJuego, String letra) {
          for (int i = 0; i < newJuego.getVectorEncontrado().length; i++) {
              if (newJuego.getVectorEncontrado()[i].equalsIgnoreCase(letra)) {
                  System.out.println("La letra ya fue acertada, ingrese de nuevo");
                  return false;
              }
          }
          return true;
      }
    
    public void juego(Ahorcado newJuego) {
        crearJuego(newJuego);
        do {
            System.out.println(Arrays.toString(newJuego.getVectorEncontrado()));
            mostrarLongitud(newJuego);
            System.out.println("Ingrese una letra");
            String letra;
            boolean condicion;
            do {
                letra = leer.next();
                condicion = verficarIngreso(newJuego, letra);
            } while (condicion != true);
            buscar(newJuego, letra);
            intentos(newJuego, letra);
            

        } while (newJuego.getLetrasEncontradas() < newJuego.getPalabraSecreta().length && newJuego.getJugadasMaximas() > 0);
        if (newJuego.getJugadasMaximas() == 0) {
            System.out.println("Game Over");
        } else {
            System.out.println("Felicitaciones gano!");
            System.out.println(Arrays.toString(newJuego.getPalabraSecreta()));
        }

    }


      

    
}
