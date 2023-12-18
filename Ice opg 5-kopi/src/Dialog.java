import java.util.Scanner;

public class Dialog {
    int currentYear = 2023;

    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hey, please type your birthYear :)");
        int i = scanner.nextInt();

        System.out.println("Thanks, thats a nice age btw " + i);
        System.out.println("I will now calculate when you can retire, brb...");
        ;

        int yearsToRetirement = getYearsToRetirement(i);
        System.out.println("Du har nu " + yearsToRetirement + " år til pensionering.");


        scanner.close();

    }

    public int getCurrentYear() {
        return currentYear;
    }


    public int getYearsToRetirement(int i) {
        int retirement = i + 67;
        int yearsToRetirement = retirement - currentYear;


        return retirement;
    }

}
