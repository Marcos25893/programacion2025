package tema7_parte3.Practica3;

import tema7_parte3.wallapop.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DAOFinca {

    private List<Finca> fincas;

    public DAOFinca() {
        this.fincas = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos(){
        try {
            fincas = Files.lines(Paths.get("resources/finca.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Finca finca = new Finca(
                                Integer.parseInt(tokens.get(0)),
                                tokens.get(1),
                                Double.parseDouble(tokens.get(2)),
                                Double.parseDouble(tokens.get(3)),
                                Double.parseDouble(tokens.get(4)),
                                tokens.get(5),
                                tokens.get(6)
                        );
                        return finca;
                    })
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addFinca(Finca f){
        if (!fincas.contains(f)) {
            fincas.add(f);
        }
    }

    public void deleteFinca(Finca f){
        fincas.remove(f);
    }

    public Finca findById(int id){
        return fincas.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Finca findByName(String nombre){
        return fincas.stream()
                .filter(f -> f.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<Finca> getFincasPorSuperficie(){
        return fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie))
                .toList();
    }

    public List<Finca> getMasGrandes(){
        return fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie).reversed())
                .limit(3)
                .toList();
    }

    public HashMap<String, List<Finca>> getFincasPorCiudad(){
         Map<String, List<Finca>> ciudad = fincas.stream()
                .collect(Collectors.groupingBy(Finca::getLocalidad));

        return new HashMap<>(ciudad);
    }

    public List<String> getFincasMedio(){
        return fincas.stream()
                .filter(f -> f.getSuperficie() > 50)
                .filter(f -> f.getSuperficie() < 150)
                .map(Finca::getNombre)
                .toList();
    }

    @Override
    public String toString() {
        return "DAOFinca{" +
                "fincas=" + fincas +
                '}';
    }
}
