package Tienda.persistencia;

import Tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public void insertarFabricante(Fabricante aux) throws Exception {
        try {
            if (aux == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO Fabricante (nombre) VALUES ( '" + aux.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarFabricante(Fabricante aux) throws Exception {
        try {
            String sql = "UPDATE Fabricante SET nombre = '" + aux.getNombre() 
                    + "' WHERE codigo = " + aux.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarFabricante(int codigo) throws Exception {
        try {
           String sql = "DELETE FROM Fabricante WHERE codigo = " + codigo + ";"; 
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante WHERE codigo = " + codigo + ";";
            consultarBase(sql);
            
            Fabricante aux = null;
            while (resultado.next()) {
                aux = new Fabricante();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return aux;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }

}
