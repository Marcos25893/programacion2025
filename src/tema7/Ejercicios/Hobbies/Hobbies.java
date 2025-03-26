package tema7.Ejercicios.Hobbies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Hobbies {

    private TreeMap<Persona, List<String>> hobbies;

    public Hobbies() {
        this.hobbies = new TreeMap<>(Comparator.comparing(Persona::getEdad));
    }

    public TreeMap<Persona, List<String>> getHobbies() {
        return hobbies;
    }

    public void addPersona(Persona persona){
        hobbies.put(persona, new ArrayList<>());
    }

    public void addHobbies(Persona persona, String hobbie){
        List<String> lista = hobbies.get(persona);

        lista.add(hobbie);
    }

    public void listarTodos(){

        for (Persona p : hobbies.keySet()){
            System.out.println(p.getNombre() + "{");
            for (String hobbies : hobbies.get(p)){
                System.out.println(hobbies);
            }
            System.out.println("}");
        }

    }
}
