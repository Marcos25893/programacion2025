package tema6.Monopoly;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugadores> jugadores;
    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.jugadores = new ArrayList<>();
        this.tablero = tablero;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }
}
