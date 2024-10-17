package tema2.bucles;

public class EjercicioWhile {
    public static void main(String[] args) {

        //Simula lanzar un dado de seis caras, hasta que te salga un seis
//        int dado;

//        do {
//            dado=(int) (Math.random() * (6+1-1)+1);
//            System.out.println("Ha salido el " + dado);
//        }while (dado!=6);

        //Simula lanzar un dado de seis caras, hasta que te salga un seis
        //Cuenta el numero de tiradas que has necesitado hasta sacar un seis

//        int numero=0;
//
//        do {
//            numero++;
//            dado=(int) (Math.random() * (6+1-1)+1);
//            System.out.println("Ha salido el " + dado + " Numero de intentos " + numero);
//
//        }while (dado!=6);
//        System.out.println("Intentos totales " + numero);
//

        //Simula tirar un dado de 20 caras, hasta que ten salga el 1 o el 20

        int dado;
        int intentos=0;
        do{
            intentos++;
            dado=(int) (Math.random() * (20+1-1)+1);
            System.out.println(dado);
        }while (dado!=1 && dado!=20);

        System.out.println("Número de intentos " + intentos);
    }
}
