package tema7_parte3.Practica3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLectura {

    private Set<Lectura> lecturas;

    public DAOLectura() {
        this.lecturas = new HashSet<>();
        cargarDatos();
    }

    private void cargarDatos(){

        DAOFinca daoFinca = new DAOFinca();

        try {
            lecturas = Files.lines(Paths.get("resources/lecturas.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Lectura lectura = new Lectura(
                                Integer.parseInt(tokens.get(0)),
                                Double.parseDouble(tokens.get(1)),
                                Double.parseDouble(tokens.get(2)),
                                LocalDate.parse(tokens.get(3)),
                                daoFinca.findById(Integer.parseInt(tokens.get(4)))

                        );
                        return lectura;
                    })
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void grabarDatos(){
        ArrayList<String> lineas = new ArrayList<>();

        lecturas.stream().forEach( l -> {
            StringBuffer sb = new StringBuffer();
            sb.append(l.getId());
            sb.append(",");
            sb.append(l.getTemperatura());
            sb.append(",");
            sb.append(l.getHumedad());
            sb.append(",");
            sb.append(l.getMomento());
            sb.append(",");
            sb.append(l.getId());
            sb.append(",");
            sb.append(l.getFinca());
            sb.append(",");

            lineas.add(sb.toString());
                }

        );

        try {
            Files.write(Path.of("resources/lecturas.csv"),
                    lineas,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void addLectura(Lectura l){
        lecturas.add(l);
    }

    public void deleteLectura(Lectura l){
        lecturas.remove(l);
    }

    public HashMap<Integer, List<Lectura>> getLecturasPorFinca(){
        Map<Integer, List<Lectura>> finca = lecturas.stream()
                .collect(Collectors.groupingBy(l -> l.getFinca().getId()));

        return new HashMap<>(finca);
    }

    public Double getTempMaximaFinca(int id){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId().equals(id))
                .max(Comparator.comparing(Lectura::getTemperatura))
                .map(Lectura::getTemperatura)
                .orElse(null);
    }

    public Double getTempMinimaFinca(int id){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId().equals(id))
                .min(Comparator.comparing(Lectura::getTemperatura))
                .map(Lectura::getTemperatura)
                .orElse(null);
    }

    public List<Double> getHumedadPorFinca(int id){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId().equals(id))
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getHumedad)
                .toList();
    }

    public List<Double> getTemperaturaPorFinca(int id){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId().equals(id))
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .toList();
    }
/*
    public List<Double> getTempDiaPorFinca(int id, LocalDate dia){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId().equals(id))
                .filter(l -> l.getMomento().toLocalDate().equals(dia))
                .sorted(Comparator.comparing(l -> l.getMomento().toLocalTime()))
                .map(Lectura::getTemperatura)
                .toList();
    }

*/

    @Override
    public String toString() {
        return "DAOLectura{" +
                "lecturas=" + lecturas +
                '}';
    }
}
