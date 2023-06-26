/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class AlumnosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       AlumnoServicio leerS = new AlumnoServicio();
        System.out.println("CARGAREMOS LOS ALUMNOS DE 1ER AÑOS");
        ArrayList<Alumno> primerAño = leerS.CrearAlumno();
        System.out.println("SACAMOS EL PROMEDIO DEL ALUMNO");
        leerS.notaFinal(primerAño);
        
       
    }
    
}
