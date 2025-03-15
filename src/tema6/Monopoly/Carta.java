package tema6.Monopoly;

public class Carta {

    private String descripcion;
    private Integer precioCarta;

    public Carta(String descripcion, Integer precioCarta) {
        this.descripcion = descripcion;
        this.precioCarta = precioCarta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecioCarta() {
        return precioCarta;
    }

    public void setPrecioCarta(Integer precioCarta) {
        this.precioCarta = precioCarta;
    }

    @Override
    public String toString() {
        return "Cartas{" +
                "descripcion='" + descripcion + '\'' +
                ", precioCarta=" + precioCarta +
                '}';
    }
}
