package tema6.Monopoly;

public class Casilla {

    protected String nombre;
    protected Integer posicion;

    public Casilla(String nombre, Integer posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Casilla{" +
                "nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                '}';
    }


}
