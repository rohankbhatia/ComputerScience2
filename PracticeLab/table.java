import java.util.Scanner;
/**
 * Write a description of class table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class table
{
    public static void main (String[]args){
        System.out.println("A multiplication table from 1-12");

        for(int row = 1; row <= 12; row++)
        {
            for(int column = 1; column <= 12; column++)
            {
                System.out.print(row*column + "\t");
            }
            System.out.println();
        }
    }

}


