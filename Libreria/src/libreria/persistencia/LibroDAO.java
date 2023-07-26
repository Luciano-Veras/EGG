
package libreria.persistencia;

import java.sql.SQLClientInfoException;
import java.util.Collections;
import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidades.Libro;

public final class LibroDAO extends DAO<Libro> {
    
    public void guardarLibro(Libro libro) throws Exception {
        Libro aux = buscarLibroporNombre(libro.getTitulo());
        if (aux != null) {
            System.out.println("Ya existe libro con el nombre indicado");
        } else {
            super.guardar(libro);
        }
    }
    
    public void editarLibro(Libro libro) throws Exception {
        super.editar(libro);
    }
    
    public void darDeAltaLibro(Long id) throws Exception {
        Libro libro = buscarLibroPorID(id);
        if(libro != null) {
            libro.setAlta(true);
            super.editar(libro);
        }
    }
    
     public void darDeBajaLibro(Long id) throws Exception {
        Libro libro = buscarLibroPorID(id);
        if(libro != null) {
            libro.setAlta(true);
            super.editar(libro);
        }
    }
    
    public Libro buscarLibroPorID(Long id) throws Exception {
        Libro libro;
        try {
            super.conectar();
            libro = em.find(Libro.class, id);
           super.desconectar();
           return libro;
        } catch (SQLClientInfoException e) {
            System.out.println("Error al buscar Libro por ID");
            System.out.println(e.getMessage());
            super.desconectar();
            return null;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
        
    }
    
    public Libro buscarLibroporNombre(String nombre) throws Exception {
        System.out.println("--Buscando Libro--");
        try {
            super.conectar();
            Libro libro = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre", Libro.class)
                    .setParameter("nombre", nombre).getSingleResult();
            super.desconectar();
            return libro;
        } catch (NoResultException e) {
            System.out.println("No se encontro libro con el nombre: " + nombre);
            super.desconectar();
            return null;
        } catch (Exception e) {
            System.out.println("Error en buscar libro por nombre: " + e.getMessage());
            super.desconectar();
            throw e;
        }
    }
    
    public List<Libro> buscarLibrosPorNombreAutor(String nombreAutor) {
        try {
            super.conectar();

            List<Libro> libros = em.createQuery(
                    "SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombreAutor", Libro.class)
                    .setParameter("nombreAutor", nombreAutor)
                    .getResultList();

            super.desconectar();
            return libros;
        } catch (Exception e) {
            System.out.println("Error al buscar libros por nombre de autor: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public List<Libro> buscarLibrosPorNombreEditorial(String nombreEditorial) {
        try {
            super.conectar();

            List<Libro> libros = em.createQuery(
                    "SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombreEditorial", Libro.class)
                    .setParameter("nombreEditorial", nombreEditorial)
                    .getResultList();

            super.desconectar();
            return libros;
        } catch (Exception e) {
            System.out.println("Error al buscar libros por nombre de editorial: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
