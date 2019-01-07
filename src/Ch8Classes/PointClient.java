package Ch8Classes;

public class PointClient {

    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("p1: " + p1);
        p1.x = 3;
        p1.y = 6;
        System.out.println(p1.toString());
    }

}
