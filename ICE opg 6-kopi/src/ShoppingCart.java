import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    private ArrayList<Item> itemList;

    public ShoppingCart(String itemList) {
        this.itemList = new ArrayList<>();
    }
    //lavet en reminder til mig selv glemte at slet..

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayMyItems() {
        System.out.println("Indkøbskurv indeholder:");
        for (Item item : itemList) {
            System.out.println("- " + item.getName() + " - " + item.getPrice() + "Kr");
        }
        System.out.println();
    }

    public void removeItem(Item itemRemoved) {
        Iterator<Item> iterator = itemList.iterator();

        while (iterator.hasNext()) {
            Item currentItem = iterator.next();
            if (currentItem == itemRemoved) {
                iterator.remove();
                System.out.println("Fjernede " + currentItem.getName() + " fra indkøbskurven.");
                return; // Stop når elementet er fjernet
            }
        }
        System.out.println(itemRemoved.getName() + " blev ikke fundet i indkøbskurven.");

    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
