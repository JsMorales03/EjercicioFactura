
package Modelo;


public class Producto_General extends Productos_Gravados
{

    public Producto_General(String id, String nombre, double precio, int cantidad) {
        super(id, nombre, precio, cantidad);
    }

    public Producto_General() {
        super();
    }
    
    @Override
    public int gravamen() {
        return 19;
    }
    
}
