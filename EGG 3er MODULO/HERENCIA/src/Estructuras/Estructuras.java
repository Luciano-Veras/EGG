/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.Entidades.EdificioDeOficina;
import Estructuras.Entidades.Edificios;
import Estructuras.Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucho
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Edificios> lista = new ArrayList();

        Polideportivo p1 = new Polideportivo("Boca Juniors", true, 10, 20, 30);
        lista.add(p1);
        Polideportivo p2 = new Polideportivo("The Bahia", false, 50, 15, 60);
        lista.add(p2);

        EdificioDeOficina e1 = new EdificioDeOficina(5, 4, 10, 10, 30, 20);
        lista.add(e1);
        EdificioDeOficina e2 = new EdificioDeOficina(6, 2, 20, 20, 20, 15);
        lista.add(e2);

        Iterator<Edificios> it = lista.iterator();

        int techado = 0;
        int abiertos = 0;
        int i = 1;
        while (it.hasNext()) {
            Edificios aux = it.next();
            if (aux instanceof Polideportivo) {
                System.out.println("POLIDEPORTIVO " + ((Polideportivo) aux).getNombre());
                System.out.println("La superficie es: " + aux.calcularSuperficio());
                System.out.println("El Volumen es: " + aux.calcularVolumen());
                if (((Polideportivo) aux).isTechada()) {
                    techado++;
                } else {
                    abiertos++;
                }
                
            }
            
            if (aux instanceof EdificioDeOficina) {
                System.out.println("Edificio de Oficina " + i);
                System.out.println("La superficie es: " + aux.calcularSuperficio());
                System.out.println("El Volumen es: " + aux.calcularVolumen());
                ((EdificioDeOficina) aux).cantPersonas();
                i++;
            }
        }
        System.out.println("La cantidad de polideportivos techados es: " + techado);
        System.out.println("La cantidad de polideportivos abiertos es: " + abiertos);

    }

}
