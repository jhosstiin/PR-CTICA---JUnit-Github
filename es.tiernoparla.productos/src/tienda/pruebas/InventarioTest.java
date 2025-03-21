package tienda.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import tienda.Producto;

public class InventarioTest {
    @Test
    void testActualizarStock() {
        Producto productoAñadido = new Producto("123", "Champu", 4.99, 5);
        Inventario miInventario = new Inventario();
        miInventario.añadirProducto(productoAñadido);
        miInventario.actualizarStock("123", 23);
        Producto productoAux = miInventario.buscarProductoPorCodigo("123");
        assertEquals(23, productoAux.getStock());
    }

    @Test
    void testAñadirProducto() {

        Inventario miInventario = new Inventario();
        Producto producto = new Producto("123", "Aceite", 5, 3);
        miInventario.añadirProducto(producto);
        List<Producto> miInventario2 = miInventario.listarProductos();
        assertEquals("123", miInventario2.get(0).getCodigo());
    }

    @Test
    void testBuscarProductoPorCodigo() {
        Inventario miInventario = new Inventario();
        Producto producto = new Producto("123", "Aceite", 5, 3);
        miInventario.añadirProducto(producto);
        // List<Producto> miInventario2 = miInventario.listarProductos();
        // miInventario.eliminarProducto(miInventario2.get(0).getCodigo());
        Producto productoExistente = miInventario.buscarProductoPorCodigo("123");

        assertNotNull(productoExistente, "Hay un objeto");
    }

    @Test
    void testEliminarProducto() {
        Inventario miInventario = new Inventario();
        Producto producto = new Producto("123", "Aceite", 5, 3);
        miInventario.añadirProducto(producto);
        miInventario.eliminarProducto("123");
        Producto productoEliminado = miInventario.buscarProductoPorCodigo("123");
        assertNull(productoEliminado, "No hay un objeto");
    }

    @Test
    void testListarProductos() {
        Inventario miInventario = new Inventario();
        Producto producto = new Producto("123", "Aceite", 5, 3);
        miInventario.añadirProducto(producto);
        Producto producto2 = miInventario.listarProductos().get(0);
        assertNotNull(producto2, "Hay el objeto");
    }
}
