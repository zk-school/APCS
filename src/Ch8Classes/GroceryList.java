package Ch8Classes;

public class GroceryList {

    private GroceryItemOrder[] list;
    private int numItems;

    public GroceryList() {
        list = new GroceryItemOrder[10];
        numItems = 0;
    }

    public void addItem(GroceryItemOrder item) {
        list[numItems] = item;
        numItems++;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < numItems; i++) {
            totalCost += list[i].getCost();
        }
        return totalCost;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < numItems; i++) {
            s = s + list[i].toString() + "\n";
        }
        s = s + "\nTotal Cost: $" + getTotalCost();
        return s;
    }

}
