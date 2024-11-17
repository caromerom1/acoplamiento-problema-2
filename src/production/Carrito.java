package production;

import java.util.ArrayList;

public class Carrito {
    public ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<Producto>();
    }

    public double darPrecio() {
        double precio = 0;
        for (Producto producto : this.productos) {
            precio += producto.precio;
        }
        return precio;
    }

}
