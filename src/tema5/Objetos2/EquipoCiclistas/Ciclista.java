package tema5.Objetos2.EquipoCiclistas;

public abstract class Ciclista {

    protected Integer identificador;
    protected String nombre;
    protected Double tiempoAcumulado=0.0;

    protected Ciclista(Integer identificador, String nombre, Double tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(Double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciclista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append('}');
        return sb.toString();
    }

    protected abstract String imprimirTipo();
}
