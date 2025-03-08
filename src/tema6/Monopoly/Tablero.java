package tema6.Monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<>();

        for(int i=0;i<15;i++){
            Casilla c = new Propiedad("C"+i, i,numero_aleatorio(200,350),numero_aleatorio(10,500));
            this.casillas.add(c);
        }
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void addCasilla(Casilla c){
        this.casillas.add(c);
    }

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }


    public String mover(Jugadores j){

        StringBuffer sb = new StringBuffer();
        int numero=0;
        int posicion=0;
        numero=numero_aleatorio(1,6);
        posicion = j.getPosicionJugador()+numero;

        sb.append("El jugador esta en la casilla " + j.getPosicionJugador());
        sb.append(". El jugador se mueve " + numero);

        if (posicion>this.casillas.size()){
            posicion -= this.casillas.size();
            j.setPosicionJugador(posicion);
            cobrarSalida(j);

        }else {
            j.setPosicionJugador(posicion);

        }
        sb.append(". Y se queda en la posicion " + j.getPosicionJugador());

        return sb.toString();

    }

    public void comprar(Propiedad p, Jugadores j){
        int opcion = 0;

        if (j.getPosicionJugador().equals(p.getPosicion())){
            if (p.getComprado()){
                j.setDinero(j.getDinero()-p.getPrecioCasilla());

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

    public void cobrarSalida(Jugadores j){
        j.setDinero(j.getDinero()+200);
    }




}
