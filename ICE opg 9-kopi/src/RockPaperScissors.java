
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast dit navn: ");
        String playerName = scanner.nextLine();


        // Spil loop
        while (true) {

            // Brugeren vælge sten, saks eller papir
            System.out.print("\n" + playerName + ", vælg sten (1), saks (2) eller papir (3): ");
            int playerChoice = scanner.nextInt();
            scanner.nextLine(); // Ryd bufferen

            // random C valg (1 for sten, 2 for saks, 3 for papir)
            int computerChoice = generateComputerChoice();

            // brugerens og computerens valg
            displayChoices(playerName, playerChoice, "Computer", computerChoice);

            // hvem er vinderen
            determineWinner(playerName, playerChoice, "Computer", computerChoice);

            // spille igen
            System.out.print("\nVil du spille igen? (ja/nej): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("ja")) {
                System.out.println("Farvel, " + playerName + "! Tak for at spille.");
                break;
            }
        }

        // Luk scanneren
        scanner.close();
    }


    private static int generateComputerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1; // Generer tilfældigt tal mellem 1 og 3
    }

    // Metode til at vise brugerens og computerens valg
    private static void displayChoices(String player1, int choice1, String player2, int choice2) {
        System.out.println("\n" + player1 + " valgte: " + choiceToString(choice1));
        System.out.println(player2 + " valgte: " + choiceToString(choice2));
    }

    // Metode til at konvertere valg fra tal til streng (sten, saks eller papir)
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "sten";
            case 2:
                return "saks";
            case 3:
                return "papir";
            default:
                return "Ugyldigt valg";
        }
    }

    // Metode til at afgøre vinderen
    private static void determineWinner(String player1, int choice1, String player2, int choice2) {
        if (choice1 == choice2) {
            System.out.println("Uafgjort!");
        } else if ((choice1 == 1 && choice2 == 2) || (choice1 == 2 && choice2 == 3) || (choice1 == 3 && choice2 == 1)) {
            System.out.println(player1 + " vinder!");
        } else {
            System.out.println(player2 + " vinder!");
        }
    }
}


