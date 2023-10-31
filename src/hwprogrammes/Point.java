package hwprogrammes;

public class Point {
    private int x; // Integer declaration
    private int y; // Integer declaration

    public Point() { // no args constructor
        this(0, 0);
    }

    public Point(int x, int y) { // Constructor with two int parameters
        this.x = x;
        this.y = y;
    }

    public int getX() { // int type method returning value of x
        return x;
    }

    public void setX(int x) { // void type with return method setting value of x
        this.x = x;
    }

    public int getY() { // int type method returning value of y
        return y;
    }

    public void setY(int y) { // void type method setting value of y
        this.y = y;
    }

    public double distance() { // method with logic to return distance in decimal number between point & point 0,0
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int x, int y) { // same method with parameters & logic to return distance in decimal number between point & point x,y
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * ((this.y - y)));
    }

    public double distance(Point xy) { // same method with parameters & logic to return distance in decimal between point & another point
        return Math.sqrt((this.x - xy.x) * (this.x - xy.x) + (this.y - xy.y) * (this.y - xy.y));
    }


    public static void main(String[] args) {// Main method with Test code
        Point first = new Point(6, 5); // Object creation with values
        Point second = new Point(3, 1); // object creation with different set of values
        System.out.println("distance(0,0)= " + first.distance()); // calling distance method with first value
        System.out.println("distance(second)= " + first.distance(second)); // calling distance method providing different values
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // calling distance method with given values
        Point point = new Point(); // Default object creation
        System.out.println("distance()= " + point.distance()); // Calling distance method as is without giving values
    }
}
