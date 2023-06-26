/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasPOO.Servicios;

import ExtrasPOO.Entidades.Alumnos;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class AlumnosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearAlumnos(Alumnos[] cursox) {
        int indice = 0;
        for (Alumnos alumnox : cursox) {
            indice++;
            System.out.println("Ingrese el nombre del " + indice + " alumno");
            String nombre = leer.next();
            System.out.println("Ingrese la nota del " + indice + " alumno");
            double nota = leer.nextDouble();
            cursox[indice-1] = new Alumnos(nombre, nota);
        }

    }
    
    public void analisisCurso(Alumnos[] cursox){
        double sumaNotas = 0;
        for (Alumnos alumnox : cursox) {
            sumaNotas+= alumnox.getNota();
        }
        double promedio = sumaNotas / cursox.length;
        System.out.println("El promedio de las nota de los alumnos es: " + promedio);
        
        
        int cont = 0;
        for (Alumnos alumnox : cursox) {
            if (alumnox.getNota() > promedio) {
                cont++;
            }
        }
        String[] alumnosSobresalientes = new String[cont];
        int indice = 0;
        for (Alumnos alumnox : cursox) {
            if (alumnox.getNota() > promedio) {
                alumnosSobresalientes[indice] = alumnox.getNombre();
                indice++;
                
            }
        }
        
        for (String alumnox : alumnosSobresalientes) {
            System.out.println("El alumno " + alumnox + " tiene nota mayor al promedio, SOBRESALIENTE");
            
        }
        
    } 
    

}
