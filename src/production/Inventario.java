package production;

import java.util.ArrayList;
// import hashmap
import java.util.HashMap;

public class Inventario {
    public HashMap<String, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<String, Producto>();
    }

    public void actualizarInventario(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            this.productos.remove(producto.nombre);
        }
    }
}
