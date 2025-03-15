package tema6.Monopoly;

import java.util.ArrayList;

public class Multa extends CasillasEspeciales{

    private ArrayList<Carta> cartas;

    public Multa(String nombre, Integer posicion) {
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

    public void removeCartas(Carta carta){
        this.cartas.remove(carta);
    }

    @Override
    public int pagar(Jugadores j) {
        Carta carta = getCartas().get(0);
        j.setDinero(j.getDinero()-carta.getPrecioCarta());
        removeCartas(carta);
        addCartas(carta);

        return j.getDinero();
    }


}
