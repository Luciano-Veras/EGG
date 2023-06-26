/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Rectangulo.Entidades;

/**
 *
 * @author lucho
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }
    
    

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Rectangulo crearRectangulo(int base, int altura) {
        return new Rectangulo(base, altura);
    }
    
    public int superficie(Rectangulo figura) {
        return base * altura;
    }
    
    public int perimetro(Rectangulo figura) {
        return (base + altura) * 2;
    }
    
    public void grafico(Rectangulo figura) {
        String[][] rectangulo =  new String[altura][base];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1) {
                    rectangulo[i][j] = "*";
                } else if (j == 0 || j == base-1) {
                    rectangulo[i][j] = "*";
                } else {
                    rectangulo[i][j] = " ";
                }
                System.out.print(rectangulo[i][j]);
            }
            System.out.println("");
        }
    }
}
