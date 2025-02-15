package tema5.Objetos2.EquipoCiclistas;

import java.util.Scanner;

public class TestPrueba {

    public static void main(String[] args) {

        Velocista v1 = new Velocista(1,"Paco",12.0,13.5,21.4);
        Velocista v2 = new Velocista(2,"Pepe", 15.3,10.4,17.8);

        Escalador e1 = new Escalador(3,"Dolores",25.2,2,85);
        Escalador e2 = new Escalador(4,"Manolo",28.3,1,90);

        Contrarrelojista c1 = new Contrarrelojista(5,"Domingo",5.4,16);
        Contrarrelojista c2 = new Contrarrelojista(6,"Angustias",5.3,17);

        Equipo team1 = new Equipo("Pato","España");

        Scanner sc = new Scanner(System.in);
        int eleccion=0;
        int tipo=0;
        int ident, aProSub, gRamSo, velMax;
        double tAcu, ptPro, velPro;
        String nombre;

        while(eleccion!=6){
            System.out.println("1. Imprimir datos del equipo.");
            System.out.println("2. Añadir un ciclista al equipo");
            System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo");
            System.out.println("4. Listar nombres de los ciclistas");
            System.out.println("5. Buscar ciclista");
            System.out.println("6. Salir");
            eleccion=Integer.parseInt(sc.nextLine());

            switch (eleccion){
                case 1:
                    System.out.println(team1);
                    break;
                case 2:
                    System.out.println("¿Que clase es el ciclista? Elige el numero correspondiente");
                    System.out.println("1. Velocista");
                    System.out.println("2. Escalador");
                    System.out.println("3. Contrarrelojista");
                    tipo=Integer.parseInt(sc.nextLine());
                    System.out.println("Rellenar Datos");
//                    switch (tipo){
//                        case 1:
//                            System.out.println("Identificador");
//                            ident=Integer.parseInt(sc.nextLine());
//                            System.out.println("Nombre");
//                            nombre= sc.nextLine();
//                            System.out.println("Tiempo acumulado");
//                            tAcu=Integer.parseInt(sc.nextLine());
//                            System.out.println("Potencia promedio");
//                            ptPro=Integer.parseInt(sc.nextLine());
//                    }
                    break;
            }
        }





    }
}
