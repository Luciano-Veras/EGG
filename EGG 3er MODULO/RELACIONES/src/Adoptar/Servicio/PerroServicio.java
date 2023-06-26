/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adoptar.Servicio;

import Adoptar.Entidades.Perro;
import Adoptar.Enumeraciones.Tamanio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PerroServicio {

    public ArrayList<Perro> perroList() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE LA CANTIDAD DE PERROS RESCATADOS");
        int rescatados = leer.nextInt();
        ArrayList<Perro> auxL = new ArrayList();
        for (int i = 0; i < rescatados; i++) {
            Perro aux = new Perro();
            System.out.println("PERRO " + (i+1));
            System.out.println("INGRESE EL NOMBRE QUE LE DAREMOS AL PERRO");
            aux.setNombre(leer.next());
            System.out.println("INGRESE LA EDAD ESTIMADA DEL PERRO");
            aux.setEdad(leer.nextInt());
            System.out.println("INGRESE LA RAZA");
            aux.setRaza(leer.next());
            System.out.println("INEGRESE EL TAMAÑO");
            aux.setTamanio(elejirTamanio());
            auxL.add(aux);
        }
        return auxL;
    }

    public int elejirTamanio() {
        Scanner leer = new Scanner(System.in);
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux.ordinal() + " " + aux.name());
        }
        System.out.println("Elije tamaño");
        return leer.nextInt();
    }
    
    public void mostrarPerro(List auxL) {
        System.out.println("LOS PERROS EN ADOPCION");
       Iterator it = auxL.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
