/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Curso;

import Guia9POO.Curso.Entidades.Curso;
import Guia9POO.Curso.Servicios.CursoServicio;

/**
 *
 * @author lucho
 */
public class Ejercicio6_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cursoS = new CursoServicio();
        Curso cursoX = cursoS.crearCurso();
        cursoS.calcularGananciaSemana(cursoX);
    }

}
