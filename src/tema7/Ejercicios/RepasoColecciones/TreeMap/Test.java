package tema7.Ejercicios.RepasoColecciones.TreeMap;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        AgendaCitas ac = new AgendaCitas();
        ac.addCita("Reunión con alumnos en practicas",
                LocalDateTime.of(2025,4,3,10,0));

        ac.addCita("Reunión con recursos humanos",
                LocalDateTime.of(2025,4,6,10,0));

        ac.addCita("Reunión con director de ventas",
                LocalDateTime.of(2025,4,7,10,0));

        ac.addCita("Reunión con concejal de infraestructuras",
                LocalDateTime.of(2025,4,4,10,0));

        ac.addCita("Reunión con empresa PR S.A.",
                LocalDateTime.of(2025,4,3,11,0));

        ac.addCita("Reunión con nuevo proyecto",
                LocalDateTime.of(2025,4,3,11,0));

        ac.mostrarProximaCitas();


    }
}
