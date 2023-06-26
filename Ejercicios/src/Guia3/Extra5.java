/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String  nombre = leer.nextLine();
        System.out.println("Bienvido " + nombre.toUpperCase());
        System.out.println("");
        boolean finClase = false;
        String clase;
        do {
            System.out.println("Ingrese la clase de la obra social en la que se encuentra afiliado A / B / C");
            char c = leer.next().toUpperCase().charAt(0);
            clase = String.valueOf(c);
            if (clase.equals("A") || clase.equals("B") || clase.equals("C")) {
                finClase = true;
            } else {
                System.out.println("La clase seleccionada no exite");
                System.out.println("");
            }
        } while (!finClase == true);
        double descuento = 0;
        switch (clase) {
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
        }
        double  tomografia = 10000, radiografia = 15000, analisis = 20000;
        int opcion;
        boolean finOpcion = false;
        do {
            System.out.println("Elija el tratamiento que desea realizar");
            System.out.println("");
            System.out.println("1-TOMOGRAFIA:");
            System.out.println("Precio de lista: $" + tomografia);
            System.out.println("2-RADIOGRAFIA:");
            System.out.println("Precio de lista: $" + radiografia);
            System.out.println("3-ANALISIS:");
            System.out.println("Precio de lista: $" + analisis);
            opcion = leer.nextInt();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                finOpcion = true;
            } else {
                System.out.println("Opcion incorrecta, intente de nuevo");
            }
        } while (!finOpcion == true);
        if ( clase.equals("C") ) {
            System.out.println("Su clase de obra social no brinda descuento");
            switch (opcion) {
                case 1:
                    System.out.println("El costo de su tratamiento es: $" + tomografia );
                    break;
                case 2:
                    System.out.println("El costo de su tratamiento es: $" + radiografia );
                    break;
                case 3:
                    System.out.println("El costo de su tratamiento es: $" + analisis );
                    break;
            }

        } else {
            System.out.println("So clase de obra social le brinda un descuento de: %" + (descuento * 100));
            switch (opcion) {
                case 1:
                    System.out.println("El costo de su tratamiento es: $" + (tomografia - (tomografia * descuento)));
                    break;
                case 2:
                    System.out.println("El costo de su tratamiento es: $" + (radiografia - (radiografia * descuento)));
                    break;
                case 3:
                    System.out.println("El costo de su tratamiento es: $" + (analisis - (analisis * descuento)));
                    break;
            }
        }
        System.out.println("");
        System.out.println("Muchas gracias, lo esperamos pronto");
    }
    
}
