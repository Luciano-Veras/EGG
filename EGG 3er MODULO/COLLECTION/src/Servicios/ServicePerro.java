/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class ServicePerro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Perro crearLista(){
        System.out.println("Ingrese raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese nombre del perro");
        String nombre = leer.next();
        Perro aux = new Perro(raza, nombre);
        return aux;
    }
    
    public void eliminarPerro(ArrayList<Perro> auxL, String respuesta) {
        Iterator<Perro> it = auxL.iterator();
        if (respuesta.equalsIgnoreCase("SI")) {
            System.out.println("Que raza desea eliminar");
            String removeP = leer.next();
            int cont = 0;
            while (it.hasNext()) {
                Perro auxP = it.next();
                if (auxP.getRaza().equalsIgnoreCase(removeP)) {
                    it.remove();
                    cont ++;                    
                }               
            }
            if (cont > 0) {
                System.out.println("La raza " + removeP + " se elimino exitosamente");
            } else {
                System.out.println("La raza " + removeP + " no se encuentra en la lista");
            }
        }

    }
    
    public void mostrarLista(ArrayList<Perro> aux) {
        System.out.println(aux.toString());
    }
}
