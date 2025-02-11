package tema5.EjerciciosPracticarPOO.Ejercicio8;

import java.util.Objects;

public class Tarjeta2 {

    protected String numero;
    protected Double saldo;

    public Tarjeta2(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tarjeta{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarjeta2 tarjeta2 = (Tarjeta2) o;
        return Objects.equals(numero, tarjeta2.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
