package tema5.Practica2;

public class EquipoMOBA extends Equipo{

    private int estrategia;

    public EquipoMOBA(String nombre, Integer nivel, int estrategia) {
        super(nombre, nivel);
        this.estrategia = estrategia;
    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String toString() {
        return "EquipoMOBA{" +
                "nombre='" + nombre + '\'' +
                ", estrategia=" + estrategia +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public int calcularPuntos() {
        return getNivel()*this.estrategia;
    }
}
