/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author lucho
 */
public final class ContratoAlquiler {
    
    private Cliente usuario;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int pocisionAmarre;
    private Barco barco;

    public ContratoAlquiler() {
    }

    public ContratoAlquiler(Cliente usuario, Date fechaAlquiler, Date fechaDevolucion, int pocisionAmarre, Barco barco) {
        this.usuario = usuario;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.pocisionAmarre = pocisionAmarre;
        this.barco = barco;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPocisionAmarre() {
        return pocisionAmarre;
    }

    public void setPocisionAmarre(int pocisionAmarre) {
        this.pocisionAmarre = pocisionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public ContratoAlquiler crearContrato(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente auxC = new Cliente();
        usuario = auxC.cargarCliente(); 
        System.out.println("FECHA DE ALQUILER");
        fechaAlquiler = fechas();
        System.out.println("FECHA DE DEVOLUCION");
        fechaDevolucion = fechas();
        System.out.println("Asignar pocision de amarre");
        pocisionAmarre = leer.nextInt();
        barco = cargarBarco();
        return new ContratoAlquiler(usuario, fechaAlquiler, fechaDevolucion, pocisionAmarre, barco);
    }
    
    private Date fechas(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        return new Date(anio-1900, mes-1, dia);
    }
    
    private Barco cargarBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("QUE BARCO DESEA ALQUILAR:\n1-COMUN\n2-VELERO\n3-LANCHA\n4-YATE DE LUJO");
        int opcion = leer.nextInt();
        while (opcion < 1 || opcion > 4 ) {
            System.out.println("Opcion incorrecta, ingrese de nuevo");
            opcion = leer.nextInt();
        }
        Barco aux = new Barco();
        switch (opcion) {
            case 1:
                 aux = aux.crearBarco();
                break;
            case 2:
                aux = new Velero().crearVelero();
                break;
            case 3:
                aux = new Lancha().crearLancha();
                break;
            case 4:
                aux = new Yate().crearYate();
                break;
        }
        return aux; 
    } 
    
    

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Contrato de Alquiler" + "\n" + usuario.toString() + "\nFecha de Alquiler: " + sdf.format(fechaAlquiler) + "\nFecha de Devolucion: " + sdf.format(fechaDevolucion) + "\nPocision de Amarre: " + pocisionAmarre + "\nBarco" + "\n" + barco.toString();
    }
    
    
}
