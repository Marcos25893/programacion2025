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
                .collect(Collectors.groupingBy(Cuenta::getId, Collectors.counting()));

        TransaccionesCuenta.forEach((k,v) -> System.out.println(k + " " + v));

    }

    public void getCuentasActivas(){
        cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .filter(t -> t.getFecha().isAfter(t.getFecha().minusMonths(1)))
                .forEach(System.out::println);
    }

    public Map getTransaccionesPorDescripcion(String palabra){
        return cuentas.stream()
                .collect(Collectors.groupingBy(Cuenta::getId, (Collectors.flatMapping(cuentas -> cuentas.getTransacciones().stream()
                        .filter(t -> t.getDescripcion().contains(palabra)), Collectors.toSet()))));

    }

    public void showAnalisisTemporal(){
        Map<Month, Double> mes = cuentas.stream()
                .flatMap(cuentas -> cuentas.getTransacciones().stream())
                .collect(Collectors.groupingBy(t -> t.getFecha().getMonth(), Collectors.summingDouble(Transaccion::getImporte)));
        mes.forEach((k,v) -> System.out.println(k + " " + v));

    }

}
