package tema5.EjerciciosClase;

import java.util.Objects;

public class TelefonoMovil {

    private String modelo;
    private String numero;
    private String codigoPais;
    private Double peso;

    public TelefonoMovil(String modelo, String numero, String codigoPais, Double peso) {
        this.modelo = modelo;
        this.numero = numero;
        this.codigoPais = codigoPais;
        this.peso = peso;
    }

    public TelefonoMovil(TelefonoMovil telefonoMovil){
        this.modelo = telefonoMovil.modelo;
        this.numero = telefonoMovil.numero;
        this.codigoPais = telefonoMovil.codigoPais;
        this.peso = telefonoMovil.peso;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelefonoMovil{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", codigoPais='").append(codigoPais).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TelefonoMovil that = (TelefonoMovil) o;
        return Objects.equals(modelo, that.modelo) && Objects.equals(numero, that.numero) && Objects.equals(codigoPais, that.codigoPais) && Objects.equals(peso, that.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, numero, codigoPais, peso);
    }
}
