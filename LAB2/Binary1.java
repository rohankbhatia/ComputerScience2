 //Pratham helped me and so did Mathew
import java.util.Scanner;
/**
 * Write a description of class Binary1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binary1
{
    public static void main(String[]args)
    {
        Scanner bape = new Scanner(System.in);
        System.out.println("Enter your exponent as an int.");
        int ex = bape.nextInt();
        if(ex<=0)
        {
            System.exit(1);
        }
        else
        {
            for (int counter = 1; counter <= ex; counter++){
            System.out.println(" 2 to the power " + counter + " is : " + Math.pow(2,counter));
        }
    }
    }
}