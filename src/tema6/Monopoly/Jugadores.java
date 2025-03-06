package tema6.Monopoly;

import java.util.ArrayList;

public class Jugadores {

    private Integer posicionJugador;
    private String nombre;
    private Integer dinero;
    private ArrayList<Propiedad> propiedad;

    public Jugadores(String nombre) {
        this.posicionJugador = 1;
        this.nombre = nombre;
        this.dinero = 1500;
        this.propiedad = new ArrayList<>();
    }


}
