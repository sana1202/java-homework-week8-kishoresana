package pool_area;

/**
 * Write a class with name Cuboid that extends rectangle class. The class needs one field(instance variable) with name height of type double
 */
public class Cuboid extends Rectangle{
    double height;
    public Cuboid(double width, double length, double height){

        super(width, length);
        this.height=height;
        if (height<0);
        this.height=0;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
