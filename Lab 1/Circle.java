
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    private double radius;
    private double area;
   
    public Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
        area = Math.PI*radius*radius;
        return area;
        
    }
    public double getRadius()
    {
        return radius;
    }
}
