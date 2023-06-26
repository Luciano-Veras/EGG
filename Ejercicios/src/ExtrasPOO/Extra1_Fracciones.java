/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasPOO;

import ExtrasPOO.Entidades.Fracciones;
import ExtrasPOO.Servicios.FraccionesServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra1_Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FraccionesServicio FS = new FraccionesServicio();
        Fracciones fraccion = FS.crearFracciones();
        boolean fin = false;
        do {
            System.out.println("ELIJA OPERACION A REALIZAR");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de las fracciones es: ");
                    FS.sumarFracciones(fraccion);
                    break;
                case 2:
                    System.out.println("La resta de las fracciones es: ");
                    FS.restarFracciones(fraccion);
                    break;
                case 3:
                    System.out.println("La multiplicacion de las fracciones es: ");
                    FS.multiplicarFracciones(fraccion);
                    break;
                case 4:
                    System.out.println("La division de las fracciones es: ");
                    FS.dividirFracciones(fraccion);
                    break;
                case 5:
                    System.out.println("LO ESPERAMOS PRONTO");
                    fin = true;
                    break;
                default:
                    System.out.println("EL NUMERO INGRESADO ES INCORRECTO, INTENTE DE NUEVO");
            }
        } while (fin != true);
        
        System.out.println(fraccion.toString());
    }
    
}
