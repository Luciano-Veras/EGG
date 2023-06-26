/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String fin;
        do {
            System.out.println("Ingrese el monto a cambiar en euros");
            double euros = leer.nextInt();
            System.out.println("Elija moneda que desea recibir");
            System.out.print("Introduce la moneda a la que quieres convertir (libras/yenes/dolar): ");
            String conversion = leer.next();
            cambio(euros, conversion);
            System.out.println("Desea seguir cambiando S/N");
            fin = leer.next();
        } while (fin.equalsIgnoreCase("s"));
    }
    public static void cambio (double euros, String conversion){
        double  resultado = 0;
        String mensaje = "";
        switch (conversion) {
            case "libras":
                resultado = euros * 0.86;
                mensaje = euros + "euros son: " + resultado + " libras";
                break;
            case "yenes":
                resultado = euros * 129.852;
                mensaje = euros + "euros son: " + resultado + " yenes";
                break;
            case "dolar":
                resultado = euros * 1.28611;
                mensaje = euros + "euros son: " + resultado + " dolar";
                break;
            default:
                mensaje = "La moneda ingresada es invalida";
        }
          System.out.println(mensaje);
    }
}
