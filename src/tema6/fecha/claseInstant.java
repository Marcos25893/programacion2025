package tema6.fecha;

import java.time.Duration;
import java.time.Instant;

public class claseInstant {

    public static void main(String[] args) {

        Instant i1 = Instant.now();

        for (int i=0;i<10;i++){
            System.out.println(i);
        }

        Instant i2 = Instant.now();

        System.out.println(Duration.between(i1,i2).getNano());

    }
}
