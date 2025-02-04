package tema5.EjerciciosPracticarPOO.Ejercicio6;

import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda ag1 = new Agenda();

        int eleccion=0;
        String nombre;
        String telefono;

        while(eleccion!=6) {
            System.out.println("Agenda Telefonica");
            System.out.println("-----------------");
            System.out.println("1.Añadir nuevo contacto");
            System.out.println("2.Listar contactos");
            System.out.println("3.Buscar contacto");
            System.out.println("4.Eliminar contacto");
            System.out.println("5.Estado de la agenda");
            System.out.println("6.Salir");
            System.out.println("Elige una opción:");
            eleccion=Integer.parseInt(sc.nextLine());

            switch (eleccion){
                case 1:
                    System.out.println("Nombre:");
                    nombre=sc.nextLine();
                    System.out.println("Telefono:");
                    telefono=sc.nextLine();
                    ag1.anadirContacto(new Contacto(nombre, telefono));
                    break;

                case 2:
                    ag1.listarContactos();
                    break;

                case 3:
                    System.out.println("Que contacto quieres buscar");
                    nombre=sc.nextLine();
                    System.out.println("Su telefono es " + ag1.buscarContacto(nombre));
                    break;
                case 4:
                    System.out.println("Cual es el nombre del contacto quieres eliminar");
                    nombre=sc.nextLine();
                    ag1.eliminarContacto(new Contacto(nombre,""));
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }
        }
    }
}
