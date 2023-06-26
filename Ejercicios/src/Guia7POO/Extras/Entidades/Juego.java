/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Juego {
    private int numMaxIntentos = 5;
    private int contIntentos = 0;
    private int contJugador1 = 0;
    private int contJugador2 = 0;
    

    public Juego() {
    }

    public int getContJugador1() {
        return contJugador1;
    }

    public int getContJugador2() {
        return contJugador2;
    }

    public int getContIntentos() {
        return contIntentos;
    }
    
    
    
    
    public void iniciar_Juego() {
        Scanner leer = new Scanner(System.in);
        int numAdivinar = (int) (Math.random() * 10 + 1);
        boolean fin = false;
        System.out.println("Bienvendos al Juago de adivinar el numero");
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombre1 = leer.next();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombre2 = leer.next();
        System.out.println("Llego la hora de adivinar");
        do {
            System.out.print("Jugador 2 ingrese un numero: ");
            int num = leer.nextInt();
            if (num == numAdivinar) {
                System.out.println("Felicitaciones, ha adivinado");
                contJugador2++;
                contIntentos++;
                fin = true;
            } else if (num > numAdivinar) {
                System.out.println("El numero es mas bajo");
                contIntentos++;
                contJugador1++;
            } else {
                System.out.println("El numero es mas alto");
                contIntentos++;
                contJugador1++;
            }
            if (contIntentos == numMaxIntentos) {
                System.out.println("Se agotaron los intentos");
                fin = true;
            }
            
        } while ( fin != true );
        
    }
    
    
}
