package tema6.Monopoly;

import tema4.Practica1.bladedark.Jugador;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugadores> jugadores;
    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.jugadores = new ArrayList<>();
        this.tablero = tablero;

    }

    public void addJugadores(Jugadores j){
        this.jugadores.add(j);
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void addJugador(Jugadores j){
        this.jugadores.add(j);
    }
}
