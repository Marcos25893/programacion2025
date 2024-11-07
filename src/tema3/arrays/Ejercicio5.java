package tema3.arrays;

public class Ejercicio5 {

    public static double tirada(int mayor, int menor){
        return (Math.random()*(mayor-menor+1)+menor);
    }

    public static void main(String[] args) {

        //Vamos a simular que tenemos un sensor de temperatura en una
        //plantación de tomates (5 y 50 grados)
        //El dispositivo toma la temperatura 120 veces al dia
        //Simula el comportamiento del sensor con un array de double
        //que represente la temperatura tomada por el sensor

        //Si la temperatura media actual es superior a un umbral (35 grados)
        //debe saltar una alarma (throw Exception)

        double suma=0;
        double dispositivo[] = new double[120];
        int contador=0;
        boolean alarma=false;

        for (int i=0; i < dispositivo.length; i++){
            dispositivo[i]=tirada(50,5);
            suma+=dispositivo[i];

            System.out.println(dispositivo[i] + " -> media = " + (suma / (i+1)));

            if ((suma/(i+1))>=35){
                alarma = true;
                break;
            }

            if (alarma){
                System.out.println("Se ha superado la temperatura");
            }else {
                System.out.println("La temperatura esta estable");
            }

        }

    }

}
