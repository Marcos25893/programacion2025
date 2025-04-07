package tema7.Practica1.GestionBiblioteca;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("biblioteca", "Cuevas", "684259317","bibli@gmail.com");

        b1.addLibro(new Libro("1","Montaña", "Antonio","Aventura", LocalDate.of(2015,6,21)));

    }
}
