
package Modelo;

import java.util.ArrayList;


public class Factura 
{
    private String id;
    private Fecha fecha;
    private Cliente cliente;
    private ArrayList<Producto> lista_productos;

    public Factura(String id, Fecha fecha, Cliente cliente, ArrayList<Producto> lista_productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.lista_productos = lista_productos;
    }
    
     public Factura() {
        this.id = "";
        this.fecha = new Fecha();
        this.cliente = new Cliente();
        this.lista_productos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(ArrayList<Producto> lista_productos) {
        this.lista_productos = lista_productos;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fecha=" + fecha + ", cliente=" + cliente + ", lista_productos=" + lista_productos + '}';
    }
}
