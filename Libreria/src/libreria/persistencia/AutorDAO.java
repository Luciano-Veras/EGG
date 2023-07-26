package libreria.persistencia;

import java.util.Collection;
import javax.persistence.NoResultException;


import libreria.entidades.Autor;

public final class AutorDAO extends DAO<Autor> {

    public Autor buscarAutorNombre(String nombre) throws Exception {
        try {
            super.conectar();
            Autor aux = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre like :nombre").
                    setParameter("nombre", nombre).getSingleResult();
            super.desconectar();
            return aux;
        } catch (NoResultException e) {
            super.desconectar();
            System.out.println("No se econtro autor registrado con el nombre indicado");
            return null;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public Autor buscarAutorId(Integer id) throws Exception {
        Autor aux;
        try {
            conectar();
            aux = em.find(Autor.class, id);
            if (aux == null) {
                throw new NullPointerException("No se econtro autor con el id indicado");
            }
            desconectar();
            return aux;
        } catch (NullPointerException e) {
            desconectar();
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Autor> listarAutores() throws Exception {
        try {
            conectar();
            Collection<Autor> auxL = em.createQuery("SELECT a FROM Autor a").getResultList();
            if (auxL.isEmpty()) {
                desconectar();
                return null;
            }
            desconectar();
            return auxL;
        } catch (Exception e) {
            desconectar();
            throw e;
        }

    }

    @Override
    public void eliminar(Autor object) throws Exception {
        super.eliminar(object);
    }

    @Override
    public void editar(Autor object) throws Exception {
        try {
            if (object == null) {
                throw new Exception("Debe indicar un autor");
            }
            super.editar(object);
            System.out.println("Edicion exitosa");
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void guardar(Autor object) throws Exception {
        try {
            if (object == null) {
                throw new NullPointerException("Debe indicar un autor");
            }
            Autor aux = buscarAutorNombre(object.getNombre());
            if (aux == null) {
                super.guardar(object);
                System.out.println("Guardado Exitoso");
            } else {
                System.out.println("El autor ya esta registrado, su id es: " + aux.getId());
            }
        } catch (Exception e) {
            throw e;
        }

    }

}
