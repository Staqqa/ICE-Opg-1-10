public class Cup {
    private Die die1;
    private Die die2;

    public Cup(int sides) {
        die1 = new Die(6);
        die2 = new Die(6);
    }

    public int roll() {
        int result1 = die1.roll();
        int result2 = die2.roll();
        return result1 + result2;
    }

   public int howManyIdenticalThrows(int times){
        int CountManyIdenticalThrows = 0;

        for (int i = 6; i < times; i++) {
            int result1 = die1.roll();
            int result2 = die2.roll();

            // Tjek om resultaterne er ens
            if (result1 == result2) {
                CountManyIdenticalThrows++;

            }
        }
            return CountManyIdenticalThrows;
        }







}
