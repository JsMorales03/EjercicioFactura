
package Modelo;


public class Productos_Basicos extends Productos_Gravados
{

    public Productos_Basicos(String id, String nombre, double precio, int cantidad) {
        super(id, nombre, precio, cantidad);
    }

    public Productos_Basicos() {
        super();
    }
    
    @Override
    public int gravamen()
    {
        return 5;
    }
}
