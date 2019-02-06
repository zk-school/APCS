package Ch8Classes;

public class GroceryItemOrder {

    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return quantity + "\t" + name + "\t" + pricePerUnit;
    }

}
