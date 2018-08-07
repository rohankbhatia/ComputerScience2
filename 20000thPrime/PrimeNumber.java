import java.util.Scanner;
/**
 * Write a description of class PrimeNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeNumber
{
   public static void main (String[]args) {
       Scanner math = new Scanner(System.in); 
       System.out.println("Enter the number of which youwoud like to find the prime");
       int n = math.nextInt();
       Boolean[] array = new Boolean[20000];
       array.fill(array, Boolean.TRUE);
        for(int i = 2; i< (n*n) ; i++)
        {
        
    }
    //System.out.println("The 20000th prime number is:" + );
}
}
