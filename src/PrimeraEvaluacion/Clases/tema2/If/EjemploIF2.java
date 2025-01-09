package PrimeraEvaluacion.Clases.tema2.If;

public class EjemploIF2 {
    public static void main(String[] args) {
        //Personaje tiene vida y tiene mana
        //Si la vida es menor de 50 pinto que tiene que tomar pocion de vida
        //Si el mana es menor de 50 pino que tiene que tomar pocion de magia
        //Si la vida es menor de 50 y el mana es menor de 50 que pinte "CORRE"

        int vidaP =45;
        int manaP =33;

        if (vidaP<=50){
            System.out.println("Toma pocion de vida");
        }
        if (manaP<=50){
            System.out.println("Toma pocion de magia");
        }
        if (vidaP<=50 && manaP<=50){
            System.out.println("CORRE");
        }
    }
}
