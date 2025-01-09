package PrimeraEvaluacion.Clases.tema3.arrays;

public class Ejercicio2 {

    public static double tirada(int mayor, int menor){
        return (Math.random()*(mayor-menor+1)+menor);
    }

    public static void main(String[] args) {

        //Genera de forma aleatoria un array de double con 30 elementos
        //Los valores estarán entre -100 y 100
        //Pinta los valores
        //Pinta los valores al reves
        //Dime la media de todos los valores

        double suma=0;
        double numero[] = new double[30];

        for (int i=0; i < numero.length; i++){
            numero[i]=tirada(100,-100);
            System.out.println(numero[i]);
            suma+=numero[i];
        }

        System.out.println("---------------------------------");

        for (int j= numero.length-1; j>=0; j--){
            System.out.println(numero[j]);
        }
        System.out.println("La media es " + (double)suma/numero.length);
    }
}
