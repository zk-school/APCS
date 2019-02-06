package Ch8Classes;

public class DVDCollection {

    /**
     * An array containing the DVD objects.
     */
    private DVD[] collection;
    /**
     * The number of DVDs in the collection.
     */
    private int count;
    /**
     * The total cost of the whole collection.
     */
    private double totalCost;

    /**
     * Constructs a new DVDCollection object.
     * A DVDCollection object represents a collection of DVDs, as well as the number of DVDs in the collection and the collection's total cost.
     */
    public DVDCollection() {
        collection = new DVD[1];
        count = 0;
        totalCost = 0.0;
    }

    /**
     * Constructs and adds a new DVD object to the collection.
     * Upon adding a DVD, <code>increaseSize()</code> is called to make room for additional objects.
     * The total cost of the collection is then updated using <code>DVD.getCost()</code>.
     * @param title The title of the movie.
     * @param director The movie's director.
     * @param year Year of release.
     * @param cost The cost of the DVD.
     * @param blueray Boolean; whether or not the movie is also available on Blu-Ray.
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray) {
        if (count > 0) {
            if (collection[count - 1] != null) {
                increaseSize();
            }
        }
        collection[count] = new DVD(title, director, year, cost, blueray);
        totalCost += collection[count].getCost();
        count++;
    }

    /**
     * Used to increase the size of the array when a new DVD is added, as well as update the size of the collection.
     * This is akin to buying new shelves for your DVDs when you run out of space!
     */
    private void increaseSize() {
        DVD[] move = new DVD[collection.length + 1];
        System.arraycopy(collection, 0, move, 0, collection.length);
        collection = move;
    }

    /**
     * Creates a String representation of the DVD collection.
     * Costs are formatted using <code>DVD.formatCost()</code>.
     * @return The number of DVDs in the collection, total/average cost, and a listing of the DVDs themselves.
     */
    public String toString() {
        String s = "My DVD Collection\n\n" +
                "Number of DVDs: " + (count) + "\n" +
                "Total cost: $" + DVD.formatCost(totalCost) + "\n" +
                "Average cost: $" + DVD.formatCost(totalCost / ((double) count)) + "\n\n" +
                "DVD List:\n\n";
        for (int i = 0; i < collection.length; i++) {
            s += collection[i] + "\n";
        }
        return s;
    }

}
