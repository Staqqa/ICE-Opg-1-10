import java.util.Random;

public class Die {
    int sides;
    Random random;

    public Die(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int getSides() {
        return sides;
    }


    public int roll() {
        return random.nextInt(sides) + 1;
    }

    public int howManyIdenticalThrows(int kastAntal) {
    return kastAntal;
    }
}
