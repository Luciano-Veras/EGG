/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Entidades;

/**
 *
 * @author lucho
 */
public class Estudiante extends Persona {

    /**
     * En cuanto a los estudiantes, se requiere almacenar el curso en el que
     * están matriculados.
     */
    protected String cursoMatriculado;

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCurso vigente: " + cursoMatriculado;
    }

}
