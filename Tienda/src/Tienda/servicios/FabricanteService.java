package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre) throws Exception {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }

            Fabricante aux = new Fabricante();
            aux.setNombre(nombre);

            dao.insertarFabricante(aux);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarNombreFabricante(int codigo, String nombre) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }

            Fabricante aux = dao.buscarFabricantePorCodigo(codigo);
            if (aux == null) {
                throw new Exception("No se econtro el fabricante con el codigo indicado");
            }
            aux.setNombre(nombre);

            dao.modificarFabricante(aux);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarFabricante(int codigo) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codigo");
            }

            Fabricante aux = dao.buscarFabricantePorCodigo(codigo);
            if (aux == null) {
                throw new Exception("No se econtro el fabricante con el codigo indicado");
            }

            dao.eliminarFabricante(codigo);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
