package tema7.Practica1.GestionBiblioteca;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("biblioteca", "Cuevas", "684259317","bibli@gmail.com");

        b1.addLibro(new Libro("1","Montaña", "Antonio","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("2","Nubes", "Paco","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("3","El castillo", "Ana","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("4","El caballero", "Antonio","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("5","La noche", "Maria","Suspense", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("6","El colegio", "Marta","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("7","Competicion", "Marta","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("8","La sombra del viento ", "Ana","Aventura", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("9","La princesa", "Jorge","Comedia", LocalDate.of(2015,6,21)));
        b1.addLibro(new Libro("10","El principito", "Juan","Aventura", LocalDate.of(2015,6,21)));



    }
}
