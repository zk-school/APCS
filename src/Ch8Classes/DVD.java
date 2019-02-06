package Ch8Classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DVD {

    /**
     * The title of the movie.
     */
    private String title;
    /**
     * The movie's director.
     */
    private String director;
    /**
     * Year of release.
     */
    private int year;
    /**
     * The cost of the DVD.
     */
    private double cost;
    /**
     * Boolean; whether or not the movie is also available on Blu-Ray.
     */
    private boolean blueray;

    /**
     * Constructs a new DVD object.
     * A DVD object represents a movie on disc and contains attributes such as the title and director, and whether the movie is also available on Blu-Ray.
     * @param title The title of the movie.
     * @param director The movie's director.
     * @param year Year of release.
     * @param cost The cost of the DVD.
     * @param blueray Boolean; whether or not the movie is also available on Blu-Ray.
     */
    public DVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * Retrieves the cost of an individual DVD in dollars.
     * @return The cost as a real number.
     */
    public double getCost() {
        return cost;
    }

    /**
     * This method is provided to properly format prices and costs of DVDs for use in a String output, and can be used outside this class.
     * Formatting procedure is as follows:
     * <ol>
     *     <li>Price is rounded to 2 decimal places using BigDecimal and RoundingMode.</li>
     *     <li>Rounded price is formatted with DecimalFormat; leading zeros are added as necessary.</li>
     *     <li>Examples: 3.5 becomes 3.50, 9.58812 becomes 9.59.</li>
     * </ol>
     * @param value Cost of a DVD represented as a real number.
     * @return The rounded, formatted cost as a String.
     * @see BigDecimal
     * @see DecimalFormat
     */
    public static String formatCost(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return new DecimalFormat("#.00")
                .format(bd.doubleValue());
    }

    /**
     * A representation of the DVD object as a String.
     * @return The DVD's attributes, including movie title and cost.
     */
    public String toString() {
        String bdAvailable = "";
        if (blueray) {
            bdAvailable = "\tBlu-Ray";
        }
        return "$" + formatCost(cost) + "\t" + year + "\t" + title + "\t" + director + bdAvailable;
    }

}
