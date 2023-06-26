/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos.Entidades;

import Electrodomesticos.Enumeraciones.Color;
import Electrodomesticos.Enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Electrodomesticos {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        for (ConsumoEnergetico letras : ConsumoEnergetico.values()) {
            if (letras.name().charAt(0) == letra) {
                return letra;
            }
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        for (Color colores : Color.values()) {
            if (colores.toString().equals(color)) {
                return color;
            }
        }
        return "BLANCO";
    }

    protected void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CARGAMOS DATOS DEL ELECTRODOMESTICO");
        precio = 1000;
        System.out.println("Ingrese el color");
        color = comprobarColor(leer.next().toUpperCase());
        System.out.println("Tipo de consumo");
        consumoEnergetico = comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.println("Ingrese el peso");
        peso = leer.nextDouble();
    }

    public void precioFinal(Electrodomesticos aux) {
        switch (aux.getConsumoEnergetico()) {
            case 'A':
                aux.setPrecio(aux.getPrecio() + 1000);
                break;
            case 'B':
                aux.setPrecio(aux.getPrecio() + 800);
                break;
            case 'C':
                aux.setPrecio(aux.getPrecio() + 600);
                break;
            case 'D':
                aux.setPrecio(aux.getPrecio() + 500);
                break;
            case 'E':
                aux.setPrecio(aux.getPrecio() + 300);
                break;
            case 'F':
                aux.setPrecio(aux.getPrecio() + 100);
                break;
        }
        if (aux.getPeso() <= 19) {
            aux.setPrecio(aux.getPrecio() + 100);
        } else if (aux.getPeso() <= 49) {
            aux.setPrecio(aux.getPrecio() + 500);
        } else if (aux.getPeso() <= 79) {
            aux.setPrecio(aux.getPrecio() + 800);
        } else {
            aux.setPrecio(aux.getPrecio() + 1000);
        }
    }
    
    
    
}
