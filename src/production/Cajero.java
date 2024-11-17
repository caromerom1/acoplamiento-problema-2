package production;

import java.util.ArrayList;

public class Cajero {
    public static void procesarTransaccion(Carrito carrito, Inventario inventario) {
        double precio = carrito.darPrecio();
        System.out.println("El precio total es: " + precio);
        inventario.actualizarInventario(carrito.productos);
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("Producto 1", 1000);
        Producto producto2 = new Producto("Producto 2", 2000);
        Producto producto3 = new Producto("Producto 3", 3000);

        inventario.productos.put(producto1.nombre, producto1);
        inventario.productos.put(producto2.nombre, producto2);
        inventario.productos.put(producto3.nombre, producto3);

        Carrito carrito = new Carrito();

        carrito.productos = new ArrayList<Producto>();
        carrito.productos.add(producto1);
        carrito.productos.add(producto2);

        procesarTransaccion(carrito, inventario);
    }

}
