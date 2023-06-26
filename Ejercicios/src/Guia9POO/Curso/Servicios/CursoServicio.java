/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Curso.Servicios;

import Guia9POO.Curso.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String[] cargarAlumnos() {
        System.out.println("Cuantos Alumnos tiene el curso");
        String [] alumnos = new String[leer.nextInt()];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        Curso cursoX = new Curso();
        System.out.println("Ingrese nombre del curso");
        cursoX.setNombreCurso(leer.next());
        System.out.println("Cuantos dia a la semana se da el curso");
        cursoX.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Cuantas horas por dia dura el curso");
        cursoX.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("En que turno se dara el curso : Dia / Noche");
        cursoX.setTurno(leer.next());
        boolean fin = false;
        do {
            if (cursoX.getTurno().equalsIgnoreCase("dia") || cursoX.getTurno().equalsIgnoreCase("noche")) {
                fin = true;
            } else {
                System.out.println("Turno incorrecto, ingrese Dia o Noche");
                cursoX.setTurno(leer.next());
            }
        } while (fin != true);
        System.out.println("Que costo tiene el curso por hora");
        cursoX.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese los alumnos inscriptos");
        cursoX.setAlumnos(cargarAlumnos());
        return cursoX;
    }
    
    public void calcularGananciaSemana(Curso cursoX) {
        int ganancia = cursoX.getCantidadDiasPorSemana() * cursoX.getCantidadHorasPorDia() * cursoX.getPrecioPorHora() * cursoX.getAlumnos().length;
        System.out.println("La ganancia total por semana es : " + ganancia);
    }
}
