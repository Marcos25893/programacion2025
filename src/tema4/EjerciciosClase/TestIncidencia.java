package tema4.EjerciciosClase;

public class TestIncidencia {
    public static void main(String[] args) {
        Incidencia n1 = new Incidencia(4,"rotura");
        Incidencia n2 = new Incidencia(3, "herida");
        Incidencia n3 = new Incidencia(1, "rotura");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(Incidencia.getPendientes());

        n2.resuelve("reposo");
        System.out.println(n2);
        System.out.println(Incidencia.getPendientes());
        n1.resuelve("operar");
        System.out.println(n1);
        System.out.println(Incidencia.getPendientes());

    }
}
