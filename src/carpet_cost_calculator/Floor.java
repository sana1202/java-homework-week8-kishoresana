package carpet_cost_calculator;

/**
 * Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 */
public class Floor {
    double width;
    double length;
    public Floor(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
}
