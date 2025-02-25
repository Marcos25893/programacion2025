package tema6.tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    List<Producto> inventario;
    List<Compra> historialCompras;

    public Tienda() {
        this.inventario = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }

    public void anadirCompra(Compra c){
        this.historialCompras.add(c);
    }

    public void anadirProducto(Producto p){
        this.inventario.add(p);
    }

    public void eliminarProducto(String codigo){
        for (Producto p : inventario){
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                this.inventario.remove(p);
                System.out.println("El producto se elimino");
            }
        }
    }

    public void actualizarProducto(String codigo, double nuevoprecio, int nuevoStock){
        for (Producto p : inventario){
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                p.setPrecio(nuevoprecio);
                p.setStock(nuevoStock);
                System.out.println("El producto se actualizo correctamente");
            }
        }
    }

    public void realizarCompra(String codigo, int cantidad) throws StockInsuficienteException {
        for (Producto p : inventario){
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                if (cantidad<=p.getStock()){

                    Compra cm = new Compra(p,cantidad);
                    anadirCompra(cm);

                    p.descontarStock(cantidad);
                    System.out.println("Compra realizada");
                }else{
                    throw new StockInsuficienteException("Stock insuficiente para el producto " + p.getCodigo());
                }

            }
        }
    }

    public void mostrarInventario(){
        for (Producto p : inventario){
            System.out.println((p.getInfo()));
        }
    }

    public void mostrarHistorialCompras(){
        for (Compra c : historialCompras){
            System.out.println(c.toString());
        }
    }
}
