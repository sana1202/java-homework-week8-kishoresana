package cylinder;

/**
 * Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
 * variable) with name height of type double
 */
public class Cylinder extends Circle{
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
