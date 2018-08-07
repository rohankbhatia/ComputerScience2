import java.util.Scanner;
/**
 * Write a description of class BIOLOGY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Pratham and Matthew helped me.
public class BIOLOGY
{
    
    static int organism;
    static int growth;
    static int length;
    static int rate;
    static double value;
    static double growthcycles;
    static double result;
    public static void main(String[]args)
    {
        Scanner bape = new Scanner(System.in);
        System.out.println("Enter the initial number of organisms:");
        organism = bape.nextInt();
        System.out.println("Enter the rate of growth");
        growth = bape.nextInt();
        System.out.println("How many hours does it take to achieve this rate of growth?");
        rate = bape.nextInt();
        System.out.println("How long will the organisms be growing?");
        length = bape.nextInt();
        growthcycles = length/rate;
        result = organism*growth;
        if(growth <= 0)
        {
            System.out.println("Please enter a rate of growth that is greater than 0");
        }
        else{
            for(int counter = 1; counter<=growthcycles; counter++)
         {
            value = growthcycles * result;
            
         }
         System.out.println("The final number of organisms is " + value);
        }
        
        
        
    }
    
}
