package tema6.Monopoly;

import java.util.ArrayList;

public class Impuesto extends CasillasEspeciales{

    private ArrayList<Carta> cartas;


    public Impuesto(String nombre, Integer posicion) {
        super(nombre, posicion);
        this.cartas = new ArrayList<>();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void addCartas(Carta carta){
        this.cartas.add(carta);
    }

    @Override
    public int pagar(Jugadores j) {
        j.setDinero(j.getDinero()-getCartas().get(0).getPrecioCarta());

        return j.getDinero();
    }
}
