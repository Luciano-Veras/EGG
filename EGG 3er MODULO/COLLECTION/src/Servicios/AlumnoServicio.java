/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Alumno> CrearAlumno() {
        ArrayList<Alumno> auxL = new ArrayList();
        boolean fin = true;
        do {
            Alumno aux = new Alumno();
            ArrayList<Integer> auxN = new ArrayList();
            System.out.println("Ingrese nombre del alumno");
            aux.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la " + (i + 1) + " nota del alumno");
                Integer nota = leer.nextInt();
                auxN.add(nota);
            }
            aux.setNota(auxN);
            auxL.add(aux);
            System.out.println("Desea agregar otro alumno : (SI/NO)");
            String respuesta = leer.next();
            while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Respuesta incorrecta, intente de nevo (SI/NO)");
                respuesta = leer.next();
            }
            if (respuesta.equalsIgnoreCase("NO")) {
                fin = false;
            }
        } while (fin);
        
        return auxL;
    }
    
    public void notaFinal(ArrayList<Alumno> auxL) {   
        boolean fin = true;
        do {
            Iterator<Alumno> it = auxL.iterator();
            double suma = 0;
            System.out.println("Ingrese el nombre del alumno cuyo promedio final desea saber");
            String nombre = leer.next();
            while (it.hasNext()) {
                Alumno auxA = it.next();
                if (auxA.getNombre().equalsIgnoreCase(nombre)) {
                    Iterator<Integer> it1 = auxA.getNota().iterator();
                    while (it1.hasNext()) {
                        suma += it1.next();
                    }
                    double promedio = suma / auxA.getNota().size();
                    System.out.println("El promedio es: " + promedio);
                }
            }
            if (suma == 0) {
                System.out.println("El alumno no pertence al curos");
            }
            System.out.println("Desea saber el promedio de otro alumno : (SI/NO)");
            String respuesta = leer.next();
            while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Respuesta incorrecta, intente de nevo (SI/NO)");
                respuesta = leer.next();
            }
            if (respuesta.equalsIgnoreCase("NO")) {
                fin = false;
            }
        } while (fin);

    }
}
