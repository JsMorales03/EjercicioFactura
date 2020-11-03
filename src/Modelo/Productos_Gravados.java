
package Modelo;


public class Productos_Gravados extends Producto
{

    public Productos_Gravados(String id, String nombre, double precio, int cantidad) {
        super(id, nombre, precio, cantidad);
    }

    public Productos_Gravados() {
        super();
    }
    
    @Override
    public int gravamen() {
        return 0;
    }
}
