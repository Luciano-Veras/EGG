
package estancias.persistencia;

import estancias.entidades.clientes;

public final class clientesDAO extends DAO {
    
    public clientes buscarClientePorId(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM clientes WHERE id_cliente = " + codigo + ";";
            consultarBase(sql);
            
            clientes auxc = null;
            
            if (resultado.next()) {
                auxc = new clientes();
                auxc.setIdCliente(resultado.getInt(1));
                auxc.setNombre(resultado.getString(2));
                auxc.setCalle(resultado.getString(3));
                auxc.setNumeroCalle(resultado.getInt(4));
                auxc.setCodigoPostal(resultado.getString(5));
                auxc.setCiudad(resultado.getString(6));
                auxc.setPais(resultado.getString(7));
                auxc.setEmail(resultado.getString(8));
            }
            
            desconectarBase();
            return auxc;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
}
