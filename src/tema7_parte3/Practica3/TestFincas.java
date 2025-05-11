package tema7_parte3.Practica3;

import java.time.LocalDate;

public class TestFincas {
    public static void main(String[] args) {

        DAOFinca finca = new DAOFinca();

        DAOLectura lectura = new DAOLectura();

        System.out.println(finca);
        System.out.println("---------------");
        System.out.println(finca.getFincasMedio());
        System.out.println("-------------------");
        System.out.println(finca.getMasGrandes());
        System.out.println("------------------");
        System.out.println(finca.getFincasPorCiudad());

        System.out.println("----------------------");
        System.out.println(lectura);
        System.out.println("---------------------");
        lectura.getLecturasPorFinca().forEach((k, v )->
                System.out.println("-------------" + k + "--------------" + "\n" + v));
        System.out.println("--------------------");
        System.out.println(lectura.getTempMaximaFinca(5));

        lectura.addLectura(new Lectura(1001, 25.4, 50.3, LocalDate.of(2023,4,28), finca.findById(10)));
        /*lectura.grabarDatos();*/



    }
}
