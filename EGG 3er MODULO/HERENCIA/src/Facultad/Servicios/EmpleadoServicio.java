/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Servicios;

import Facultad.Entidades.Empleado;
import Facultad.Entidades.Persona;
import Facultad.Entidades.Profesor;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class EmpleadoServicio extends PersonaServicio {

    @Override
    public Empleado crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona aux = super.crearPersona();
        System.out.print("Ingrese año de incorporacion: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese numero de despacho: ");
        int nro = leer.nextInt();
        return new Empleado(anio, nro, aux.getNombre(), aux.getApellido(), aux.getDni(), aux.getEstadoCivil());
    }
    
    public void reasignarDespacho(Empleado aux){
         if (aux instanceof Profesor) {
            System.out.println("Cambiar el nro de despacho del profesor");
        } else {
            System.out.println("Cambiar el nro de despacho del Staff");
        }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese nuevo numero de despacho: ");
        aux.setNrodespacho(leer.nextInt());
    }
    
}
