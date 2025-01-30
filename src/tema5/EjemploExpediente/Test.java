package tema5.EjemploExpediente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Expediente ex1 = new Expediente("Garcia","Manolo",'H',
                Expediente.Modalidad.FPSUPERIOR, LocalDate.of(2000,10,13),
                1);

        Expediente ex2 = new Expediente("Perez","Paco",'H',
                Expediente.Modalidad.FPSUPERIOR, LocalDate.of(2001,2,20),
                1);

        NotasCurso nc1 = new NotasCurso("Programación", 1, 5.2, 4.5, 6.75);
        NotasCurso nc2 = new NotasCurso("Programación", 1, 7.2, 8.0, 6.75);
        NotasCurso nc3 = new NotasCurso("BBDD", 1, 3.2, 5.0, 7.75);
        NotasCurso nc4 = new NotasCurso("BBDD", 1, 5.2, 6.0, 9.75);

        ex1.addNotas(List.of(nc1, nc3));
        ex2.addNotas(List.of(nc2, nc4));
        /*
        Se han creado dos metodos el primero añade en una linea todas la notas que queramos
        y el otro hay que ir una a una.
        otra forma de añadir notas una a una:
        ex1.addNota(nc1);
         */
        System.out.println(ex1);
        System.out.println(ex2);


        System.out.println(ex1.titula());
        System.out.println(ex2.titula());

        System.out.println(ex1.getMediaExpediente());
        System.out.println(ex2.getMediaExpediente());

        System.out.println(ex1.getEdad() + " " + ex1.esMayorEdad());
        System.out.println(ex2.getEdad() + " " + ex2.esMayorEdad());
    }
}
