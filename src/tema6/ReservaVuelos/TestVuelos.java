package tema6.ReservaVuelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestVuelos {

    public static void main(String[] args) {

        Vuelo v1 = new Vuelo("si", "no", LocalDate.of(2025,3,10),
                LocalTime.of(10,30),200.0,20);

        System.out.println(v1);

    }
}
