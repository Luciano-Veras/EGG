/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adoptar.Servicio;

import Adoptar.Entidades.Perro;
import Adoptar.Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PersonaServicio {

    public Persona cargarPersona() {
        Persona aux = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Nombre: ");
        aux.setNombre(leer.next());
        System.out.print("Apellido: ");
        aux.setApellido(leer.next());
        System.out.print("DNI: ");
        aux.setDni(leer.nextInt());
        System.out.print("Edad :");
        aux.setEdad(leer.nextInt());
        return aux;
    }

    public void adoptarPerro(Persona aux, ArrayList<Perro> auxL) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del perro que desea adoptar");
        String nombre = leer.next();
        Iterator<Perro> it = auxL.iterator();
        while (it.hasNext()) {
            Perro auxP = it.next();
            if (auxP.getNombre().equalsIgnoreCase(nombre)) {
                aux.setPerro(auxP);
                it.remove();
                break;
            }
        } 
    }
    
    public void mostrarPersona(Persona aux) {
        System.out.println(aux.toString());
    }
}
