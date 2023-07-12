package Tienda.servicios;

import Tienda.entidades.Producto;
import Tienda.persistencia.ProductoDAO;
import java.util.ArrayList;


public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(String nombre, Double precio, int codigoFabricante) throws Exception {
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }
            if (precio < 0) {
                throw new Exception("Debe indicar un precio valido");
            }
            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar un codigo");
            }

            Producto aux = new Producto();
            aux.setNombre(nombre);
            aux.setPrecio(precio);
            aux.setCodigoFabricante(codigoFabricante);

            dao.insertarProducto(aux);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarProducto(int codigo, String nombre, Double precio, int codigoFabricante) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codgio");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }
            if (precio < 0) {
                throw new Exception("Debe indicar un precio valido");
            }
            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar un codgio de fabricante");
            }

            Producto aux = dao.buscarProductoPorCodigo(codigo);
            if (aux == null) {
                throw new Exception("No se encontro producto con el codigo ingresado");
            }
            aux.setNombre(nombre);
            aux.setPrecio(precio);
            aux.setCodigoFabricante(codigoFabricante);

            dao.modificarProducto(aux);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codigo valido");
            }

            Producto aux = dao.buscarProductoPorCodigo(codigo);
            if (aux == null) {
                throw new Exception("No se encontro producto con el codigo ingresado");
            }

            dao.eliminarProducto(codigo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void nombresProducto() throws Exception {
        try {
            ArrayList<String> nombres = dao.nombreProductos();
            if (nombres.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            }
            imprimir(nombres);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void nombrePrecioProducto() throws Exception {
        try {
            ArrayList<String> nombrePrecio = dao.nombrePrecioProductos();
            if (nombrePrecio.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            }
            imprimir(nombrePrecio);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void precio120202() throws Exception {
        try {
            ArrayList<Producto> precio120202 = dao.productos120as202();
            if (precio120202.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            }
            imprimir(precio120202);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void portatiles() throws Exception {
        try {
            ArrayList<Producto> portatiles = dao.portatiles();
            if (portatiles.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            }
            imprimir(portatiles);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void masBarato() throws Exception {
        try {
            ArrayList<String> masBarato = dao.productosMasBarato();
            if (masBarato.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            }
            imprimir(masBarato);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void imprimir(ArrayList aux) throws Exception {
        try {
            if (aux.isEmpty()) {
                throw new Exception("No existen datos para mostrar");
            } else {
                for (Object elementos : aux) {
                    System.out.println(elementos.toString());
                }
            }
        } catch (Exception ex) {
            throw ex;
        }

    }
}
