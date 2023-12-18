import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        Lion lion = new Lion ("Simba", true);
        Lion lion1 = new Lion ("Mufasa", true);
        Parrot parrot1 = new Parrot("Lilly", false);
        Parrot parrot = new Parrot("Frank", false);

        zoo.add(lion);
        zoo.add(lion1);
        zoo.add(parrot);
        zoo.add(parrot1);

        for (Animal animal : zoo){
            animal.makeSound();
            }
ArrayList<Animal> zooMammals = new ArrayList<>();
        zooMammals.add(lion);
        zooMammals.add(lion1);

        System.out.println("Alle dyr liste: " + zoo);
        System.out.println("Alle dyr som er mammals: " + zooMammals);






        }


    }
