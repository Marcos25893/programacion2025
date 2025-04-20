package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;

public class Transaccion {

    private long id;
    private Cuenta cuenta;
    private Double importe;
    private LocalDate fecha;
    private TipoTransaccion tipo;
    private String descripcion;
    private static long valor=1;

    public Transaccion(Cuenta cuenta, Double importe, LocalDate fecha, TipoTransaccion tipo, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        id=valor++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fehca) {
        this.fecha = fehca;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | " + "Cuenta: " + getCuenta() +
                " | " + tipo + " de " + importe + "€ el " +
                fecha + " - " + descripcion;
    }
}
