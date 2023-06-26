/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 */
public class ProductoServicio {

    public HashMap<Integer, Producto> cargarProductos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, Producto> auxH = new HashMap();
        boolean confirmacion;
        do {
            Producto auxP = new Producto();
            System.out.println("Ingrese el codigo del producto");
            Integer cod = leer.nextInt();
            System.out.println("Ingrese el nombre del producto");
            auxP.setNombre(leer.next());
            System.out.println("Ingrese el precio del producto");
            auxP.setPrecio(leer.nextInt());
            auxH.put(cod, auxP);
            System.out.println("Desea agregar otro producto");
            confirmacion = confirmacion();
        } while (confirmacion);
        return auxH;
    }

    public boolean confirmacion() {
        Scanner leer = new Scanner(System.in);
        String confirmacion = leer.next();
        leer.nextLine();
        while (!confirmacion.equalsIgnoreCase("SI") && !confirmacion.equalsIgnoreCase("NO")) {
            System.out.println("Respuesta incorrecta, intente de nuevo");
            confirmacion = leer.next();
            leer.nextLine();
        }
        return confirmacion.equalsIgnoreCase("SI");
    }

    public boolean buscarProducto(HashMap<Integer, Producto> auxH, Integer codigo) {
           return auxH.containsKey(codigo);
//        for (Map.Entry<Integer, Producto> elemento : auxH.entrySet()) {
//            if (Objects.equals(codigo, elemento.getKey())) {
//                System.out.println("El Producto se encuentra en la lista");
//                return true;
//            }
//        }
//        System.out.println("El producto no se encuentra en la lista");
//        return false;
    }

    public void modificarPrecio(HashMap<Integer, Producto> auxH) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion;
        do {
            System.out.println("Ingrese el codigo del producto cuyo precio desea modificar");
            Integer cod = leer.nextInt();
            boolean pertenece = buscarProducto(auxH, cod);
            if (pertenece == true) {
                System.out.println("El producto se encuentra en la lista, ingrese el nuevo precio");
                auxH.get(cod).setPrecio(leer.nextInt());
            } else {
                System.out.println("El elemento no se encuentra en la lista");
            }
            System.out.println("Desea seguir buscando");
            confirmacion = confirmacion();
        } while (confirmacion);
    }
    
    public void eliminarProducto(HashMap<Integer, Producto> auxH) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion;
        do {
            System.out.println("Ingrese el codigo del producto que desea eliminar");
            Integer cod = leer.nextInt();
            boolean pertenece = buscarProducto(auxH, cod);
            if (pertenece == true) {
                System.out.println("El producto se encuentra en la lista");
                auxH.remove(cod);
            } else {
                System.out.println("El elemento no se encuentra en la lista");
            }
            System.out.println("Desea seguir buscando");
            confirmacion = confirmacion();
        } while (confirmacion);
    }
    
    public void mostrarProductos(HashMap<Integer, Producto> auxH) {
        for (Map.Entry<Integer, Producto> elemento : auxH.entrySet()) {
            System.out.println(elemento.toString());   
        }
    }
    
    

}
