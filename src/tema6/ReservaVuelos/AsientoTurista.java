package tema6.ReservaVuelos;

public class AsientoTurista extends Asiento {

    private boolean ventana;

    public AsientoTurista(Double precioBase, Integer fila, String letra, boolean ventana) {
        super(precioBase, fila, letra);
        this.ventana = ventana;
        this.tipoAsiento=TipoAsiento.TURISTA;
    }

    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "AsientoTurista{" +
                "precioBase=" + precioBase +
                ", tipoAsiento=" + tipoAsiento +
                ", id=" + id +
                ", ventana=" + ventana +
                ", pasajero=" + pasajero.getDniPasaporte() +
                '}';
    }

    @Override
    public Double calcularPrecio() {
        double precioTotal=0;

        precioTotal=this.precioBase;
        if (ventana){
            precioTotal+=10;
        }

        return precioTotal;
    }
}
