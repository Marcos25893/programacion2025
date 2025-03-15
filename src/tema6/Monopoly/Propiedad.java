package tema6.Monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Propiedad extends Casilla{

    Scanner sc = new Scanner(System.in);


    private Integer precioCompra;
    private Integer precioCasilla;
    private Jugadores jugador;

    public Propiedad(String nombre, Integer posicion, Integer precioCompra, Integer precioCasilla) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioCasilla = precioCasilla;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioCasilla() {
        return precioCasilla;
    }

    public void setPrecioCasilla(Integer precioCasilla) {
        this.precioCasilla = precioCasilla;
    }

    public Jugadores getJugador() {
        return jugador;
    }

    public void setJugador(Jugadores jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "posicion=" + posicion +
                ", nombre='" + nombre + '\'' +
                ", precioCasilla=" + precioCasilla +
                ", precioCompra=" + precioCompra +
                '}';
    }

    public void comprar(Propiedad p, Jugadores j){
        int opcion = 0;

        if (j.getPosicionJugador().equals(p.getPosicion())){
            if (p.getJugador()!=null){
                j.setDinero(j.getDinero()-p.getPrecioCasilla());
                p.getJugador().setDinero(p.getJugador().getDinero()+p.getPrecioCasilla());

            } else{
                while(opcion!=1 && opcion!=2){
                    System.out.println("¿Quieres comprar la casilla?, 1.Si-2.NO ");
                    opcion=Integer.parseInt(sc.nextLine());

                    if (opcion==1){
                        if (j.getDinero()>=p.getPrecioCompra()){
                            j.setDinero(j.getDinero()-p.getPrecioCompra());
                            j.addPropiedad(p);

                        }
                    }
                }

            }
        }
    }
}
