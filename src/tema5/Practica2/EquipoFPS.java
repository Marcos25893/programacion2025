package tema5.Practica2;

public class EquipoFPS extends Equipo{

    private int punteria;

    public EquipoFPS(String nombre, Integer nivel, int punteria) {
        super(nombre, nivel);
        this.punteria = punteria;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    @Override
    public String toString() {
        return "EquipoFPS{" +
                "nombre='" + nombre + '\'' +
                ", punteria=" + punteria +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public int calcularPuntos() {
        return getNivel()+(this.punteria*5);
    }
}
