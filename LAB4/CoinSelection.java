import java.util.Scanner;
/**
 * Write a description of class CoinSelection here.
 * 
 * @author (Rohan Bhatia) 
 * @version (a version number or a date)
 */
//matthew and Benjamin helped me
//jeffrey worked with me
public class CoinSelection
{
    
    public static void main(String[]args)
    {
        Scanner coinScan = new Scanner(System.in);
        System.out.println("Enter the amount in cents:");
        int amount = coinScan.nextInt();
        int counter = 0;
        for(int quarter = 0; quarter*25 <= amount; quarter++){
            for(int dime = 0; dime*10 <= amount - quarter*25; dime++){
                for(int nickel = 0; nickel*5 <= amount - (quarter*25 + dime*10); nickel++){
                    System.out.println("amt" +  " = " + quarter + "  " + "quarters" +  " + " + dime + "  " + "dimes + " + nickel + " nickels" + " + " + (amount - (quarter*25 + dime*10 + nickel*5)) + "  " + "pennies"); 
                    counter++;
                }
            }
        }
        
       System.out.println("There are " + counter + " different coin combinations");
    }
    
}
