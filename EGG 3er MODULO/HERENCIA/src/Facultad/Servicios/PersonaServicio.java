/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Servicios;

import Facultad.Entidades.Estudiante;
import Facultad.Entidades.Persona;
import Facultad.Entidades.Profesor;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona aux = new Persona();
        System.out.print("Ingrese el nombre: ");
        aux.setNombre(leer.next());
        System.out.print("Ingrese el apellido: ");
        aux.setApellido(leer.next());
        System.out.print("Ingrese DNI: ");
        aux.setDni(leer.nextInt());
        System.out.print("Ingrese estado civil: ");
        aux.setEstadoCivil(leer.next());
        return aux;
    }
    
    public void cambiarEstadocivil(Persona aux){
        if (aux instanceof Estudiante) {
            System.out.println("Cambiar estado civil del estudiante");
        } else if (aux instanceof Profesor) {
            System.out.println("Cambiar estado civil del profesor");
        } else {
            System.out.println("Cambiar estado civil del Staff");
        }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese nuevo estado civil: ");
        aux.setEstadoCivil(leer.next());
    }
}
