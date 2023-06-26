/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasyTesteos;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class TesteoPedro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingresar una Frase terminada en punto: ");
        
       
        do{
            frase = leer.nextLine();  
            if (frase.substring(frase.length()-1, frase.length()).equals(".")) {
                String respuesta = reemplazar(frase);
              System.out.println(respuesta);
            } else {
                System.out.println("Ingrese la Frase nuevamente. La Frase DEBE terminar con Punto: ");
            }
            
        } while (!frase.substring(frase.length()-1,frase.length()).equals("."));
         
    }
    
    public static String reemplazar(String frase) {
        String frase2 = "";
        for (int i = 0; i < (frase.length()); i++) {

            switch (frase.charAt(i)) {
                case 'a':
                    frase2 += "@";
                    break;
                case 'e':
                    frase2 += "#";
                    break;
                case 'i':
                    frase2 += "$";
                    break;
                case 'o':
                    frase2 += "%";
                    break;
                case 'u':
                    frase2 += "*";
                    break;
                case '.':
                    frase2 += ".";
                     break;
                default:
            frase2 += frase.charAt(i);
            }
        }
        return frase2;
    }
}