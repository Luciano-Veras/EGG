/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Servicios;

import Facultad.Entidades.Empleado;
import Facultad.Entidades.Staff;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class StaffServicio extends EmpleadoServicio {

    @Override
    public Staff crearPersona() {
        System.out.println("CARGAMOS DATOS DEL STAFF");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado aux = super.crearPersona();
        System.out.print("Ingrese a que seccion pertenece: ");
        String seccion = leer.next();
        return new Staff(seccion, aux.getIncorporacion(), aux.getNrodespacho(), aux.getNombre(), aux.getApellido(), aux.getDni(), aux.getEstadoCivil());
    }
    
    public void trasladoSeccion(Staff aux) {
        System.out.print("Ingrese la nueva seccion del staff: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        aux.setSeccion(leer.next());
    }

    
}
