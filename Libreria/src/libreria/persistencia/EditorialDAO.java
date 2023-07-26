package libreria.persistencia;

import java.util.Collection;
import javax.persistence.NoResultException;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {

    public void guardarEditorial(Editorial auxE) throws Exception {
        try {
            Editorial aux = buscarEditorialPorNombre(auxE.getNombre());
            if (aux != null) {
                throw new Exception("Ya existe editorial registrada con el nombre indicado");
            } else {
                super.guardar(auxE);
                System.out.println("--Guardado Exitoso--");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void editarEditorial(Editorial auxE) throws Exception {
        try {
            super.editar(auxE);
            System.out.println("--Edicion exitosa--");
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarEditorial(Editorial auxE) throws Exception {
        try {
            super.eliminar(auxE);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Editorial> listarEditoriales() throws Exception {
        try {
            super.conectar();
            Collection<Editorial> auxElist = em.createQuery("SELECT a FROM Editorial a").getResultList();
            super.desconectar();
            return auxElist;
        } catch (NoResultException e) {
            super.desconectar();
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial buscarEditorialPorNombre(String nombre) throws Exception {
        try {
            if (nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("Debe indicar un nombre valido");
            }
            super.conectar();
            //en Query tipiear nombre de entidad respetando mayusculas y minusculas y setear siempre , Editorial.class o (Editorial) 
            Editorial aux = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre", Editorial.class).
                    setParameter("nombre", nombre).getSingleResult();
            super.desconectar();
            return aux;
        } catch (NoResultException e) {
            System.out.println("No existen editriales registradas con el nombre");
            super.desconectar();
            return null;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public Editorial buscarEditorialPorId(Integer id) throws Exception {
        try {
            super.conectar();
            Editorial aux = em.find(Editorial.class, id);
            if (aux == null) {
                System.out.println("No existe editorial con id indicado");
                super.desconectar();
                return null;
            }
            super.desconectar();
            return aux;
        }  catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }
}