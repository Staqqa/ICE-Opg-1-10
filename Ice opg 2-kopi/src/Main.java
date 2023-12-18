public class Main {
    public static void main(String[] args) {


        PasswordValidater Pass = new PasswordValidater(8, 11, false);

        String testPassword = "EasyPeasy";

        if (Pass.isValid(testPassword)) {
            System.out.println("Password er gyldigt!");
        } else {
            System.out.println("Password er ikke gyldigt!");
        }

    }
    }
