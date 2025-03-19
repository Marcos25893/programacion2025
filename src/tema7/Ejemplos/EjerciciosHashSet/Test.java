package tema7.Ejemplos.EjerciciosHashSet;

public class Test {

    public static void main(String[] args) {

        Aula a1 = new Aula("1ºDAW", "arriba");


        a1.addAlumno(new Alumno("1", "Paco", "Sanchez", "paco@gmail.com", 24, "no"));
        a1.addAlumno(new Alumno("2", "Pepe", "Perez", "pepe@gmail.com", 20, "no"));
        a1.addAlumno(new Alumno("3", "Rosa", "Velazquez", "rosa@gmail.com", 21, "no"));
        a1.addAlumno(new Alumno("4", "Antonio", "Parra", "antonio@gmail.com", 22, "no"));
        a1.addAlumno(new Alumno("5", "Nati", "Ortiz", "nati@gmail.com", 24, "no"));
        a1.addAlumno(new Alumno("1", "Paco", "Sanchez", "paco@gmail.com", 24, "no"));


        System.out.println(a1.listarAlumnos());

    }
}
