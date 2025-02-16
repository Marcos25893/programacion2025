package tema5.Objetos2.EquipoCiclistas;

import java.util.Scanner;

public class TestPrueba {

    public static void main(String[] args) {

        Equipo team1 = new Equipo("Pato","España");

        Scanner sc = new Scanner(System.in);
        int eleccion=0;
        int tipo=0;
        int ident, aProSubida, gRamSoportada, velMax;
        double tAcu, ptPromedio, velPromedio;
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
                    do {

                        System.out.println("¿De que clase es el ciclista? Elige el numero correspondiente");
                        System.out.println("1. Velocista");
                        System.out.println("2. Escalador");
                        System.out.println("3. Contrarrelojista");
                        tipo = Integer.parseInt(sc.nextLine());
                    }while (tipo<1 || tipo>3);
                    System.out.println("Rellenar Datos");
                    System.out.println("Identificador");
                    ident=Integer.parseInt(sc.nextLine());
                    System.out.println("Nombre");
                    nombre= sc.nextLine();
                    System.out.println("Tiempo acumulado");
                    tAcu=Double.parseDouble(sc.nextLine());
                    switch (tipo){
                        case 1:
                            System.out.println("Potencia promedio");
                            ptPromedio=Double.parseDouble(sc.nextLine());
                            System.out.println("Velocidad Promedio");
                            velPromedio=Double.parseDouble(sc.nextLine());
                            Velocista v1 = new Velocista(ident,nombre,tAcu,ptPromedio,velPromedio);
                            team1.addCiclista(v1);
                            break;
                        case 2:
                            System.out.println("Aceleraccion Promedio de Subida");
                            aProSubida=Integer.parseInt(sc.nextLine());
                            System.out.println("Grado de rampa soportada");
                            gRamSoportada=Integer.parseInt(sc.nextLine());
                            Escalador e1 = new Escalador(ident,nombre,tAcu,aProSubida,gRamSoportada);
                            team1.addCiclista(e1);
                            break;
                        case 3:
                            System.out.println("Velocidad máxima");
                            velMax=Integer.parseInt(sc.nextLine());
                            Contrarrelojista c1 = new Contrarrelojista(ident,nombre,tAcu,velMax);
                            team1.addCiclista(c1);
                            break;
                        default:
                            System.out.println("Valor Incorrecto, el valor tiene que ser 1,2 o 3");
                            break;
                    }
                    break;
                case 3:
                    System.out.println(team1.tiempoEquipo());
                    break;

                case 4:
                    System.out.println(team1.nombreCiclistaEquipo());
                    break;
                case 5:
                    System.out.println("Dime el identificador del ciclista que quieras buscar");
                    ident=Integer.parseInt(sc.nextLine());
                    System.out.println(team1.buscarCiclista(ident));
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Error, Valor no valido");
                    break;
            }
        }





    }
}
