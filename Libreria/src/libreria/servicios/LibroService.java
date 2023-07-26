
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroService {

    private LibroDAO dao;

    public LibroService() {
        this.dao = new LibroDAO();
    }
    
    public Libro crearLibro(String titulo,int anio,int ejemplares, Autor autor, Editorial editorial) throws Exception{
        
        System.out.println("[Creando Libro]");
        
        Libro libro = new Libro();
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        try{
        dao.guardarLibro(libro);
        } catch ( Exception e){
            System.out.println(" Error al ingresar Libro ");
        }
        return libro;   
    }
    
    public Libro editarLibro (Long Id,String titulo,int anio,int ejemplares, Autor autor, Editorial editorial) throws Exception{
        
        System.out.println("[Editando Libro]");
        
        Libro libro = new Libro();
        
        libro.setIsbn(Id);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        try{
        dao.guardarLibro(libro);
        } catch ( Exception e){
            System.out.println(" Error al editar Libro ");
        }
        return libro;   
    }
    
    
    public void darDeAltaLibro(Long id) throws Exception {
        
        System.out.println("[Dando de Alta Libro]");
        
        dao.darDeAltaLibro(id);
        
    }

    public void darDeBajaLibro(Long id) throws Exception {
        
        System.out.println("[Dando de Baja Libro]");
        
        dao.darDeAltaLibro(id);
    }
    
    
    public void buscarLibroPorId(long id) throws Exception {
        
        Libro libro;
        try{
        libro = dao.buscarLibroPorID(id);
        System.out.println(libro.toString());
        } catch ( Exception e){
            System.out.println(e.toString());
            System.out.println("No se encontro el ID");
        }
        
    }
    
    public void buscarLibroPorNombre(String nombre) throws Exception {
        try{
        Libro libro;
        
        libro = dao.buscarLibroporNombre(nombre);
        
        System.out.println(libro.toString());
        } catch ( Exception e){
            System.out.println(e);
            System.out.println("No se encontro el nombre");
        }
    }
    
    public void buscarLibroPorNombreAutor(String nombre) throws Exception {
        
        List<Libro> libro;
        try{
        libro = dao.buscarLibrosPorNombreAutor(nombre);
        libro.forEach((libro1) -> {
            System.out.println(libro1.toString());
            });
        } catch ( Exception e){
            System.out.println("No se encontro el nombre");
        }
        
       
    }
    
    public void buscarLibroPorNombreEditorial(String nombre) throws Exception {
        
        List<Libro> libro;
        try{
        libro = dao.buscarLibrosPorNombreEditorial(nombre);
        libro.forEach((libro1) -> {
            System.out.println(libro1.toString());
            });
        } catch ( Exception e){
            System.out.println("No se encontro el nombre");
        }
        
    }
}
    
    
    

