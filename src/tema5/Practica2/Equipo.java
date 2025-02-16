package tema5.Practica2;

public abstract class Equipo {

    protected String nombre;
    protected Integer nivel;

    public Equipo(String nombre, Integer nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    public abstract int calcularPuntos();
}
