/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Servicios;

import Facultad.Entidades.Empleado;
import Facultad.Entidades.Profesor;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class ProfesorServicio extends EmpleadoServicio {

    @Override
    public Profesor crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CARGAR DATOS DEL PROFESOR");
        Empleado aux = super.crearPersona();
        System.out.print("Ingrese el departamento al que pertenece: ");
        String dpto = leer.next();
        return new Profesor(dpto, aux.getIncorporacion(), aux.getNrodespacho(), aux.getNombre(), aux.getApellido(), aux.getDni(), aux.getEstadoCivil());
    }
    
    public void cambioDepartamento(Profesor aux) {
        System.out.print("Ingrese el nuevo departamento del profesor: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        aux.setDepartamento(leer.next());
    }


}
