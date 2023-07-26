package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = emf.createEntityManager();

    protected void conectar() throws Exception {
        if(!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }
    
    protected void desconectar() throws Exception {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    protected void guardar(T object) throws Exception {
        conectar();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void editar(T object) throws Exception {
        conectar();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void eliminar(T object) throws Exception {
        conectar();
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        desconectar();
    }
}
