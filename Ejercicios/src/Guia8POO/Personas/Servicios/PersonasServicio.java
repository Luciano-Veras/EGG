/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Personas.Servicios;

import Guia8POO.Personas.Entidades.Personas;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PersonasServicio {
    public Personas crearPersona() {
        Scanner leer = new Scanner(System.in);
        boolean fin;
        Personas person = new Personas();
        System.out.println("Ingrese nombre de la persona");
        person.setNombre(leer.nextLine());
        System.out.println("Ingrese edad de la persona");
        person.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona");
        do {
            String sex = leer.next();
            if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")) {
              person.setSexo(sex);
                fin = true;
            } else {
                System.out.println("Error , ingrese de nuevo");
                fin = false;
            }     
        } while (fin != true);
        System.out.println("Ingrese peso de la persona");
        person.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura de la persona");
        person.setAltura(leer.nextDouble());
        return person;
    }
    
    public boolean esMayorDeEdad(Personas person) {
        if (person.getEdad() > 17) {
            return true;
        } else {
            return false;
        }
    }
    
    public int calcularIMC(Personas person) {
        double IMC = person.getPeso() / (Math.pow(person.getAltura(), 2));
        if (IMC < 20) {
            return -1;
        } else if (IMC < 26) {
            return 0;
        } else {
            return 1;
        }
    }
    
    
}
