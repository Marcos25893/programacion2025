package tema6.Monopoly;

public abstract class CasillasEspeciales extends Casilla{

    protected static final Integer precio=50;

    public CasillasEspeciales(String nombre, Integer posicion) {
        super(nombre, posicion);

    }

    public abstract int pagar(Jugadores j);
}
