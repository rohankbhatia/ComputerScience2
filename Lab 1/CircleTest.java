import java.util.Scanner;
public class CircleTest
{

    public CircleTest()
    {
        
    }
    public static void main(String[]args)
    {
       Scanner supreme = new Scanner(System.in);
       System.out.println("Enter radius of Circle as an int.");
       int radius = supreme.nextInt();
       Circle circle = new Circle(radius);
       System.out.println("Area:" + circle.getArea());
    }
    
}


