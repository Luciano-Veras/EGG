/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Libros;

import Guia7POO.Libros.Entidades.Libro;

/**
 *
 * @author lucho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un libro con el constructor vacio
//        Libro libro0 = new Libro();
//        libro0.ISBN = 4321;
//        libro0.titulo = "Muchos Maestros";
//        libro0.autor = "Arcangeles";
//        libro0.numeroPaginas = 325;
//        System.out.println(libro0.ISBN + " " + libro0.autor + " " + libro0.titulo + " " + libro0.numeroPaginas);
//        LO COMENTAMOS POR QUE AL PASAR ATRIBUTOS A PRIVETA NO PUEDE ACCEDER MAS  

        //creamo un libro con el constructor con parametros
        Libro libro1 = new Libro(1234, "Muchas Vidas", "Guias", 523);
        //System.out.println(libro1.ISBN + " " + libro1.autor + " " + libro1.titulo + " " + libro1.numeroPaginas);
        //LO COMENTAMOS POR QUE CON LOS ATRIBUTOS EN PRIVADO DEBEREMOS CREAR Y USAR GET PARA MOSTRAR LOS DATOS
        System.out.println(libro1.getISBN() + " " + libro1.getAutor() + " " + libro1.getTitulo() + " " + libro1.getNumeroPaginas());
        System.out.println("");
        System.out.println("Cambiamos los datos del libro 1");
        libro1.setISBN(4321);
        libro1.setAutor("Maestros");
        libro1.setTitulo("Viaje Astral");
        libro1.setNumeroPaginas(351);
        System.out.println(libro1.getISBN() + " " + libro1.getAutor() + " " + libro1.getTitulo() + " " + libro1.getNumeroPaginas());
        //CON EL LOS METODOS SET CAMBIAMOS LOS VALORES DE LIBROS Y CON LOS METODOS GET LO MOSTRAMOS DE NUEVO ( ATRIBUTOS EN PRIVADO)
        System.out.println("");
        System.out.println("Cambiamos valores del libro 1 con un metodo en la clase");
        libro1 = libro1.crearLibro();
        libro1.mostrarLibro(libro1);
    }
}
