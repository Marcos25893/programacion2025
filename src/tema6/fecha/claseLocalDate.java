package tema6.fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class claseLocalDate {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2025,3,15);
        LocalDate ld2 = LocalDate.of(2025,5,30);

        LocalDateTime ldt1 = LocalDateTime.of(2025,5,6,14,25);
        LocalDateTime ldt2 = LocalDate.now().atTime(LocalTime.now().plusHours(10));
        LocalDateTime ldt3 = LocalTime.now().minusHours(1).minusMinutes(50)
                .atDate(LocalDate.of(2025,12,30));

        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getYear());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld2.isAfter(ld1));
        //System.out.println(ldt2.compareTo(ldt1));
        System.out.println(ldt3);
        System.out.println(ldt3.withMinute(20));
        System.out.println(ldt3);

        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(),ld1));
        System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now(),ldt1));

        String fecha = "2025-11-14";
        String hora = "20:14";
        StringBuffer sb = new StringBuffer();
        sb.append(fecha).append("T").append(hora);
        LocalDateTime ldt4 = LocalDateTime.parse(sb.toString());
        System.out.println(ldt4);

        LocalDateTime ldt5 = ld1.atTime(LocalTime.parse(hora));
        System.out.println(ldt5);

        System.out.println(Period.between(ld1,ld2));

        System.out.println(ld1.isEqual(ld2));


    }
}
