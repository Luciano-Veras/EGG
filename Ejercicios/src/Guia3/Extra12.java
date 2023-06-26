/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author lucho
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[9][3];
        int contj2 = 1,contj1 = 1, contj0 = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                   matriz[i][j] = contj2;
                   contj2++;
                } else if (j == 1 && matriz[2][2] == 3) {
                    matriz[i][j] = contj1;
                    contj1++;
                } else if (j == 0 && matriz[5][1] == 3) {
                    matriz[i][j] = contj0;
                    contj0++;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        String[][] matrizc = new String[9][3];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                matrizc[i][j] = String.valueOf(matriz[i][j]);
                if (matrizc[i][j].equals("3")) {
                    matrizc[i][j] = "E";
                }
                System.out.print(matrizc[i][j]);
            }
            System.out.println("");
        }
    }
    
}
