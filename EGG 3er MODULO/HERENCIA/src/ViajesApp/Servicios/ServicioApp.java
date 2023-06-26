/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViajesApp.Servicios;

import ViajesApp.Entidades.Camping;
import ViajesApp.Entidades.Extrahotel;
import ViajesApp.Entidades.Hotel;
import ViajesApp.Entidades.Hotel4;
import ViajesApp.Entidades.Hotel5;
import ViajesApp.Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author lucho
 */
public class ServicioApp {

    public void mostrarAlojamientos(ArrayList<Hotel> AH, ArrayList<Extrahotel> AE) {
        Iterator<Hotel> it = AH.iterator();
        while (it.hasNext()) {
            Hotel aux = it.next();
            if (aux instanceof Hotel5) {
                System.out.println("---- HOTEL DE 5 ESTRELLAS ----");
                System.out.println(aux.toString());
            } else if (aux instanceof Hotel4) {
                System.out.println("---- HOTEL DE 4 ESTRELLAS ----");
                System.out.println(aux.toString());
            }
        }
        for (Extrahotel elementos : AE) {
            if (elementos instanceof Camping) {
                System.out.println("---- CAMPING ----");
                System.out.println(elementos.toString());
            } else {
                System.out.println("---- RESIDENCIAS ----");
                System.out.println(elementos.toString());
            }
        }
    }

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t.getPrecioHabitacion().compareTo(t1.getPrecioHabitacion());
        }

    };

    public void ordenHoteles(ArrayList<Hotel> AH) {
        AH.sort(compararPrecio);
        Collections.reverse(AH);
        for (Hotel elementos : AH) {
            if (elementos instanceof Hotel5) {
                System.out.println("---- HOTEL DE 5 ESTRELLAS ----");
                System.out.println(elementos.toString());
            } else if (elementos instanceof Hotel4) {
                System.out.println("---- HOTEL DE 4 ESTRELLAS ----");
                System.out.println(elementos.toString());
            }
        }
    }

    public void campingRestaurantes(ArrayList<Extrahotel> AE) {
        for (Extrahotel elementos : AE) {
            if (elementos instanceof Camping) {
                if (((Camping) elementos).isRestaurante()) {
                    System.out.println("---- CAMPING ----");
                    System.out.println(elementos.toString());
                }
            }
        }
    }

    public void residenciasDtos(ArrayList<Extrahotel> AE) {
        Iterator<Extrahotel> it = AE.iterator();
        while (it.hasNext()) {
            Extrahotel elementos = it.next();
            if (elementos instanceof Residencia) {
                if (((Residencia) elementos).isDescuento()) {
                    System.out.println("---- RESIDENCIA ----");
                    System.out.println(elementos.toString());
                }
            }
        }
    }
}
