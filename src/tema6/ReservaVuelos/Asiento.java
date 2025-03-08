package tema6.ReservaVuelos;

import java.util.Objects;
import java.util.UUID;

public abstract class Asiento {

    protected UUID id;
    protected Pasajero pasajero;
    protected Double precioBase;
    protected Integer fila;
    protected String letra;
    protected TipoAsiento tipoAsiento;

    public Asiento(Double precioBase, Integer fila, String letra) {
        this.id=UUID.randomUUID();
        this.precioBase = precioBase;
        this.fila = fila;
        this.letra = letra;
    }

    public UUID getId() {
        return id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "id=" + id +
                ", pasajero=" + pasajero.getDniPasaporte() +
                ", precioBase=" + precioBase +
                ", fila=" + fila +
                ", letra='" + letra + '\'' +
                ", tipoAsiento=" + tipoAsiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getCodigo(){
        StringBuffer sb = new StringBuffer();
        sb.append("Fila " + getFila());
        sb.append(", Asiento " + getLetra());

        return sb.toString();
    }

    public abstract Double calcularPrecio();
}
