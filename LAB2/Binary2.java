import java.util.Scanner;
//helped by Pratham and Matthew
/**
 * Write a description of class Binary2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binary2
{
    public static void main(String[]args)
    {
        Scanner bape = new Scanner(System.in);
        System.out.println("Enter your base as an int:");
        int base = bape.nextInt();
        System.out.println("Enter your exponent as an int.");
        int ex = bape.nextInt();
       
        if(ex<=0)
        {
            System.exit(1);
        }
        else
            for(int counter = 1; counter<=ex; counter++)
            {
            System.out.println("The binary value of " + base + " to the power " + counter + "is:" + Math.pow(base,counter));
        }
    }
    }

