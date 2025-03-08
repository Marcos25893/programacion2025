package tema6.Monopoly;

public class Multa extends CasillasEspeciales{

    public Multa(String nombre, Integer posicion) {
        super(nombre, posicion);
    }

    @Override
    public int pagar(Jugadores j) {
        j.setDinero(j.getDinero()-precio);

        return j.getDinero();
    }


}
