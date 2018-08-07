import java.util.Scanner;
/**
 * Write a description of class Division here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Division
{
   public static void main(String[]args)
   {
       Scanner meme = new Scanner(System.in);
       System.out.println("Enter an integer as an int");
       int a = meme.nextInt();
       System.out.println("Enter another integer");
       int b = meme.nextInt();
      
       int larger = Math.max(a, b);
       int Smaller = Math.min(a,b);
       System.out.println("The quotient:" + (larger/Smaller) + "R" + (larger%=Smaller));
       
       
    }
}