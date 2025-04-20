package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;

public class Transaccion {

    private static long id=1;
    private Cuenta cuenta;
    private Double importe;
    private LocalDate fehca;
    private TipoTransaccion tipo;
    private String descripcion;

    public Transaccion(Cuenta cuenta, Double importe, LocalDate fehca, TipoTransaccion tipo, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fehca = fehca;
        this.tipo = tipo;
        this.descripcion = descripcion;
        id++;
    }
}
