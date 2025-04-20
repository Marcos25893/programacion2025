package tema7.Parte2.Practica2.BancosMart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {

    private UUID id;
    private Cliente propietario;
    private Double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(Cliente propietario) {
        this.id = UUID.randomUUID();
        this.propietario = propietario;
        this.saldo = 0.0;
        this.transacciones = new ArrayList<>();
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public UUID getId() {
        return id;
    }

    public boolean addTransaccion (Transaccion t){
        if(nuevoSaldo(t.getImporte(),t.getTipo())) {
            transacciones.add(t);
            return true;
        }else
            return false;
    }

    public boolean nuevoSaldo(Double cantidad, TipoTransaccion tipo){
        if (tipo.equals(TipoTransaccion.INGRESO)) {
            saldo += cantidad;
            return true;
        }else if (tipo.equals(TipoTransaccion.GASTO)) {
            if (saldo>=cantidad) {
                saldo -= cantidad;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return id + " - " +
                getPropietario().getDni() + " | " +
                "Saldo: " + saldo + "€";
    }
}
