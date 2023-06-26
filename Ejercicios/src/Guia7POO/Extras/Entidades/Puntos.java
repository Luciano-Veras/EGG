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
public class Puntos {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

   
    
    public Puntos crearPunto(Puntos punto) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de x e y");
        return new Puntos(leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt());
    }
    
    public void distancia(Puntos punto1) {
        double dist = Math.sqrt(Math.pow((punto1.x2 - punto1.x1), 2) + Math.pow((punto1.y2 - punto1.y1), 2));
        System.out.println("La distancia entre los punto es: " + dist);
        
    }
}
