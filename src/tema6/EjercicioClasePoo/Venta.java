package tema6.EjercicioClasePoo;

import java.time.LocalDate;

public class Venta {

    private Cliente cliente;
    private Comic comic;
    private LocalDate fechaVenta;

    public Venta(Cliente cliente, Comic comic, LocalDate fechaVenta) {
        this.cliente = cliente;
        this.comic = comic;
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Venta{");
        sb.append(cliente);
        sb.append(", comic=").append(comic.getTitulo());
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}
