
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Producto_General;
import Modelo.Productos_Basicos;
import Modelo.Productos_Exentos;
import Vista.InOut;

import java.util.ArrayList;


public class Controlador 
{
    InOut ob;
    Cliente objCliente;
    Producto_General objPG;
    Productos_Basicos objPB;
    Productos_Exentos objPE;
    Factura objFactura;
    ArrayList<Producto> lista_productos;
    ArrayList<Factura> lista_facturas;

    public Controlador(InOut ob, Cliente objCliente, Producto_General objPG, Productos_Basicos objPB, Productos_Exentos objPE, Factura objFactura, ArrayList<Producto> lista_productos, ArrayList<Factura> lista_facturas) {
        this.ob = ob;
        this.objCliente = objCliente;
        this.objPG = objPG;
        this.objPB = objPB;
        this.objPE = objPE;
        this.objFactura = objFactura;
        this.lista_productos = lista_productos;
        this.lista_facturas = lista_facturas;
    }
    
    public Controlador() {
        this.ob = new InOut();
        this.objCliente = new Cliente();
        this.objPG = new Producto_General();
        this.objPB = new Productos_Basicos();
        this.objPE = new Productos_Exentos();
        this.objFactura = new Factura();
        this.lista_facturas = new ArrayList<>();
        this.lista_productos = new ArrayList<>();
    }
    
    public void iniciar()
    {
        do
        {
            int opc;
            String mensaje = "Bienvenido\n "+ 
                        "1. Registrar producto\n" + 
                        "2. Iniciar venta\n" + 
                        "3. Total facturas\n " + 
                        "Digite su opción";
            opc = ob.pedirEntero(mensaje);
            switch(opc)
            {
                case 1:
                    String id,nombre;
                    int cantidad = 0;
                    double precio = 0;
                    nombre = ob.leerTexto("Digite el nombre del producto: ");
                    id = ob.leerTexto("Digite el ID del producto: ");
                    precio = ob.pedirDecimal("Digite el precio del producto: ");
                    if(ob.confirmar("¿El producto tiene iva?"))
                    {
                        if(ob.confirmar("¿El producto tiene iva del 19%?"))
                        {
                            objPG.setId(id);
                            objPG.setNombre(nombre);
                            objPG.setPrecio(precio);
                            lista_productos.add(objPG);
                        }
                        else
                        {
                            objPB.setId(id);
                            objPB.setNombre(nombre);
                            objPB.setPrecio(precio);
                            lista_productos.add(objPB);
                        }
                    }
                    else
                    {
                        objPE.setId(id);
                        objPE.setNombre(nombre);
                        objPE.setPrecio(precio);
                        lista_productos.add(objPE);
                    }
                    break;
                case 2:
                    imprime();
                    break;
                default:
                    break;
            }
        }while(ob.confirmar("¿Desea volver al menu?"));
    }
    
    public void imprime()
    {
        for(int i=0; i<lista_productos.size(); i++)
        {
            ob.mostrar("Productos: " + lista_productos.get(i).gravamen());
        }
    }
    
    
}
