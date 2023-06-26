/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal.Entidades;

import Animal.Interfaces.AccionAnimal;

/**
 *
 * @author lucho
 */
public class Animal implements AccionAnimal {
    
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, Integer edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    @Override
    public void Alimentarce() {
        System.out.println("El animal se alimenta de: " + alimento);
    }
    
    
}
