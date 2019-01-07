package Ch8Classes;

public class Point {

    // Create fields x and y (variables)
    public int x;
    public int y;
    private static int objCount;

    // Create the behaviors (methods)
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Accessor methods (non-void):
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public double distanceFromOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getObjCount() {
        return objCount;
    }

    public static void main(String[] args) {

    }

    // Constructor methods, which have no return type.
    // These are called implicitly when the object is created.

}
