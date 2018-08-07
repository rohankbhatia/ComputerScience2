import java.util.Scanner;
public class CylinderTest
{

    public CylinderTest()
    {
        
    }
    public static void main(String[]args)
    {
       Scanner supreme = new Scanner(System.in);
       System.out.println("Enter radius of cylinder base.");
       int radius = supreme.nextInt();
       System.out.println("Enter height of cylinder.");
       int height = supreme.nextInt();
       Cylinder cylinder = new Cylinder(radius, height);
       System.out.println("Volume of Cylinder:" + cylinder.getVolume());
    }
    
}
