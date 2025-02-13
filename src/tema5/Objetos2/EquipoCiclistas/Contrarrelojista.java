package tema5.Objetos2.EquipoCiclistas;

public class Contrarrelojista extends Ciclista{

    private Integer velocidadMaxima;

    public Contrarrelojista(Integer identificador, String nombre, Double tiempoAcumulado,
                            Integer velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contrarrelojista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append(", velocidadMaxima=").append(velocidadMaxima);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }


}
