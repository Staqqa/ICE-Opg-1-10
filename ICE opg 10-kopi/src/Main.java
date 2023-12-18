public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);

        double[] numbersToAdd = {5.0, 3.5, 2.0};
        calculator.add(numbersToAdd);

        // resultatet
        System.out.println("Resultat: " + calculator.getResult());

        // Nulstil result
        calculator.clear();

        // Udskriv den aktuelle værdi af result efter nulstilling
        System.out.println("Resultat efter nulstilling: " + calculator.getResult());


    }


    }
