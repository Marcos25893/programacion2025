package tema7.Practica1.ExpedientesAlumnos;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) throws Exception {


       Estudiante es1 = new Estudiante("12345678Z", "Pepe", "Sanchez", LocalDate.of(2004,5,23),
               "Calle de la Reina Regente", "Almeria", "pepe@gmail.com", "123456789");

       Estudiante es2 = new Estudiante("87654321X", "Paco", "Ramirez", LocalDate.of(2006,7,10),
               "Avenida de la Rambla", "Almeria", "paco@gmail.com", "987654321");

       Estudiante es3 = new Estudiante("45625891C", "Ana", "Garcia", LocalDate.of(2001,6,15),
               "Calle de Federico García Lorca", "Almeria", "ana@gmail.com", "159357286");



       NotasCurso nc1 = new NotasCurso(Etapa.FPSuperior, "DAW", 1, LocalDate.of(2022, 9, 15));
       NotasCurso nc2 = new NotasCurso(Etapa.FPSuperior, "DAW", 2, LocalDate.of(2023, 9, 15));

       NotasCurso nc3 = new NotasCurso(Etapa.FPSuperior, "DAW", 1, LocalDate.of(2024, 9, 15));
       NotasCurso nc4 = new NotasCurso(Etapa.FPSuperior, "DAW", 2, LocalDate.of(2025, 9, 15));

       NotasCurso nc5 = new NotasCurso(Etapa.FPSuperior, "DAW", 1, LocalDate.of(2020, 9, 15));
       NotasCurso nc6 = new NotasCurso(Etapa.FPSuperior, "DAW", 2, LocalDate.of(2021, 9, 15));

        Expediente e1 = new Expediente(es1, true);
        Expediente e2 = new Expediente(es2, true);
        Expediente e3 = new Expediente(es3, false);


        CentroEducativo ce1 = new CentroEducativo("IES Mar", "Calle Horizonte", "Almeria", "653214569", "mar@gmail.com");


       nc1.addNota("Programacion", 7.5);
       nc1.addNota("BBDD", 8.5);
       nc1.addNota("S.I", 9.2);
       nc1.addNota("Lenguaje de marcas", 5.1);

       nc2.addNota("Programacion", 6.5);
       nc2.addNota("BBDD", 5.5);
       nc2.addNota("S.I", 8.5);
       nc2.addNota("Lenguaje de marcas", 6.0);

       nc3.addNota("Programacion", 9.5);
       nc3.addNota("BBDD", 7.5);
       nc3.addNota("S.I", 6.2);
       nc3.addNota("Lenguaje de marcas", 8.1);

       nc4.addNota("Programacion", 7.5);
       nc4.addNota("BBDD", 9.5);
       nc4.addNota("S.I", 6.5);
       nc4.addNota("Lenguaje de marcas", 5.5);

       nc5.addNota("Programacion", 5.5);
       nc5.addNota("BBDD", 6.5);
       nc5.addNota("S.I", 5.2);
       nc5.addNota("Lenguaje de marcas", 5.8);

       nc6.addNota("Programacion", 5.0);
       nc6.addNota("BBDD", 5.7);
       nc6.addNota("S.I", 6.0);
       nc6.addNota("Lenguaje de marcas", 6.5);


        System.out.println(nc1.pintar());
        System.out.println(nc1.buscar("Programacion"));

        e1.addNotas(nc1);
        e1.addNotas(nc2);
        e2.addNotas(nc3);
        e2.addNotas(nc4);
        e3.addNotas(nc5);
        e3.addNotas(nc6);

        e1.mostrarNotas(1,Etapa.FPSuperior);

        ce1.addExpediente(e1);
        ce1.addExpediente(e2);
        ce1.addExpediente(e3);

        System.out.println(ce1.buscarExpediente("12345678Z"));

        System.out.println(ce1.buscarExpediente("45625891C"));








    }
}
