public class Lion extends Animal {

    public Lion(String name, boolean isMammal) {
        super(name, isMammal);

    }

    @Override
    public void makeSound() {
        System.out.println("Roooaaarrr");
    }
}
