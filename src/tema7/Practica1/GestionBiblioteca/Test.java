package tema7.Practica1.GestionBiblioteca;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("biblioteca", "Cuevas", "684259317","bibli@gmail.com");

        b1.addLibro(new Libro("1","Montaña", "Antonio","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("2","Nubes", "Paco","Aventura", LocalDate.of(2017,6,21)));
        b1.addLibro(new Libro("3","El castillo", "Ana","Aventura", LocalDate.of(2015,12,1)));
        b1.addLibro(new Libro("4","El caballero", "Antonio","Aventura", LocalDate.of(2018,7,2)));
        b1.addLibro(new Libro("5","La noche", "Maria","Suspense", LocalDate.of(2013,8,21)));
        b1.addLibro(new Libro("6","El colegio", "Marta","Romance", LocalDate.of(2011,9,21)));
        b1.addLibro(new Libro("7","Competicion", "Marta","Aventura", LocalDate.of(2012,11,21)));
        b1.addLibro(new Libro("8","La sombra del viento ", "Ana","Aventura", LocalDate.of(2013,10,21)));
        b1.addLibro(new Libro("9","La princesa", "Jorge","Comedia", LocalDate.of(2012,3,15)));
        b1.addLibro(new Libro("10","El principito", "Juan","Aventura", LocalDate.of(2013,1,20)));

        b1.addUsuario(new Usuario("12345678Z","Paco","Sanchez", "casa","132456789",
                "paco@gmail.com"));

        b1.addUsuario(new Usuario("87654321V","Pepe","Garcia", "casa","987654321",
                "pepe@gmail.com"));

        b1.addUsuario(new Usuario("15935725X","Ana","Ortiz", "casa","159357864",
                "ana@gmail.com"));

        b1.addUsuario(new Usuario("64823791M","Marta","Lopez", "casa","123684975",
                "marta@gmail.com"));

        b1.prestarLibro("12345678Z", "1");
        b1.prestarLibro("12345678Z", "2");
        b1.prestarLibro("87654321V", "5");
        b1.prestarLibro("87654321V", "6");
        b1.prestarLibro("15935725X", "9");
        b1.prestarLibro("15935725X", "10");
        b1.prestarLibro("64823791M", "3");
        b1.prestarLibro("64823791M", "7");

        System.out.println("Libros que tiene 12345678Z:");
        b1.buscarPrestamosUsuario("12345678Z");

        System.out.println("\nLibros que tiene 87654321V:");
        b1.buscarPrestamosUsuario("87654321V");

        System.out.println("\nLibros disponibles en la biblioteca:");
        b1.listarLibrosDisponibles();

        System.out.println("\nEl usuario:12345678Z puede devolver el libro'1' " + b1.devolverLibro("12345678Z","1"));

        System.out.println("\nEl usuario->87654321V hace un prestamo por el libro->1");
        b1.prestarLibro("87654321V","1");

        System.out.println("\nLibros que tiene 12345678Z:");
        b1.buscarPrestamosUsuario("12345678Z");

        System.out.println("\nLibros que tiene 87654321V:");
        b1.buscarPrestamosUsuario("87654321V");

        System.out.println("\nLibros disponibles en la biblioteca:");
        b1.listarLibrosDisponibles();

        System.out.println("\nEl usuario:12345678Z puede devolver el libro " + b1.devolverLibro("12345678Z","1"));



    }
}
