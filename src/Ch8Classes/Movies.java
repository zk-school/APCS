package Ch8Classes;

public class Movies {

    /**
     * Main method of the Movies class, which provides a working demonstration of the DVD and DVDCollection classes.
     * Movies demonstrates adding titles to a collection, as well as printing an audit of the collection.
     * @param args An array of command-line arguments, which is of absolutely no use in this particular application.
     */
    public static void main(String[] args) {
        // Creating a new collection:
        DVDCollection movies = new DVDCollection();

        // Adding movies to the collection:
        movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
        movies.addDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
        movies.addDVD("Iron Man", "Jon Favereau", 2008, 15.95, false);
        movies.addDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
        movies.addDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);

        // A listing of the collection:
        System.out.println(movies);

        // Adding two more movies:
        movies.addDVD("Iron Man 2", "Jon Favereau", 2010, 22.99, false);
        movies.addDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);

        // Printing out a final list:
        System.out.println(movies);
    }

}
