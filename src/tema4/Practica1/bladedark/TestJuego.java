package tema4.Practica1.bladedark;

public class TestJuego {
    public static void main(String[] args) {

        Arma espada = new Arma("Espada Sagrada", Arma.Tipo.ESPADA, 60, true);
        Arma arco = new Arma("Arco ligero", Arma.Tipo.ARCO, 15,false);
        Jugador pj1 = new Jugador();
        Monstruo urol = new Monstruo("Urol", Monstruo.Clase.TROLL, 100.0, 2, 25);
        Monstruo orol = new Monstruo("Orol", Monstruo.Clase.GOBLIN, 50.0, 9, 75);
        Monstruo godrick = new Monstruo("Godrick", Monstruo.Clase.DEMONIO, 300.0, 5,80);
        Jugador pj2 = new Jugador();

        pj1.setNombre("Arturo");
        pj1.setClase(Jugador.Clase.CABALLERO);
        System.out.println(pj1);

        pj1.equipar(espada);
        System.out.println(pj1);
        System.out.println(urol);

        pj1.golpearJ(urol);
        urol.golpearM(pj1);
        System.out.println(pj1);
        System.out.println(urol);

        pj1.golpearJ(urol);
        System.out.println(pj1);
        System.out.println(urol);
        System.out.println(orol);

        pj1.golpearJ(orol);
        System.out.println(pj1);

        godrick.subirNivelM();
        do {
            pj1.golpearJ(godrick);
            godrick.golpearM(pj1);
        }while (pj1.getSalud()>0 && godrick.getSalud()>0);
        System.out.println(pj1);
        System.out.println(godrick);

        pj2.setNombre("Alfred");
        pj2.equipar(espada);
        System.out.println(pj2);

        pj2.equipar(arco);
        System.out.println(pj2);

        pj2.dejarArma(espada);
        pj2.equipar(arco);
        pj2.tomarPocion(100);
        System.out.println(pj2);

        pj1.tomarPocion(50);
        System.out.println(pj1);

    }
}
