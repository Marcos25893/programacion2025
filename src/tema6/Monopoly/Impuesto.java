package tema6.Monopoly;

public class Impuesto extends CasillasEspeciales{


    public Impuesto(String nombre, Integer posicion) {
        super(nombre, posicion);
    }

    @Override
    public int pagar(Jugadores j) {
        j.setDinero(j.getDinero()-precio);

        return j.getDinero();
    }
}
