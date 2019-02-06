package Ch8Classes;

public class GroceriesClient {

    public static void main(String[] args) {
        GroceryList list = new GroceryList();

        list.addItem(new GroceryItemOrder("Milk", 1, 2.39));
        list.addItem(new GroceryItemOrder("Eggs", 12, 0.37));
        list.addItem(new GroceryItemOrder("Cloves", 5, 0.07));
        list.addItem(new GroceryItemOrder("Vanilla", 1, 4.25));
        list.addItem(new GroceryItemOrder("White Sugar", 3, 1.35));
        list.addItem(new GroceryItemOrder("Light Cream", 1, 7.50));
        list.addItem(new GroceryItemOrder("Nutmeg", 1, 3.65));

        System.out.println(list);
    }

}
