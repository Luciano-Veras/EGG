package Tienda;

import Tienda.servicios.FabricanteService;
import Tienda.servicios.ProductoService;
import java.util.Scanner;

public class PrincipalMain {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        FabricanteService Fs = new FabricanteService();
        ProductoService Ps = new ProductoService();

        boolean fin = false;
        do {
            System.out.println("");
            System.out.println("---BIENVENIDOS---"
                    + "\n 1-INGRESAR FABRICANTE"
                    + "\n 2-MODIFICAR NOMBRE DEL FABRICANTE"
                    + "\n 3-ELIMINAR FABRICANTE"
                    + "\n 4-INGRESAR PRODUCTO"
                    + "\n 5-MODIFICAR PRODUCTO"
                    + "\n 6-ELIMINAR PRODUCTO"
                    + "\n 7-CONSULTAR NOMBRE DE PRODUCTOS"
                    + "\n 8-CONSULTAR NOMBRE Y PRECIO DE LOS PRODUCTOS"
                    + "\n 9-CONSULTAR PRODUCTOS CON PRECIOS ENTRE 120 Y 202"
                    + "\n10-CONSULTAR PRODUCTOS PORTATILES"
                    + "\n11-PRODUCTO MAS BARATO"
                    + "\n12-SALIR"
                    + "\n");

            System.out.print("Ingresa una opcion: ");
            int opc = leer.nextInt();

            while (opc < 0 || opc > 13) {
                System.out.println("Error intente de nuevo");
                opc = leer.nextInt();
            }

            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.print("Nombre del fabrincante nuevo: ");
                    String name = leer.next();
                    Fs.crearFabricante(name);
                    break;
                case 2:
                    System.out.print("Codigo del fabricante: ");
                    int codigo = leer.nextInt();
                    System.out.print("Nombre del fabrincante: ");
                    name = leer.next();
                    Fs.modificarNombreFabricante(codigo, name);
                    break;
                case 3:
                    System.out.print("Ingrese el codigo del fabrincate que desea eliminar: ");
                    codigo = leer.nextInt();
                    Fs.eliminarFabricante(codigo);
                    break;
                case 4:
                    System.out.print("Nombre del producto nuevo: ");
                    name = leer.next();
                    System.out.print("Precio del producto: $");
                    double precio = leer.nextDouble();
                    System.out.print("Codigo del fabricante: ");
                    codigo = leer.nextInt();
                    Ps.crearProducto(name, precio, codigo);
                    break;
                case 5:
                    System.out.print("Ingrese el codigo del producto que desea modificar: ");
                    codigo = leer.nextInt();
                    System.out.println("Ingresar Cambios...");
                    System.out.print("Nombre: ");
                    name = leer.next();
                    System.out.print("Precio: $");
                    precio = leer.nextDouble();
                    System.out.print("Codigo de fabricante: ");
                    int codFabricante = leer.nextInt();
                    Ps.modificarProducto(codigo, name, precio, codFabricante);
                    break;
                case 6:
                    System.out.print("Ingrese codigo del producto que desea eliminar: ");
                    codigo = leer.nextInt();
                    Ps.eliminarProducto(codigo);
                    break;
                case 7:
                    Ps.nombresProducto();
                    break;
                case 8:
                    Ps.nombrePrecioProducto();
                    break;
                case 9:
                    Ps.precio120202();
                    break;
                case 10:
                    Ps.portatiles();
                    break;
                case 11:
                    Ps.masBarato();
                    break;
                case 12:
                    fin = true;
                    break;
            }
        } while (!fin);
    }
}
