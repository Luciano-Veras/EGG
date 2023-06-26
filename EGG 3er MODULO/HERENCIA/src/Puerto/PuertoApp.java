/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto;

import Puerto.Entidades.ContratoAlquiler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PuertoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenidos al puerto");

        ContratoAlquiler contrato = new ContratoAlquiler();

        List<ContratoAlquiler> contratos = new ArrayList();

        for (int i = 0; i < 1; i++) {
            contrato.crearContrato();
//            System.out.println(contrato.toString());
            System.out.println("Precio del contrato: $" + contrato.getBarco().precioContrato(contrato));
            contratos.add(contrato);
        }

        System.out.println("BUSCAMOS CONTRATOS POR DNI");
        boolean fin = false;
        do {
            System.out.print("Ingrese el DNI del usuario: ");
            int DNI = leer.nextInt();
            Iterator<ContratoAlquiler> it = contratos.iterator();
            while (it.hasNext()) {
                ContratoAlquiler aux = it.next();
                if (aux.getUsuario().getdni() == DNI) {
                    System.out.println(aux.toString());
                    break;
                }
                if (!it.hasNext()) {
                    System.out.println("No exite contrato con el DNI ingresado");
                }
            }
            System.out.println("DESEA SEGUIR BUSCANDO");
            String respuesta = leer.next();
            while (respuesta.equalsIgnoreCase("NO")) {
                fin = true;
                break;
            }

        } while (!fin);

    }

}
