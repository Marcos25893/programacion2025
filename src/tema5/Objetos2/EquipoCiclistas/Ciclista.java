package tema5.Objetos2.EquipoCiclistas;

public abstract class Ciclista {

    private Integer identificador;
    private String nombre;
    private Double tiempoAcumulado=0.0;

    public Ciclista(Integer identificador, String nombre, Double tiempoAcumulado) {
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

    public abstract String imprimirTipo();
}
