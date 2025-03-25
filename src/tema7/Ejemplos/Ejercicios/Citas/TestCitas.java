package tema7.Ejemplos.Ejercicios.Citas;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestCitas {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("Paco", "Sanchez", "654987542", "paco@gmail.com",
                "si", "puede");

        Paciente p2 = new Paciente("Pepa", "Ortiz", "654945542", "pepa@gmail.com",
                "s8i", "pueddde");

        Paciente p3 = new Paciente("Pedro", "Ramirez", "654984122", "pedro@gmail.com",
                "sqi", "qwe");

        Paciente p4 = new Paciente("Antonio", "Diaz", "414987542", "antonio@gmail.com",
                "siwer", "puedepo");

        Paciente p5 = new Paciente("Martina", "Ruiz", "654987325", "martina@gmail.com",
                "dfs", "plo");

        Cita c1 = new Cita(p1, LocalDate.of(2025,4,25), LocalTime.of(14,30), Cita.Tipo.PRIMERA);
        Cita c2 = new Cita(p2, LocalDate.of(2025,8,29), LocalTime.of(21,0), Cita.Tipo.CONSULTA);
        Cita c3 = new Cita(p3, LocalDate.of(2026,1,4), LocalTime.of(11,30), Cita.Tipo.REVISION);
        Cita c4 = new Cita(p4, LocalDate.of(2025,6,13), LocalTime.of(9,30), Cita.Tipo.CONSULTA);
        Cita c5 = new Cita(p1, LocalDate.of(2024,4,19), LocalTime.of(14,30), Cita.Tipo.PRIMERA);
        Cita c6 = new Cita(p5, LocalDate.of(2025,4,25), LocalTime.of(14,30), Cita.Tipo.PRIMERA);

        CitasConsulta cc = new CitasConsulta();
        cc.addCita(c1);
        cc.addCita(c2);
        cc.addCita(c3);
        cc.addCita(c4);
        cc.addCita(c5);
        cc.addCita(c6);

        cc.listarCitasPorApellido();
        System.out.println("-----------------------");
        cc.listarCitasPorNombre();
        System.out.println("-----------------------");
        cc.listarCitasPorFechaYApellido();
        System.out.println("----------------------");
        cc.listarCitasPorHora(LocalDate.of(2025,4,25));
        System.out.println("-----------------------");
        cc.listarCitasFuturas("paco@gmail.com");

    }
}
