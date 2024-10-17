package tema1;

import java.util.Scanner;

public class NotaAlumno {
    public static void main(String[] args) {
        // Un alumno quiere saber su nota final de programacion
        // Tres examenes parciales: nota1, nota2, nota3 -> 55%
        //Examen final: notaExamenFinal -> 30%
        //Trabajo final: notaTrabajoFinal -> 15%

        double nota1, nota2, nota3, notaExamenFinal, notaTrabajoFinal, notaFinal, notaMedia;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es la nota de tu primer examen");
        nota1 = sc.nextDouble();
        System.out.println("Cual es la nota de tu segundo examen");
        nota2 = sc.nextDouble();
        System.out.println("Cual es la nota de tu tercer examen");
        nota3 = sc.nextDouble();
        System.out.println("Cual es la nota de tu examen final");
        notaExamenFinal = sc.nextDouble();
        System.out.println("Cual es la nota de tu trabajo");
        notaTrabajoFinal = sc.nextDouble();

        notaMedia=(nota1 + nota2 + nota3)/3;
        notaFinal= notaMedia*0.55 + notaExamenFinal * 0.30 + notaTrabajoFinal*0.15;

        System.out.println("Tu nota es " + notaFinal);
    }
}
