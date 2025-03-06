package tema6.Monopoly;

public class Propiedad extends Casilla{

    private Integer precioCompra;
    private Integer precioCasilla;

    public Propiedad(String nombre, Integer posicion, Integer precioCompra, Integer precioCasilla) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioCasilla = precioCasilla;
    }

}
