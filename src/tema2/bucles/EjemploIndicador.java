package tema2.bucles;

public class EjemploIndicador {
    public static void main(String[] args) {

        //Si tiramos un dado 20 veces y queremos saber si a salido algun 6

        int tirada;
        boolean haSalido6 = false;//No ha pasado

        for (int i=0; i<20; i++){
            tirada = (int) (Math.random() * 6)+1;
            if (tirada == 6 ){
                haSalido6=true;
            }
        }

        //Al finalizar el bucle puedo comprobar la variable boolean para saber si a ocurrido
        System.out.println("Ha salido seis: " + haSalido6);
    }
}
