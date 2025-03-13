package tema6.fecha;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class claseLocalTime {

    public static void main(String[] args) {

        String hora = "11:22";

        LocalTime lt1 = LocalTime.parse(hora);

        System.out.println(lt1);

        LocalTime lt2 = LocalTime.parse(hora).plusHours(3).plusMinutes(50);

        System.out.println(Duration.between(lt1,lt2));

        Duration duracion;

        duracion = Duration.between(lt1,lt2);

        System.out.println("horas " + duracion.toHours());

    }
}
