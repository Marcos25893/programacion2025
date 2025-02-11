package tema5.Objetos2.BladeofDarnknessll;

import java.util.ArrayList;

public class Partida {

    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    public Partida(Jugador jugador) {
        this.monstruos= new ArrayList<>(10);
        this.jugador=jugador;
        inicarPartida(jugador);
    }

    public void inicarPartida(Jugador jugador){

        for (int i=0;i<8;i++){
            Monstruo m1 = new Monstruo("Rudol",1,35.0, Monstruo.Clase.GOBLIN,15);
                this.monstruos.add(m1);
        }

        MonstruoFinalNivel jefe1 = new MonstruoFinalNivel("Gna",7,200.0, Monstruo.Clase.FANTASMA,40,70);
        MonstruoFinalNivel jefe2 = new MonstruoFinalNivel("Isshin",9,150.0, Monstruo.Clase.DEMONIO,50,90);

        this.monstruos.add(jefe1);
        this.monstruos.add(jefe2);

        Arma espada = new Arma("Excalibur", Arma.Tipo.ESPADA,50,Boolean.TRUE);

        jugador.equipar(espada);
    }

    public boolean turnoJugador(){
        for (Monstruo monstruo : monstruos) {
            if (monstruo != null) {
                jugador.golpear(monstruo);

                if (monstruo.getSalud() <= 0) {
                    this.monstruos.remove(monstruo);
                }
                break;
            }
        }
        if (monstruos.isEmpty())
            return true;
        else
            return false;
    }

    public boolean turnoEnemigo(){
        for (Monstruo monstruo : monstruos) {
            if (monstruo != null) {
                monstruo.golpear(jugador);

                if (jugador.getSalud()<=0){
                    return true;
                }
                break;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "jugador=" + jugador +
                ", monstruos=" + monstruos +
                '}';
    }
}

