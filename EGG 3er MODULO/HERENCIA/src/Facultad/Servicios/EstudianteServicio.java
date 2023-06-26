/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Servicios;


import Facultad.Entidades.Estudiante;
import Facultad.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class EstudianteServicio extends PersonaServicio {
    
    @Override
    public Estudiante crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CARGAR DATOS DEL ESTUDIANTE");
        Persona aux = super.crearPersona();
        System.out.print("Ingrese el curso en el que esta matriculado: ");
        String curso = leer.next();
        return new Estudiante(curso, aux.getNombre(), aux.getApellido(), aux.getDni(), aux.getEstadoCivil());
    }
    
    public void cambiarCurso(Estudiante aux) {
        System.out.print("Ingrese el curso al cual se matriculara: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        aux.setCursoMatriculado(leer.next());
    }
}
