package tema6.EjercicioClasePoo;

import java.time.LocalDate;

public class TestComic {
    public static void main(String[] args) throws Exception {

        Anime an1 = new Anime(850, LocalDate.of(1998,11,5), "Ninjas", 35.45,
                Genero.SUPERHEROES, 10, 100, "ninja");

        Anime an2 = new Anime(535, LocalDate.of(1989,7,3), "Samurais", 25.5,
                Genero.HISTORICO, 10, 35, "samurai");

        NovelaGrafica ng1 = new NovelaGrafica(100, LocalDate.of(2020,5,23), "Tragedia",
                45.0, Genero.DRAMA, 5, "Tragedia de una familia de clase noble");

        Autor a1 = new Autor("Pepe", "Sanchez", "pepe@gmail.com", LocalDate.of(1968,10,2),
                Rol.GUIONISTA);

        Autor a2 = new Autor("Paco", "Romero", "paco@gmail.com", LocalDate.of(1969,3,20),
                Rol.GUIONISTA);

        Autor a3 = new Autor("Ana", "Sanchez", "aaaa@gmail.com", LocalDate.of(1975,9,15),
                Rol.DIBUJANTE);
/*
        a1.addComic(an1);
        a3.addComic(ng1);
        a2.addComic(an2);
*/
        TiendaComics tc1 = new TiendaComics();

        Cliente c1 = new Cliente("526584255S", "cliente1@gmail.com", "casa", "banco");
        Cliente c2 = new Cliente("526584255P", "cliente2@gmail.com", "casita", "Cliente2");

        Venta v1 = new Venta(c1,an1,LocalDate.of(2023, 1, 14));
        Venta v2 = new Venta(c1,an2,LocalDate.of(2023, 1, 14));
        Venta v3 = new Venta(c2,an1,LocalDate.of(2024, 5, 3));
        Venta v4 = new Venta(c2,an1,LocalDate.of(2024, 7, 14));
        Venta v5 = new Venta(c1,ng1,LocalDate.of(2025, 1, 30));
        Venta v6 = new Venta(c2,ng1,LocalDate.of(2025, 3, 2));

        tc1.addComic(an1);
        tc1.addComic(an2);
        tc1.addComic(ng1);

        tc1.addVenta(v1);
        tc1.addVenta(v2);
        tc1.addVenta(v3);
        tc1.addVenta(v4);
        tc1.addVenta(v5);
        tc1.addVenta(v6);

        System.out.println(tc1.listarComics());
        System.out.println();
        System.out.println(tc1.listarVentas());
        System.out.println();

        tc1.buscar(LocalDate.now().minusYears(15),LocalDate.now(), Genero.DRAMA);
    }
}
