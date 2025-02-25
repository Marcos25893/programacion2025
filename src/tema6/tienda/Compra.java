package tema6.tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {

    private LocalDate fecha;
    private Producto producto;
    private Integer cantidad;
    private Double precioTotal;


    public Compra(Producto producto, Integer cantidad) {
        this.fecha = LocalDate.now();
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = producto.getPrecio()*cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto.getInfo());
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

}
