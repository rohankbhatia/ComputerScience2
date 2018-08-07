import java.util.Scanner;
import java.lang.Math.*;
/**
 * Write a description of class nSided here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nSided
{

    public static void main (String [] args)
    {
        boolean isSides;
        boolean isLength;
        int nSides = 0;
        double nLength = 0;
        Scanner nScanInt = new Scanner(System.in); //Creation of a new scanner for integer variables
        Scanner nScanDouble = new Scanner(System.in); //Creation of a new scanner for Double variables
        Scanner nScanString = new Scanner(System.in); //Creation of a new scanner for String variables
        System.out.println("How many sides will the polygon be?Enter as an INT");
        do{
            if(nScanInt.hasNextInt()) //TypeValidation of input
            {
                nSides = nScanInt.nextInt();
                isSides = true; 
            }
            else 
            {
                System.out.println("I can not comprehend anything besides an INT here.");
                isSides = false;
                nScanInt.next();
            }
        }
        while(!(isSides == true));
        System.out.println("What is the length of each side in a double?");
        do{
            if(nScanDouble.hasNextDouble()){ //TypeValidation of Input
                nLength = nScanDouble.nextInt();
                isLength = true;
            }
            else{
                System.out.println("I can not comprehend anything besides a DOUBLE here.");
                isLength = false;
                nScanDouble.next();
            }
        } while(!(isLength == true));
        System.out.println("The perimeter of a polygon with " + nSides + " sides and a length of " + nLength + " is " + (nLength*nSides));
        if(nSides <=2)
        {
            System.out.println("Please enter an integer greater than 2");
        }
        else if(nSides == 3)
        {
            double angle = 180/nSides; //Triangle only has 180 degrees
            //System.out.println(angle);
        }
        else if(nSides >= 3){
            double angle = 360/nSides;
            //System.out.println(angle);
        }
        double a = (nSides * Math.pow(nLength, 2)) / (4 * Math.tan ((Math.PI) / nSides));//the variable that stores the equation to find the area of any given pGram
        //System.out.println(a);
        System.out.println("The area of a polygon with " + nSides + " sides and a length of " + nLength + " is " + a); //Out print value

    }

}
