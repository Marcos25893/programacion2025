package tema6.Monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Propiedad extends Casilla{

    Scanner sc = new Scanner(System.in);


    private Integer precioCompra;
    private Integer precioCasilla;
    private ArrayList<Jugadores> propietarios;
    private boolean comprado;

    public Propiedad(String nombre, Integer posicion, Integer precioCompra, Integer precioCasilla) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioCasilla = precioCasilla;
        this.propietarios=new ArrayList<>();
        this.comprado=false;
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

    public ArrayList<Jugadores> getPropietarios() {
        return propietarios;
    }

    public void addPropietario(Jugadores jugador){
        if (!this.propietarios.contains(jugador)){
            this.propietarios.add(jugador);
            jugador.addPropiedad(this);
        }
    }

    public void setPropietarios(ArrayList<Jugadores> propietarios) {
        this.propietarios = propietarios;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "precioCompra=" + precioCompra +
                ", precioCasilla=" + precioCasilla +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                '}';
    }

    public void comprar(Propiedad p, Jugadores j){
        int opcion = 0;

        Jugadores dueno;

        if (j.getPosicionJugador().equals(p.getPosicion())){
            if (p.isComprado()){
                j.setDinero(j.getDinero()-p.getPrecioCasilla());
                dueno= p.getPropietarios().get(p.getPosicion());
                dueno.setDinero(dueno.getDinero()+p.getPrecioCasilla());

            } else{
                while(opcion!=1 && opcion!=2){
                    System.out.println("¿Quieres comprar la casilla?, 1.Si-2.NO ");
                    opcion=Integer.parseInt(sc.nextLine());

                    if (opcion==1){
                        if (j.getDinero()>=p.getPrecioCompra()){
                            j.setDinero(j.getDinero()-p.getPrecioCompra());
                            j.addPropiedad(p);
                            p.setComprado(true);
                        }
                    }
                }

            }
        }
    }
}
