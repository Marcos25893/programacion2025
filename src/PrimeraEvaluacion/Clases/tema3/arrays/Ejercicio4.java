package PrimeraEvaluacion.Clases.tema3.arrays;

public class Ejercicio4 {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static void main(String[] args) {

        //En el primer trimestre del curso hay 85 dias de clase
        //En un array de boolan guardamos si un alumno ha
        //faltado(true) o no(false)
        //Realiza un programa que diga si el alumno ha
        //perdido la evalución continua(20% de faltas al trimestre)

        boolean faltas[] = new boolean[85];
        int numero=0;
        int contador=0;
        int limite;

        for (int i=0; i < faltas.length; i++){
            numero=tirada(1,0);
            if (numero==0){
                faltas[i]=true;
                contador++;
            }else{
                faltas[i]=false;
            }
        }
        System.out.println("Has faltado " + contador);
        limite=(faltas.length*20)/100;
        if (contador>limite){
            System.out.println("Has perdido la evalucion");
        }else System.out.println("Todavia no has perdido la evaluacion continua");

    }
}
