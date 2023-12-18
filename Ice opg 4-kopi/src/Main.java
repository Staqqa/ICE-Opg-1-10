import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int sides = 6;
        Cup cup = new Cup(sides);
        int kastResultat = cup.roll();
        System.out.println("Resultatet af dine kast er: " + kastResultat);
        System.out.println("");

        int kastAntal = 77;
        System.out.println("Nu vil vi kaste "+ kastAntal + " gange og printe resultatet af det: ");
        int antalEnsKast = cup.howManyIdenticalThrows(kastAntal);

        System.out.println("Antal ens kast i " + kastAntal + " kast, : " + antalEnsKast);
    }

}
