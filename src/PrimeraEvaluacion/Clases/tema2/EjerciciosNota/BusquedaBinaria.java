package PrimeraEvaluacion.Clases.tema2.EjerciciosNota;

import java.util.Objects;
import java.util.Scanner;

public class BusquedaBinaria {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static void main(String[] args) {
        int numeroMaquina=0, numeroElegido=0, numeroMayor=100, numeroMenor=1;
        int contador=0;
        String comprobar="";
        Scanner sc = new Scanner(System.in);
        while (numeroElegido<1 || numeroElegido>100) {
            try {
                System.out.println("Elige un numero");
                numeroElegido = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error, valor no valido");
            }
        }
        numeroMaquina=tirada(100,1);
        System.out.println(numeroMaquina);

        while(numeroElegido!=numeroMaquina){
            try {
                System.out.println("Tu numero es mayor, menor o igual");
                comprobar = sc.nextLine();
            }catch (Exception ex){
                System.out.println("Error");
            }

            if (Objects.equals(comprobar, "menor")){
                numeroMayor=numeroMaquina-1;
                numeroMaquina = tirada(numeroMayor, numeroMenor);
                contador++;
            } else if (Objects.equals(comprobar, "mayor")) {
                numeroMenor=numeroMaquina+1;
                numeroMaquina = tirada(numeroMayor, numeroMenor);
                contador++;
            }else if (Objects.equals(comprobar, "igual")){
                numeroMaquina=numeroElegido;
            }

            System.out.println(numeroMaquina);
        }
        System.out.println("Ha necesitado " + contador + " intentos para acertar");
    }
}
