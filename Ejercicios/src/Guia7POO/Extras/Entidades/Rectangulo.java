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
public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese el lado 1");
        r1.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado 2");
        r1.setLado2(leer.nextInt());
        return r1;
    }
    
    public void calcularArea(Rectangulo r1) {
        System.out.println("El area del rectangulo es: ");
        int area = r1.getLado1() * r1.getLado2();
        System.out.println(area + " m2");
    }
    
    public void imprimirArea(Rectangulo r1) {
        String[][] array = new String[r1.getLado1()][r1.getLado2()];
        for (int i = 0; i < r1.getLado1(); i++) {
            for (int j = 0; j < r1.getLado2(); j++) {
                if (i == 0 || i == r1.getLado1()-1) {
                    array[i][j] = "*";
                } else if (j == 0 || j == r1.getLado2()-1) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = " ";
                }
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
