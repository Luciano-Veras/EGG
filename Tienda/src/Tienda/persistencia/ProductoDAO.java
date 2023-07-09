package Tienda.persistencia;

import Tienda.entidades.Producto;
import java.util.ArrayList;

public final class ProductoDAO extends DAO {

    public void insertarProducto(Producto aux) throws Exception {
        try {
            if (aux == null) {
                throw new Exception("Debe indicar un producto que desea agregar");
            }
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES (" + aux.getCodigo() + ", '" + aux.getNombre() + "', " + aux.getPrecio()
                    + ", " + aux.getCodigoFabricante() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarProducto(Producto aux) throws Exception {
        try {
            if (aux == null) {
                throw new Exception("Debe indicar un producto que desea modificar");
            }
            String sql = "UPDATE Producto SET nombre = '" + aux.getNombre() + "', "
                    + "precio = " + aux.getPrecio() + ", codigo_fabricante = "
                    + aux.getCodigoFabricante() + " WHERE codigo = " + aux.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE codigo = " + codigo + ";";
            consultarBase(sql);

            Producto aux = null;
            while (resultado.next()) {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();

            return aux;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public ArrayList<String> nombreProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto;";
            consultarBase(sql);

            ArrayList<String> nombres = new ArrayList();
            while (resultado.next()) {
                String nombre = resultado.getString(1);
                nombres.add(nombre);
            }
            desconectarBase();
            return nombres;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }

    public ArrayList<String> nombrePrecioProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM Producto;";
            consultarBase(sql);

            ArrayList<String> nombrePrecio = new ArrayList();
            while (resultado.next()) {
                String cadena = "Nombre : " + resultado.getString(1) + ", Precio: $" + resultado.getDouble(2);
                nombrePrecio.add(cadena);
            }
            desconectarBase();
            return nombrePrecio;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }

    public ArrayList<Producto> productos120as202() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 AND 202;";
            consultarBase(sql);

            Producto aux = null;
            ArrayList<Producto> precio120202 = new ArrayList();
            while (resultado.next()) {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));
                precio120202.add(aux);
            }
            desconectarBase();
            return precio120202;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }

    public ArrayList<Producto> portatiles() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%portatil%';";
            consultarBase(sql);

            Producto aux = null;
            ArrayList<Producto> portatiles = new ArrayList();
            while (resultado.next()) {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));
                portatiles.add(aux);
            }
            desconectarBase();
            return portatiles;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public ArrayList<String> productosMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM Producto WHERE precio = "
                    + "(SELECT MIN(precio) FROM producto);";
            consultarBase(sql);

            ArrayList<String> masBarato = new ArrayList();

            while (resultado.next()) {
                String cadena = "Nombre: " + resultado.getString(1) + ", Precio: $" + resultado.getDouble(2);
                masBarato.add(cadena);
            }
            desconectarBase();
            return masBarato;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }
}
