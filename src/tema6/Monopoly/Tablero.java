package tema6.Monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<>();

        for(int i=0;i<15;i++){
            int numero;
            numero=numero_aleatorio(1,10);

            if (i==0) {
                Casilla c = new Casilla("Salida",i);
                this.casillas.add(c);
            }else if (i==7){
                CasillasEspeciales ce = new Carcel("Carcel", i);
                this.casillas.add(ce);
            }else {

                if (numero<=8) {
                    Casilla c = new Propiedad("C" + i, i, numero_aleatorio(200, 450), numero_aleatorio(10, 150));
                    this.casillas.add(c);
                }else if (numero==9){
                    CasillasEspeciales ce = new Multa("Multa", i);
                    this.addCasilla(ce);
                }else{
                    CasillasEspeciales ce = new Impuesto("Impuesto", i);
                    this.casillas.add(ce);
                }
            }
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

        comprobar(j);


        return sb.toString();

    }



    public void comprobar(Jugadores j){

        Casilla casillaActual = casillas.get(j.getPosicionJugador());
        if (casillaActual instanceof Propiedad){
            ((Propiedad) casillaActual).comprar((Propiedad) casillaActual,j);
        }else if (casillaActual instanceof Multa){
            ((Multa) casillaActual).pagar(j);
        } else if (casillaActual instanceof  Impuesto) {
            ((Impuesto) casillaActual).pagar(j);
        } else if (casillaActual instanceof Carcel) {
            ((Carcel) casillaActual).pagar(j);
        }

    }




    public void cobrarSalida(Jugadores j){
        j.setDinero(j.getDinero()+200);
    }




}
