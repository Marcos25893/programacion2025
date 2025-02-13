package tema5.Objetos2.EquipoCiclistas;

public class Velocista extends Ciclista{

    private Double potenciaPromedio;
    private Double velocidadPromedio;

    public Velocista(Integer identificador, String nombre,
                     Double tiempoAcumulado, Double potenciaPromedio, Double velocidadPromedio) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public Double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(Double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public Double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(Double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Velocista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append(", potenciaPromedio=").append(potenciaPromedio);
        sb.append(", velocidadPromedio=").append(velocidadPromedio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "Velocista";
    }
}
