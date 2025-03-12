package tema6.fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class claseLocalDate {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2025,4,6);
        LocalDate ld2 = LocalDate.of(2025,5,30);

        LocalDateTime ldt1 = LocalDateTime.of(2025,1,6,3,25);
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





    }
}
