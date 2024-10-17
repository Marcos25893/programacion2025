package tema2.Menu;

import java.util.Scanner;

public class EjemploMenuEsqueleto {
    public static void main(String[] args) {
        int opcion =-1;
        Scanner sc= new Scanner(System.in);

        while (opcion !=5) {
            System.out.println("1. Hacer una cosa");
            System.out.println("2. Hacer otra cosa");
            System.out.println("3. Hacer una cosa diferente");
            System.out.println("4. Hacer lo que diga el profe");
            System.out.println("5. Salir");

            //Leer teclado la opcion
            System.out.println("Introduce opcion elegida:");
            opcion = Integer.parseInt(sc.nextLine());

            //Dependiendo de la opcion elegida hacemos lo correspondiente
            switch (opcion){
                case 1:
                    System.out.println("Has elegido la opcion 1");
                    //Aqui vendria el codigo de lo que haya que hacer en la opcion 1
                    break;
                case 2:
                    System.out.println("Has elegido la opcion 2");
                    //Aqui vendria el codigo de lo que haya que hacer en la opcion 2
                    break;
                case 3:
                    System.out.println("Has elegido la opcion 3");
                    //Aqui vendria el codigo de lo que haya que hacer en la opcion 3
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    //Aqui vendria el codigo de lo que haya que hacer en la opcion 4
                    break;
                case 5:
                    System.out.println("Adios, gracias por usar el programa");
                    break;
                default:
                    System.out.println("ERROR, opción incorrecta");
            }

        }
    }
}
