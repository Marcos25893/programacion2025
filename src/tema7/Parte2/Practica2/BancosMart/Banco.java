package tema7.Parte2.Practica2.BancosMart;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Banco {

    private List<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuenta(Cuenta c){
        cuentas.add(c);
    }

    public Cuenta getCuentaPorId(UUID id){
        for (Cuenta c : cuentas){
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public List<Transaccion> getTodasTransacciones(){
        List<Transaccion> totalTransacciones = new ArrayList<>();
        for (Cuenta c : cuentas){
            totalTransacciones.addAll(c.getTransacciones());
        }
        return totalTransacciones;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "cuentas=" + cuentas +
                '}';
    }

    public void getTransaccionesImporteMinimo(Double valor){
        cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .filter(t -> t.getImporte() > valor)
                .sorted(Comparator.comparing(Transaccion::getFecha))
                .forEach(System.out::println);

    }

    public Double getIngresosTotales(){
        return cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                .map(Transaccion::getImporte)
                .reduce(0.0, Double::sum);

    }

    public Double getGastosTotales(){
        return cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                .map(Transaccion::getImporte)
                .reduce(0.0, Double::sum);
    }

    public void getCuentasPorSaldo(){
        cuentas.stream()
                .sorted(Comparator.comparing(Cuenta::getSaldo).reversed())
                .forEach(System.out::println);
    }

    public void getNumTransaccionesPorCuenta(){
        Map<UUID, Long> TransaccionesCuenta = cuentas.stream()
                .flatMap(c-> c.getTransacciones().stream())
                .collect(Collectors.groupingBy(t -> t.getCuenta().getId(), Collectors.counting()));

        TransaccionesCuenta.forEach((k,v) -> System.out.println(k + ": " + v));

    }

    public void getCuentasActivas(){
        cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .filter(t -> t.getFecha().isAfter(LocalDate.now().minusMonths(1)))
                .map(Transaccion::getCuenta)
                .distinct()
                .forEach(System.out::println);

    }

    public void getTransaccionesPorDescripcion(String palabra){
        Map<UUID, Set<Transaccion>> transacion =cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getDescripcion().contains(palabra))
                .collect(Collectors.groupingBy(t -> t.getCuenta().getId(), Collectors.toSet()));

        transacion.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void showAnalisisTemporal() {
        Map<Month, List<Transaccion>> mes = cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .collect(Collectors.groupingBy(t -> t.getFecha().getMonth()));

        mes.forEach((k, v) -> {
            System.out.print(k + " - ");
            double ingreso = v.stream()
                    .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();
            double gasto = v.stream()
                    .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();
            System.out.print("Ingreso: " + ingreso + " - Gasto: " + gasto);
            System.out.println();
        });

    }
}
