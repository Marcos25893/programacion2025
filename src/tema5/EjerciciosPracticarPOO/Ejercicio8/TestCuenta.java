package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class TestCuenta {
    public static void main(String[] args) {

        CuentaAhorro ctA1 = new CuentaAhorro(5000.0,false,true,10.0,100.0);
        CuentaAhorro ctA2 = new CuentaAhorro(520.3,true,false,3.5,2.78);

        CuentaJoven ctJ1 = new CuentaJoven(237.45,false,false,2.78);
        CuentaJoven ctJ2 = new CuentaJoven(1478.45,false,true,2.98);

        CuentaCorriente ctC1 = new CuentaCorriente(30858.35,15.38,
                new Tarjeta2("tc250",28000.0),new Tarjeta2("td263",3000.0));
        CuentaCorriente ctC2 = new CuentaCorriente(1254.54,5.3,
                new Tarjeta2("tc258",280.0),new Tarjeta2("td269",500.0));

        Banco caja = new Banco();

        ctA1.ingresar(1300.0);
        ctA1.retirar(543.45);
        System.out.println(ctA1);

        ctJ2.ingresar(200.0);
        System.out.println(ctJ2);
        ctJ1.retirar(50.0);
        System.out.println(ctJ1);

        ctC1.ingresar(10000.0);
        System.out.println(ctC1);


        caja.addCuenta(ctA2);
        caja.addCuenta(ctJ1);
        caja.addCuenta(ctC2);
        caja.addCuenta(ctA1);
        caja.addCuenta(ctJ2);

        System.out.println(caja.getCuenta(ctA1.getNumeroCuenta()));
        caja.getCuenta(ctA1.getNumeroCuenta()).ingresar(1000000.0);
        System.out.println(ctA1);
        System.out.println(caja.getCuenta(ctJ2.getNumeroCuenta()));

        System.out.println(caja);

    }
}
