public class Main {
    public static void main(String[] args) {
        Item agurk = new Item("Agurk", 8);
        Item ris = new Item("Ris", 65);
        Item sucuk = new Item("sucuk", 50);
        Item radiser = new Item("Radiser", 10);
        Item æbleskiver = new Item("Æbleskiver", 15);

        ShoppingCart shoppingCart = new ShoppingCart("");

        shoppingCart.addItem(agurk);
        shoppingCart.addItem(ris);
        shoppingCart.addItem(sucuk);
        shoppingCart.addItem(radiser);
        shoppingCart.addItem(æbleskiver);

        //Den ville ikke fjerne min agurk fra listen...

        shoppingCart.displayMyItems();

        Item itemToRemove = new Item("agurk", 8);
        shoppingCart.removeItem(itemToRemove);

        //remove/iteratotion commands ^^

        shoppingCart.displayMyItems();

        double total = shoppingCart.getTotalPrice();
        System.out.println("Din total pris er - " + total + " Kr");

    }
}

