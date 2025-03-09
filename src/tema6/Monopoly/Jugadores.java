package tema6.Monopoly;

import java.util.ArrayList;

public class Jugadores {

    private Integer posicionJugador;
    private String nombre;
    private Integer dinero;
    private ArrayList<Propiedad> propiedad;

    public Jugadores(String nombre) {
        this.posicionJugador =0 ;
        this.nombre = nombre;
        this.dinero = 1500;
        this.propiedad = new ArrayList<>();
    }

    public Integer getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(Integer posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedad> getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(ArrayList<Propiedad> propiedad) {
        this.propiedad = propiedad;
    }

    public void addPropiedad(Propiedad p){
        if (!this.propiedad.contains(p)) {
            this.propiedad.add(p);
            p.addPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "posicionJugador=" + posicionJugador +
                ", nombre='" + nombre + '\'' +
                ", dinero=" + dinero +
                ", propiedad=" + propiedad +
                '}';
    }
}
