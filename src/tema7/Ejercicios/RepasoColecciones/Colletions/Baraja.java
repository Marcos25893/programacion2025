package tema7.Ejercicios.RepasoColecciones.Colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baraja {

    //Numeros:1(A),2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
    //Palos:Diamantes, Corazones, Treboles, Picas

    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        //Añadir cartas
        for (int i=1; i<=13; i++){
            this.cartas.add(new Carta(i, "Diamantes"));
            this.cartas.add(new Carta(i, "Corazones"));
            this.cartas.add(new Carta(i, "Treboles"));
            this.cartas.add(new Carta(i, "Picas"));
        }

        //Barajar las cartas
        Collections.shuffle(cartas);

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Baraja{");
        sb.append("cartas=\n");
        for (Carta c : cartas){
            sb.append(Baraja.pintarCarta(c));
        }
        sb.append('}');
        return sb.toString();
    }


    public static StringBuffer pintarCarta(Carta c){
        StringBuffer sb = new StringBuffer();
        switch (c.getNumero()){
            case 2,3,4,5,6,7,8,9,10:
                sb.append(c.getNumero() + " de " + c.getPalo()).append("\n");
                break;
            case 1:
                sb.append("As de " + c.getPalo()).append("\n");
                break;
            case 11:
                sb.append("Jota de " + c.getPalo()).append("\n");
                break;
            case 12:
                sb.append("Reina de " + c.getPalo()).append("\n");
                break;
            case 13:
                sb.append("Rey de " + c.getPalo()).append("\n");
                break;
        }
        return sb;
    }

    public Carta sacarCartaArriba(){
        return cartas.removeFirst();
    }

    public Carta sacarCartaAbajo(){
        return cartas.removeLast();
    }

    public void barajar(){
        Collections.shuffle(cartas);
    }

    public void ordenarPorPalo(){
        cartas.sort(Comparator.comparing(Carta::getPalo));
        //Collections.sort(cartas, Comparator.comparing(Carta::getPalo));
    }

    public void ordenarPorNumero(){
        Collections.sort(cartas, Comparator.comparing(Carta::getNumero));
    }
}
