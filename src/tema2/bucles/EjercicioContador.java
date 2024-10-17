package tema2.bucles;

public class EjercicioContador {
    public static void main(String[] args) {
        //Tira un dado de seis caras 100 veces
        //Y dime cuantas veces sale el seis

//        int contador=0, resultado;
//
//        for (int i=1; i<=100; i++){
//            resultado=(int) (Math.random() * (6+1-1)+1);
//            if (resultado==6){
//                contador++;
//            }
//        }
//        System.out.println(contador);

        //Lo mismo pero sacar el porcentaje de veces que sale

        int contador=0, resultado;

        for (int i=1; i<=10000; i++){
            resultado=(int) (Math.random() * (6+1-1)+1);
            if (resultado==6){
                contador++;
            }
        }
        System.out.println((contador*100)/10000 + "%");
    }
}
