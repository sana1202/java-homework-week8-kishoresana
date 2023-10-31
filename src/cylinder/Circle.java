package cylinder;

/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double
 */
public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
