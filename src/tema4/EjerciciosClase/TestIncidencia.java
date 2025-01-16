package tema4.EjerciciosClase;

public class TestIncidencia {
    public static void main(String[] args) {
        Incidencia n1 = new Incidencia(4, Incidencia.Estado.ABIERTA,"rotura","fusionarlo");
        Incidencia n2 = new Incidencia(3, Incidencia.Estado.PROCESO,"herida","curar");
        Incidencia n3 = new Incidencia(1, Incidencia.Estado.ABIERTA,"rotura","fusionarlo");

        System.out.println(n1);
        System.out.println(Incidencia.getPendientes());

        n2.resuelve();
        System.out.println(n2);
        System.out.println(Incidencia.getPendientes());
        n1.resuelve();
        System.out.println(n1);
        System.out.println(Incidencia.getPendientes());

    }
}
