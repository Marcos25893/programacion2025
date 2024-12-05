package tema3.string.EjerciciosHoja;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Cuenta las vocales del texto “Me gusta programar en Java los sábados por la mañana”

        String texto= "Me gusta programar en Java los sábados por la mañana";
        char vocal;
        int contador=0;

        for (int i=0;i<texto.length();i++){
            vocal=texto.charAt(i);
            switch (vocal){
                case 'a','e','i','o','u','á':
                    contador++;
                    break;
            }
        }
        System.out.println("Han salido " + contador + " vocales");

    }
}
