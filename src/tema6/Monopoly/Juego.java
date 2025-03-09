package tema6.Monopoly;



import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Jugadores> jugadores;
    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.jugadores = new ArrayList<>();
        this.tablero = tablero;

    }

    public void addJugadores(Jugadores j){
        this.jugadores.add(j);
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void addJugador(Jugadores j){
        this.jugadores.add(j);
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

    public Jugadores ganador(){
        double suma =0.0;
        double ganador = 0.0;
        Jugadores ju = new Jugadores("");
        for (Jugadores j : jugadores){
            suma =j.getDinero();
            for (Propiedad p : j.getPropiedad()){
                suma +=p.getPrecioCompra();
                System.out.println(suma);
            }
            if (ganador<suma){
                ju=j;
            }
        }

        return ju;
    }


}
