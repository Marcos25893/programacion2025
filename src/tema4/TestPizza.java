package tema4;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pz1 = new Pizza(Pizza.Size.FAMILIAR, Pizza.Tipo.CARBONARA);
        Pizza pz2 = new Pizza(Pizza.Size.MEDIANA, Pizza.Tipo.BARBACOA);
        Pizza pz3 = new Pizza(Pizza.Size.PEQUEÑA, Pizza.Tipo.CUATROQUESOS);

        System.out.println("Pizzas Preparadas: " + Pizza.getTotalPreparadas());
        System.out.println("Pizzas Servidas: " + Pizza.getTotalServidas());

        pz1.sirve();
        pz2.sirve();

        System.out.println("Pizzas Preparadas: " + Pizza.getTotalPreparadas());
        System.out.println("Pizzas Servidas: " + Pizza.getTotalServidas());
    }
}
