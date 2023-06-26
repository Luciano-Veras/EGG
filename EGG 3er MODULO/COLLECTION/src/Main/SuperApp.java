/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Producto;
import Servicios.ProductoServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class SuperApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio pS = new ProductoServicio();
        boolean confirmacion = true;
        HashMap<Integer, Producto> superMami = pS.cargarProductos();
        do {
            System.out.println("App Super");
            System.out.println("Elije una opcion" + "\n"
                    + "1- MOSTRAR PRODUCTOS" + "\n"
                    + "2- MODIFICAR PRECIO" + "\n"
                    + "3- ELIMINAR PRODUCTO" + "\n"
                    + "4-SALIR"); 
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    pS.mostrarProductos(superMami);
                    break;
                case 2:
                    pS.modificarPrecio(superMami);
                    break;
                case 3:
                    pS.eliminarProducto(superMami);
                    break;
                case 4:
                    confirmacion = false;
                    break;
                default:
                    System.out.println("Opcion invalida, intene de nuevo");
            }
        } while (confirmacion);
        
    }
    
}
