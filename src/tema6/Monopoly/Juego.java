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

    public String ganador(){
        StringBuffer sb = new StringBuffer();
        double suma =0.0;
        double ganador = 0.0;
        Jugadores ju = new Jugadores("");
        for (Jugadores j : jugadores){
            suma =j.getDinero();

            for (Propiedad p : j.getPropiedad()){
                suma +=p.getPrecioCompra();
                System.out.println(suma);
            }
            sb.append("Jugador=" + j.getNombre()).append(", Patrimonio=").append(suma).append("\n");

            if (ganador<suma){
                ganador=suma;
                ju=j;
            }

        }

        sb.append("El ganador es " + ju.getNombre());

        return sb.toString();
    }


}
