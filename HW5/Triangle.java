import java.util.Scanner;
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
       public static void main (String[]args)
    {
        Scanner sup = new Scanner(System.in);
        System.out.println("Enter lngth of side A as a double");
        double Alength = sup.nextDouble();
        System.out.println("Enter the length of side B as a double.");
        double Blength = sup.nextDouble();
        System.out.println("Enter the length of side c as a double.");
        double Clength = sup.nextDouble();
        if ((Alength*Alength) + (Blength*Blength) == (Clength * Clength))
        {
            System.out.println("Your Triangle is indeed a right triangle");
        }
        else
        {
            System.out.println("Sorry, your Triangle is a meme");
        }
        
    }
}
