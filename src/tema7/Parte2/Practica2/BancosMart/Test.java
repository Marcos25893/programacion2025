package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta(new Cliente("12345678X", "Paco", "paco@gmail.com", "456789132",
                "camino", "ciudad", "pais"));

        Cuenta c2 = new Cuenta(new Cliente("987654321X", "Pepe", "pepe@gmail.com", "456789425",
                "rio", "ciudad", "pais"));

        Cuenta c3 = new Cuenta(new Cliente("45678901A", "Ana", "ana@example.com", "123456789",
                "paseo del río", "sevilla", "españa"));

        Cuenta c4 = new Cuenta(new Cliente("23456789Y", "Laura", "laura@example.com", "654321987",
                "avenida", "valencia", "españa"));


        Transaccion t1 = new Transaccion(c1, 250.0, LocalDate.now().minusDays(15),
                TipoTransaccion.INGRESO, "Ingreso");

        Transaccion t2 = new Transaccion(c2, 380.0, LocalDate.now().minusDays(20),
                TipoTransaccion.INGRESO, "Ingreso");

        Transaccion t3 = new Transaccion(c1, 100.0, LocalDate.now().minusMonths(1).minusDays(10),
                TipoTransaccion.GASTO, "Compra juguete");

        Transaccion t4 = new Transaccion(c1, 50.0, LocalDate.now().minusDays(10),
                TipoTransaccion.GASTO, "Compra libro");

        Transaccion t5 = new Transaccion(c2, 100.0, LocalDate.now().minusMonths(1),
                TipoTransaccion.GASTO, "Retiro de efectivo");

        Transaccion t6 = new Transaccion(c3, 500.0, LocalDate.now().minusMonths(2),
                TipoTransaccion.INGRESO, "Nómina");

        Transaccion t7 = new Transaccion(c3, 75.5, LocalDate.now().minusMonths(2),
                TipoTransaccion.GASTO, "Compra online");

        Transaccion t8 = new Transaccion(c4, 300.0, LocalDate.now().minusDays(10),
                TipoTransaccion.INGRESO, "Venta de artículos");

        Transaccion t9 = new Transaccion(c4, 60.0, LocalDate.now().minusDays(2),
                TipoTransaccion.GASTO, "Pago de suscripción");

        c1.addTransaccion(t1);
        c2.addTransaccion(t2);
        c1.addTransaccion(t3);
        c1.addTransaccion(t4);
        c2.addTransaccion(t5);
        c3.addTransaccion(t6);
        c3.addTransaccion(t7);
        c4.addTransaccion(t8);
        c4.addTransaccion(t9);

        Banco b1 = new Banco();

        b1.addCuenta(c1);
        b1.addCuenta(c2);
        b1.addCuenta(c3);
        b1.addCuenta(c4);

        System.out.println(b1.getCuentaPorId(c1.getId()));
        System.out.println("--------------------------");

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

        b1.getCuentasActivas();
        System.out.println("--------------------");

        b1.getTransaccionesPorDescripcion("Compra");
        System.out.println("--------------------------");

        b1.showAnalisisTemporal();


    }
}
