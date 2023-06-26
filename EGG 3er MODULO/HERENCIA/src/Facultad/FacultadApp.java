/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import Facultad.Entidades.Empleado;
import Facultad.Entidades.Estudiante;
import Facultad.Entidades.Persona;
import Facultad.Entidades.Profesor;
import Facultad.Entidades.Staff;
import Facultad.Servicios.EmpleadoServicio;
import Facultad.Servicios.EstudianteServicio;
import Facultad.Servicios.PersonaServicio;
import Facultad.Servicios.ProfesorServicio;
import Facultad.Servicios.StaffServicio;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucho
 */
public class FacultadApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> datos = new ArrayList();
       
        ProfesorServicio auxProfesor = new ProfesorServicio();
        Profesor profesor1 = auxProfesor.crearPersona();
        datos.add(profesor1);
        
        System.out.println("");
        
        StaffServicio auxStaff = new StaffServicio();
        Staff staff1 = auxStaff.crearPersona();
        datos.add(staff1);
        
        System.out.println("");
        
        EstudianteServicio auxEstudiante = new EstudianteServicio();
        Estudiante estudiante1 = auxEstudiante.crearPersona();
        datos.add(estudiante1);
        
        System.out.println("");
        
        PersonaServicio auxPersona = new PersonaServicio();
        for (Persona elementos : datos) {
            auxPersona.cambiarEstadocivil(elementos);
        }
        
        System.out.println("");
        
        EmpleadoServicio auxEmpleado = new EmpleadoServicio();
        for (Persona elementos : datos) {
            if (elementos instanceof Empleado) {
                Empleado aux = (Empleado) elementos;
                auxEmpleado.reasignarDespacho(aux);
            }
        }
        
        System.out.println("");
        
        for (Persona elementos : datos) {
            if (elementos instanceof Estudiante) {
                Estudiante aux = (Estudiante) elementos;
                auxEstudiante.cambiarCurso(aux);
            }
        }
        
        System.out.println("");
        
        for (Persona elementos : datos) {
            if (elementos instanceof Profesor) {
                Profesor aux = (Profesor) elementos;
                auxProfesor.cambioDepartamento(aux);
            }
        }
        
        System.out.println("");
        
        for (Persona elementos : datos) {
            if (elementos instanceof Staff) {
                Staff aux = (Staff) elementos;
                auxStaff.trasladoSeccion(aux);
            }
        }
        
        System.out.println("");
        
        Iterator<Persona> it = datos.iterator();
        while (it.hasNext()) {
            Persona next = it.next();
            System.out.println(next.toString());
            System.out.println("");
        }
        
    }
    
}
