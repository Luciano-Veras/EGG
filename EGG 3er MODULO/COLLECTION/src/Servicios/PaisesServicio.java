/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PaisesServicio {

    public HashSet<String> cargarPaises() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> auxH = new HashSet();
        boolean confirmacion = false;
        do {
            System.out.println("Ingrese el nombre del pais que desea agregar");
            auxH.add(leer.next().toUpperCase());
            System.out.println("Desea agregar otro pais");
            String respuesta = leer.next();
            while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Respuesta incorrecta, intente de nuevo");
                respuesta = leer.next();
            }
            if (respuesta.equalsIgnoreCase("NO")) {
                confirmacion = true;
            }
        } while (!confirmacion);
        return auxH;
    }

    public void ordenarPaises(HashSet<String> auxH) {
        ArrayList<String> paisesLista = new ArrayList(auxH);
        Collections.sort(paisesLista);
        for (String nombres : paisesLista) {
            System.out.println(nombres);
        }
           
    }

    public void removerPais(HashSet<String> auxH) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion = false;
        int cont = 0;
        do {
            System.out.println("Ingrese un pais que desea buscar");
            String paisBuscado = leer.next().toUpperCase();
            Iterator<String> it = auxH.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(paisBuscado)) {
                    System.out.println("El pais: " + paisBuscado + " se encuentra en la lista, desea eliminarlo");
                    String respuesta = leer.next();
                    cont++;
                    while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
                        System.out.println("Respuesta incorrecta, intente de nuevo");
                        respuesta = leer.next();
                    }
                    if (respuesta.equalsIgnoreCase("SI")) {
                        it.remove();
                        ordenarPaises(auxH);
                        break;
                    }
                }
            }
            if (cont == 0) {
                System.out.println("El pais ingresado no se encuentra en la lista");
                ordenarPaises(auxH);
            }
            System.out.println("DESEA SEGUIR BUSCANDO");
            String respuesta2 = leer.next();
            while (!respuesta2.equalsIgnoreCase("SI") && !respuesta2.equalsIgnoreCase("NO")) {
                System.out.println("Respuesta incorrecta, intente de nuevo");
                respuesta2 = leer.next();
            }
            if (respuesta2.equalsIgnoreCase("NO")) {
                confirmacion = true;
            }
        } while (!confirmacion);
    }

}
