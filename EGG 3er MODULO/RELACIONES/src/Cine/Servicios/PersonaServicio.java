/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Servicios;

import Cine.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PersonaServicio {
    
    public Persona crearPersonas() {
        Persona aux = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese Nombre: ");
        aux.setNombre(leer.next());
        System.out.print("Ingrese edad: ");
        aux.setEdad(leer.nextInt());
        System.out.print("Ingrese dinero disponible : $");
        aux.setDineroDisponible(leer.nextInt());
        return aux;
    }
    
    public void mostrarPersona(Persona aux){
        System.out.println(aux.toString());
    }
}
