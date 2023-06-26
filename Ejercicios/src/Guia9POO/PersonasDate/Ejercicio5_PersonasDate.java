/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.PersonasDate;

import Guia9POO.PersonasDate.Entidades.Personas;
import Guia9POO.PersonasDate.Servicios.PersonasServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio5_PersonasDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonasServicio usuarioS = new PersonasServicio();
        Personas[] usuario =  new Personas[2];
        for (int i = 0; i < 2; i++) {
            usuario[i] = usuarioS.crearPersona();
            System.out.println("Codigo de usuario " + i);
        }
        boolean fin = false;
        do {
            System.out.println("BASE DE DATOS" + "\n"
                + "ELIJA UNA OPCION" + "\n"
                + "1 - CALCULAR EDAD" + "\n"
                + "2 - COMPARAR EDAD" + "\n"
                + "3 - VER INFORMACION DE USUARIO" + "\n"
                + "4 - SALIR");
            int opc = leer.nextInt();
            int i;
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el codigo del usuario");
                    i = leer.nextInt();
                    System.out.println(PersonasServicio.calcularEdad(usuario[i]) + " AÑOS");
                    break;
                case 2:
                    System.out.println("Ingrese edad que desea comparar con la de un usuario");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese codigo del usuario");
                    i = leer.nextInt();
                    System.out.println("La edad del usuario es menor?");
                    System.out.println(usuarioS.menorQue(usuario[i], edad));
                    break;
                case 3:
                    System.out.println("Ingrese codigo de usuario cuyos datos desea ver");
                    i = leer.nextInt();
                    usuarioS.mostrarPersona(usuario[i]);
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta vuelva a elejir");
            }
        } while (fin != true);
        
        
        
        
        
        
        
    }
    
}
