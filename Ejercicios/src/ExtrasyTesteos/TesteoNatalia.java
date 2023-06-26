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
public class TesteoNatalia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase indicando su terminacion con un punto");
        boolean fin;            
        do {
        String frase = leer.nextLine();
        int largo = frase.length();
        if (frase.substring( largo-1, largo ).equals(".") ) {
            frasenva(frase,largo);
            fin = true;
        } else {
            System.out.println("Debe ingresar un frase cuya terminacion sea un punto");
            System.out.println("Ingrese nuevamente");
            fin = false;
        }
        } while (!fin == true);
    }
    public static void frasenva(String frase, int largo) {
        String frase1 = "";
        String letra;
        for (int i = 0; i < largo ; i++) {
            letra = frase.toLowerCase().substring(i, i+1);
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            frase1 = frase1.concat(letra);
        }
        System.out.println(frase1);
    }

}
