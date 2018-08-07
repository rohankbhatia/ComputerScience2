import java.util.Scanner;
public class Circle 
{
	public static void main(String[]args)
	{
	    Scanner supreme = new Scanner(System.in);
	    System.out.println("Enter radius of Sphere as a double.");
	    double length = supreme.nextDouble();
	    System.out.println("Surface area:" +(4*length*length*3.14));
	    System.out.println("Diameter:" +(2*length));
	    System.out.println("Circumference:" +(2*length*3.14));
	    System.out.println("Volume:" +(4/3*length*length*length*3.14));

	}
}
