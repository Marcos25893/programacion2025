package tema6.Monopoly;

public abstract class CasillasEspeciales extends Casilla{

    public CasillasEspeciales(String nombre, Integer posicion) {
        super(nombre, posicion);

    }

    public abstract int pagar(Jugadores j);
}
