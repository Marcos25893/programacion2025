package tema5.EjerciciosPracticarPOO.Ejercicio8;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {

    private ArrayList<CuentaBancaria> cuentaBancarias;

    public Banco() {
        this.cuentaBancarias = new ArrayList<>();
    }

    public void addCuenta(CuentaBancaria cb){
        this.cuentaBancarias.add(cb);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "cuentaBancarias=" + cuentaBancarias +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(cuentaBancarias, banco.cuentaBancarias);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cuentaBancarias);
    }

    public CuentaBancaria getCuenta(CuentaBancaria numeroDeCuenta){
        for (CuentaBancaria cuenta : cuentaBancarias){
            if (cuenta.equals(numeroDeCuenta)){
                return cuenta;
            }
        }
        return null;
    }
}
