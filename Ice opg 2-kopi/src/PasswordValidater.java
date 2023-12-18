public class PasswordValidater {
    private int minLength;
    private int maxLength;
    private boolean numbersRequired;

    public PasswordValidater(int minLength, int maxLength, boolean numbersRequired) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public boolean getNumbersRequired() {
        return numbersRequired;
    }

    public boolean isValid(String password) {
        return password.length() >= minLength && password.length() <= maxLength;
    }

}


