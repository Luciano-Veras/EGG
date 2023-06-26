/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Perro;
import Servicios.ServicePerro;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PerrosApp {
    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList. Continuando el ejercicio anterior,
     * después de mostrar los perros, al usuario se le pedirá un perro y se
     * recorrerá la lista con un Iterator, se buscará el perro en la lista. Si
     * el perro está en la lista, se eliminará el perro que ingresó el usuario y
     * se mostrará la lista ordenada. Si el perro no se encuentra en la lista,
     * se le informará al usuario y se mostrará la lista ordenada.
     */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicePerro perroS = new ServicePerro();
        
        ArrayList<Perro> PatitasList = new ArrayList();
        
        boolean fin = false;
        do {
            Perro Patitas = perroS.crearLista();
            PatitasList.add(Patitas);
            System.out.println("Desea agregar otro perro"
                    + "(SI/NO)");
            String respuesta;
            do {
                respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("NO")) {
                    fin = true;
                } else if (!respuesta.equalsIgnoreCase("SI")) {
                    System.out.println("Respuesta incorrecta, intente de nuevo");
                }
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("No") );
        } while (fin != true);
        perroS.mostrarLista(PatitasList);
        
        System.out.println("Desea eliminar alguna raza ");
        String respuesta = leer.next();
        perroS.eliminarPerro(PatitasList, respuesta);
        Collections.sort(PatitasList, Comparadores.ordenarPorRazaAsc);
        perroS.mostrarLista(PatitasList);
    }
    
}
