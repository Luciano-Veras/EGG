package libreria.servicios;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private EditorialDAO dao;

    public EditorialService() {
        this.dao = new EditorialDAO();
    }

    public void cargarEditoria() throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--Cargando Editoria--"
                + "\n..Ingrese nombre de la editorial");
        try {
            String nombre = leer.nextLine();
            Editorial aux = new Editorial();
            aux.setNombre(nombre);
            dao.guardarEditorial(aux);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void editarNombreEditorial() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("--Editoriales cargadas--");
            Collection<Editorial> auxElist = dao.listarEditoriales();
            if (auxElist.isEmpty()) {
                throw new NullPointerException("No existen editoriales cargadas en la base de datos");
            }
            imprimir(auxElist);
            System.out.println("Ingrese id de la editorial que desea modificar");
            int id = leer.nextInt();
            Editorial auxE = dao.buscarEditorialPorId(id);
            if (auxE != null) {
                System.out.println("Ingrese el nombre nuevo de la editorial");
                String newNombre = leer.next();
                if (newNombre.trim().isEmpty()) {
                    throw new IllegalArgumentException();
                }
                auxE.setNombre(newNombre);
                dao.editarEditorial(auxE);
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Debe ingresar un campo valido");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeBajaEditorial() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("--Mostrando Editoriales--");
            Collection<Editorial> auxEl = dao.listarEditoriales();
            if (auxEl == null) {
                throw new NullPointerException("No hay autores en la base de datos");
            }
            imprimir(auxEl);
            System.out.print("Ingrese el id del autor que desea dar de baja: ");
            Integer id = leer.nextInt();
            Editorial aux = dao.buscarEditorialPorId(id);
            if (aux != null) {
                aux.setAlta(false);
                dao.editarEditorial(aux);
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Debe ingresar dato valido");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void darDeAltaEditorial() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("--Mostrando Editoriales--");
            Collection<Editorial> auxEl = dao.listarEditoriales();
            if (auxEl == null) {
                throw new NullPointerException("No hay autores en la base de datos");
            }
            imprimir(auxEl);
            System.out.print("Ingrese el id del autor que desea dar de baja: ");
            Integer id = leer.nextInt();
            Editorial aux = dao.buscarEditorialPorId(id);
            if (aux != null) {
                aux.setAlta(true);
                dao.editarEditorial(aux);
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Debe ingresar dato valido");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimir(Collection auxC) throws Exception {
        try {
            for (Object elementos : auxC) {
                System.out.println(elementos.toString());
                System.out.println("---------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
