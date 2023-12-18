public class Parrot extends Animal {


    public Parrot(String name, boolean isMammal) {
        super(name, isMammal);
    }


    @Override
    public void makeSound() {
        System.out.println("Squeak! Hello world!");
    }
}
