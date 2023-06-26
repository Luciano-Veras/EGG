/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Libros.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;


    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN");
        libro.setISBN(leer.nextInt());
        System.out.println("Ingrese el nombre del autor");
        libro.setAutor(leer.next());
        System.out.println("Ingrese el Titulo del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese cantidad de paginas");
        libro.setNumeroPaginas(leer.nextInt());
        return libro;
    }
    
    public void mostrarLibro(Libro libro) {
        System.out.println(libro.getISBN());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAutor());
        System.out.println(libro.getNumeroPaginas());
    }


    

    
}
