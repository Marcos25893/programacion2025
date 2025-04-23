package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta(new Cliente("12345678X", "Paco", "paco@gmail.com", "456789132",
                "camino", "ciudad", "pais"));

        Cuenta c2 = new Cuenta(new Cliente("987654321X", "Pepe", "pepe@gmail.com", "456789425",
                "rio", "ciudad", "pais"));

        Transaccion t1 = new Transaccion(c1, 250.0, LocalDate.now().minusMonths(0),
                TipoTransaccion.INGRESO, "Ingreso");

        Transaccion t2 = new Transaccion(c2, 380.0, LocalDate.now().minusMonths(0),
                TipoTransaccion.INGRESO, "Ingreso");

        Transaccion t3 = new Transaccion(c1, 100.0, LocalDate.now().minusMonths(1).minusDays(10),
                TipoTransaccion.GASTO, "Compra");

        Transaccion t4 = new Transaccion(c1, 50.0, LocalDate.now().minusDays(10),
                TipoTransaccion.GASTO, "gasto");

        c1.addTransaccion(t1);
        c2.addTransaccion(t2);
        c1.addTransaccion(t3);
        c1.addTransaccion(t4);

        Banco b1 = new Banco();

        b1.addCuenta(c1);
        b1.addCuenta(c2);
/*
        System.out.println(b1.getCuentaPorId(c1.getId()));
        System.out.println(b1.getTodasTransacciones());
        System.out.println("------------------------");

        b1.getTransaccionesImporteMinimo(150.0);
        System.out.println("-----------------------");

        System.out.println(b1.getIngresosTotales());
        System.out.println("---------------------");

        System.out.println(b1.getGastosTotales());
        System.out.println("--------------------");

        b1.getCuentasPorSaldo();
        System.out.println("--------------------");

        b1.getNumTransaccionesPorCuenta();
        System.out.println("---------------------");
*/
        b1.getCuentasActivas();
        System.out.println("--------------------");
/*
        b1.getTransaccionesPorDescripcion("Ingreso");
        System.out.println("--------------------------");

        b1.showAnalisisTemporal();
*/

    }
}
