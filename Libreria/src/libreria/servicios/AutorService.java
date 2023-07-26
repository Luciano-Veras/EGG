package libreria.servicios;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorService {

    private AutorDAO dao;

    public AutorService() {
        this.dao = new AutorDAO();
    }

    public void crearAutor() throws Exception {
        System.out.println("--Cargando Autor Nuevo--");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Autor aux = new Autor();
        System.out.print("Ingresa nombre del autor: ");
        try {
            String nombre = leer.nextLine();
            if (nombre.trim().isEmpty()) {
                throw new NullPointerException("Valor vacio o nulo");
            }
            aux.setNombre(nombre);
            dao.guardar(aux);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        } 

    }

    public void editarNombreAutor() throws Exception {
        System.out.println("--Editando Autor--");
        Scanner leerE = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Mostramos autores cargados en base de datos");
            Collection<Autor> auxL = dao.listarAutores();
            if (auxL.isEmpty()) {
                throw new NullPointerException("No hay autores en la base de datos");
            }
            imprimirCollection(auxL);
            System.out.print("Ingrese id del Autor que desea modificar: ");
            Integer id = leerE.nextInt();
            Autor auxA = dao.buscarAutorId(id);
            System.out.print("Ingrese nombre del autor: ");
            String nombre = leerE.next();
            auxA.setNombre(nombre);
            dao.editar(auxA);
            System.out.println("--Autores actualziados--");
            auxL = dao.listarAutores();
            imprimirCollection(auxL);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Debe ingresar dato valido");
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirCollection(Collection auxC) throws Exception {
        try {
            Collection<Autor> auxL = auxC;
            for (Autor elemento : auxL) {
                System.out.println(elemento.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void darDeAltaAutor() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("--Mostrando autores--");
            Collection<Autor> auxAl = dao.listarAutores();
            if (auxAl.isEmpty()) {
                throw new NullPointerException("No hay autores en la base de datos");
            }
            imprimirCollection(auxAl);
            System.out.print("Ingrese el id del autor que desea dar de alta: ");
            Integer id = leer.nextInt();
            Autor aux = dao.buscarAutorId(id);
            aux.setAlta(true);
            dao.editar(aux);
            System.out.println("--Autores Actualizados--");
            auxAl = dao.listarAutores();
            imprimirCollection(auxAl);
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Debe ingresar dato valido");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeBajaAutor() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("--Mostrando autores--");
            Collection<Autor> auxAl = dao.listarAutores();
            if (auxAl.isEmpty()) {
                throw new NullPointerException("No hay autores en la base de datos");
            }
            imprimirCollection(auxAl);
            System.out.print("Ingrese el id del autor que desea dar de baja: ");
            Integer id = leer.nextInt();
            Autor aux = dao.buscarAutorId(id);
            aux.setAlta(false);
            dao.editar(aux);
            System.out.println("--Autores Actualizados--");
            auxAl = dao.listarAutores();
            imprimirCollection(auxAl);
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Debe ingresar dato valido");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }    
}
