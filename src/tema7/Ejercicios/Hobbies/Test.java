package tema7.Ejercicios.Hobbies;

public class Test {

    public static void main(String[] args) {

        Hobbies h1 = new Hobbies();

        Persona p1 = new Persona("Paco", 45);
        h1.addPersona(p1);
        h1.addHobbies(p1, "Correr");
        h1.addHobbies(p1, "Bici");

        Persona p2 = new Persona("Pepe", 25);
        h1.addPersona(p2);
        h1.addHobbies(p2, "Natación");
        h1.addHobbies(p2, "Futbol");

        Persona p3 = new Persona("Antonio", 55);
        h1.addPersona(p3);
        h1.addHobbies(p3, "Correr");
        h1.addHobbies(p3, "Baloncesto");
        h1.addHobbies(p3, "Tenis");

        h1.listarTodos();
    }
}
