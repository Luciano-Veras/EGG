/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasyTesteos;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra4Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        double[] alumno = new double[10];

        llenadoVector(alumno);
        System.out.println("");
        resultado(alumno);

    }

    public static double[] llenadoVector(double[] alumno) {
       Scanner sc = new Scanner(System.in);
        int ptp, stp, pi, si;

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("A continuación ingrese las notas del alumno n° " + (i + 1));
            System.out.print("Primer trabajo práctico: ");
            ptp = sc.nextInt();
            System.out.print("Segundo trabajo práctico: ");
            stp = sc.nextInt();
            System.out.print("Primer integrador: ");
            pi = sc.nextInt();
            System.out.print("Segundo integrador: ");
            si = sc.nextInt();
            alumno[i] = ptp * 0.1 + stp * 0.15 + pi * 0.25 + si * 0.5;
        }
        return alumno;
    }

    public static void resultado(double[] alumno) {

        int aprobado = 0, desaprobado = 0;
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados son: " + aprobado);
        System.out.println("La cantidad de alumnos desaprobados son: " + desaprobado);
    }
}