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
                "precio=" + this.calcularPrecio() +
                ", tipoAsiento=" + tipoAsiento +
                ", codigo=" + this.getCodigo() +
                ", ventana=" + ventana +
                ", pasajero=" + pasajero.getDniPasaporte() +
                '}';
    }

    @Override
    public Double calcularPrecio() {
        if (ventana){
            this.precioBase+=10;
        }
        return this.precioBase;
    }
}
