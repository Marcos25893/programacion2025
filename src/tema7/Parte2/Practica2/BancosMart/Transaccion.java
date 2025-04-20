package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;

public class Transaccion {

    private static long id=1;
    private Cuenta cuenta;
    private Double importe;
    private LocalDate fecha;
    private TipoTransaccion tipo;
    private String descripcion;

    public Transaccion(Cuenta cuenta, Double importe, LocalDate fecha, TipoTransaccion tipo, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        id=id++;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Transaccion.id = id;
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
