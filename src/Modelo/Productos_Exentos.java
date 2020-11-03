
package Modelo;


public class Productos_Exentos extends Producto
{

    public Productos_Exentos(String id, String nombre, double precio, int cantidad) {
        super(id, nombre, precio, cantidad);
    }

    public Productos_Exentos() {
        super();
    }

    
    @Override
    public int gravamen() {
        return 0;
    }
    
}
