package tema7.Parte2.Practica2.SensoresPlantacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static double numero_aleatorio(int min , int max){
        return (Math.random()*(max-min+1) +min);
    }

    public static void main(String[] args) {

        List<Registro> registros = new ArrayList<>();

        for (int i=0; i<100; i++){
            registros.add(new Registro(LocalDateTime.now().minusHours(1).plusMinutes(i), numero_aleatorio(1,99),numero_aleatorio(1,99)));
        }

        //1. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a 70 y la
        //fecha sea anterior a la fecha actual, y mostrarlos.
        registros.stream()
                .filter(r -> (r.getTemperatura()) > 25)
                .filter(r -> r.getHumedad() < 70)
                .filter(r -> r.getFechaHora().isBefore(LocalDateTime.now()))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //2. Encontrar el registro con la temperatura más alta y mostrar el registro completo.
        registros.stream()
                .sorted(Comparator.comparing(Registro::getTemperatura).reversed())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        //3. Obtener una lista con las fechas/horas de todas las tomas de datos.
        List<LocalDateTime> tomaDatos = registros.stream()
                .map(Registro::getFechaHora)
                .toList();
        tomaDatos.forEach(System.out::println);

        System.out.println("----------------------------");

        //4. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
        //humedades y fechas/horas actualizadas.
        registros.stream()
                .peek(r -> r.setHumedad(r.getHumedad()+5))
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //5. Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y mostrar la
        //temperatura, humedad y fecha.
        registros.stream()
                .filter(r -> r.getHumedad() > 80)
                .sorted(Comparator.comparing(Registro::getTemperatura))
                .limit(1)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        //6. Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y la fecha
        //es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta condición o no.
        Registro existe = registros.stream()
                .filter(r -> r.getTemperatura() > 30)
                .filter(r -> r.getHumedad() > 90)
                .filter(r -> r.getFechaHora().toLocalDate().equals(LocalDate.now()))
                .findAny()
                .orElse(null);
        System.out.println(existe);

        System.out.println("-------------------------");

        //7. Muestra 10 registros saltándote los 5 primeros.
        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-------------------------");

        //8. Muestra los registros ordenados por fecha (sorted(Comparator))
        registros.stream()
                .sorted(Comparator.comparing(Registro::getFechaHora))
                .forEach(System.out::println);

        System.out.println("------------------------");

        //9. Cuenta los registros que tengan temperatura mayor a 35 grados (count()).
        Long cantidad = registros.stream()
                .filter(r -> r.getTemperatura() > 35)
                .count();
        System.out.println(cantidad);

        System.out.println("-------------------------");

        //10. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double> y
        //llamar a average()).
        Double media = registros.stream()
                .mapToDouble(Registro::getTemperatura)
                .average()
                .orElse(0.0);

        System.out.println(media);




    }
}
