package tema6.Monopoly;

public class Carcel extends CasillasEspeciales{


    public Carcel(String nombre, Integer posicion) {
        super(nombre, posicion);
    }

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }

    public boolean lanzarDados(){
        int numero=0;

        numero=numero_aleatorio(1,6);

        if (numero==6){
            return true;
        }else
            return false;
    }

    @Override
    public int pagar(Jugadores j){
        if (!lanzarDados()){
            j.setDinero(j.getDinero()-precio);
        }
        return j.getDinero();
    }
}
