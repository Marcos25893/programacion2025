package tema3.arrays;

public class Ej5 {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static double maximo(double num1, double num2){
        if (num1>num2){
            return num1;
        }else return num2;
    }

    public static double minimo(double num1, double num2){
        if (num1>num2){
            return num2;
        }else return num1;
    }

    public static void main(String[] args) {

        //5.Vamos a crear un array de 1000 valores double, debes rellenarlos con valores aleatorios
        // entre 5 y 50(temperaturas). Debes devolver la media y la mediana=((máximo+mínimo)/2)

        double numero[]= new double[1000];
        double total=0;
        int contador=0;
        double max = 0, min = 50;

        for (int i=0;i< numero.length;i++){
            numero[i]=tirada(50,5);
            max = maximo(max,numero[i]);
            min = minimo(min,numero[i]);
            total+=numero[i];
        }
        System.out.println("maximo " + max + "minimo" + min);
        System.out.println("Temperatura media: " + (total/ numero.length));
        System.out.println("Mediana: " + ((max+min)/2));
    }
}
