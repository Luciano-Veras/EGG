/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class Cliente {
    
    private String nombre;
    private int dni;

    public Cliente() {
    }

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdni() {
        return dni;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }
    
    public Cliente cargarCliente(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("Ingresar nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese DNI");
        dni = leer.nextInt();
        return new Cliente(nombre, dni);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni;
    }
    
    
}
