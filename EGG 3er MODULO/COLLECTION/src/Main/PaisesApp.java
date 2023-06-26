/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.PaisesServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 */
public class PaisesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisesServicio pS = new PaisesServicio();
        System.out.println("----CARGAMOS LOS PAISES---");
        HashSet<String> nombresPaises = pS.cargarPaises();
        System.out.println("----MOSTRAMOS LOS PAISES CARGADOS ORDENADOS----");
        pS.ordenarPaises(nombresPaises);
        System.out.println("----ELIMINANDO PAISES----");
        pS.removerPais(nombresPaises);
        
        
        

    }

}
