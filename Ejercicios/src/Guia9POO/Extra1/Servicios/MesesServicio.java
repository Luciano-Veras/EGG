/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra1.Servicios;

import Guia9POO.Extra1.Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class MesesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public void adivinarMes(Meses Calendario) {
       System.out.println("Adivine el mes secreto, tiene 6 intentos");
       int intentos = 0;
       do {
           String adivinado = leer.next();
           if (adivinado.equalsIgnoreCase(Calendario.getMesSecreto())) {
               System.out.println("Excelente a adivinado el mes");
               intentos = 6;
           } else {
               intentos++;
               if (intentos < 6) {
                   System.out.println("Segui participando, ingrese mes de nuevo");
               } else {
                   System.out.println("Se acabaron los intentos");
               }
           }
       } while (intentos < 6);
       
       
       
   }
}
