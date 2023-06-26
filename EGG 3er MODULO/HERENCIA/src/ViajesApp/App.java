/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViajesApp;

import ViajesApp.Entidades.Camping;
import ViajesApp.Entidades.Extrahotel;
import ViajesApp.Entidades.Hotel;
import ViajesApp.Entidades.Hotel4;
import ViajesApp.Entidades.Hotel5;
import ViajesApp.Entidades.Residencia;
import ViajesApp.Servicios.ServicioApp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Hotel> top = new ArrayList();
        Hotel4 hotel4 = new Hotel4("A", "YikuTsunoda", 29, 10, 4, 20);
        hotel4.precioFinal();
        top.add(hotel4);
        Hotel4 hotel41 = new Hotel4("B", "DanielRicardo", 100, 100, 100, 15);
        hotel41.precioFinal();
        top.add(hotel41);
        Hotel5 hotel5 = new Hotel5(10, 5, 20, "A", "ChecoPerez", 51, 20, 5, 25);
        hotel5.precioFinal();
        top.add(hotel5);

        ArrayList<Extrahotel> up = new ArrayList();
        Camping camping1 = new Camping(25, 5, true, false, 25);
        up.add(camping1);
        Camping camping2 = new Camping(15, 4, false, true, 30);
        up.add(camping2);
        Residencia residencia1 = new Residencia(5, true, false, true, 27);
        up.add(residencia1);
        Residencia residencia2 = new Residencia(30, false, true, false, 50);
        up.add(residencia2);

        ServicioApp service = new ServicioApp();
        System.out.println("BIENVENIDOS");
        System.out.println("");
        System.out.println("Elije una opcion");
        System.out.println("1-Mostrar todos los alojamientos"
                + "\n2-Mostrar hoteles ordenados por precio en orden descendentes"
                + "\n3-Mostrar camping con restaurantes"
                + "\n4-Mostrar residencias con descuentos por gremio"
                + "\n5-Salir");
        System.out.println("");

        boolean fin = false;
        do {
            int op = leer.nextInt();
            while (op < 1 || op > 5) {
                System.out.println("Respuesta incorrecta, ingrese de nuevo");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    service.mostrarAlojamientos(top, up);
                    break;
                case 2:
                    service.ordenHoteles(top);
                    break;
                case 3:
                    service.campingRestaurantes(up);
                    break;
                case 4:
                    service.residenciasDtos(up);
                    break;
                case 5:
                    fin = true;
                    break;
            }

        } while (!fin);

    }

}
