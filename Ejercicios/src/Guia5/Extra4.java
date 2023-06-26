/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] calificaciones = new String[10][6];
        int[] promedios = new int [2];
        llenadoPlanilla(calificaciones, promedios);
        System.out.println("Planilla de calificaciones");
        mostrarPlanilla(calificaciones);
        System.out.println("");
        System.out.println("La cantidad de aprobados son: " + promedios[0]);
        System.out.println("La cantidad de desaprobados son: " + promedios[1]);
    }
    
    public static void llenadoPlanilla(String[][] calificaciones, int[] promedios) {
        Scanner leer = new Scanner(System.in);
        int contA = 0;
        int contB = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno:" + (i+1));
            double promedio = 0;
            int nota;
            int cont = 1;
            for (int j = 0; j < 6; j++) {
                String elemento = "";
                if (j == 0) {
                    calificaciones[i][j] = "Alumno: " + (i + 1) + " ";
                } else {
                    if (j == 1 || j == 2) {
                        System.out.println("Ingrese calificacion del " + j + " TP");
                        nota = leer.nextInt();
                        elemento += nota;
                        calificaciones[i][j] = elemento;
                        if (j == 1) {
                            promedio += (nota * 0.1);
                        } else {
                            promedio += (nota * 0.15);
                        }
                    } else {
                        if (j == 3 || j == 4){
                            System.out.println("Ingrese la calificacion del " + cont + " parcial");
                            nota = leer.nextInt();
                            elemento += nota;
                            calificaciones[i][j] = elemento;
                            cont++;
                            if (j == 3) {
                                promedio += (nota * 0.25);
                            } else {
                                promedio += (nota * 0.5);
                            }
                        } else {
                            elemento += promedio;
                            calificaciones[i][j] = elemento;
                            if (promedio >= 7) {
                                contA++;
                            } else {
                                contB++;
                            }
                        }
                    }
                }

            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                promedios[i] = contA;
            } else {
                promedios[i] = contB;
            }
        }
    }
    public static void mostrarPlanilla(String[][] calificaciones) {
        for (String[] fila : calificaciones) { 
            for (String columna : fila){
                System.out.print(columna + "|");
            }
            System.out.println("");
        }
    }
}
