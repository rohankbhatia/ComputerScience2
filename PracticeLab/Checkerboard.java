import java.util.Scanner;
/**
 * Write a description of class Checkerboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkerboard
{
    public static void printCheckerboard(int n)
    {
        //Scanner graph = new Scanner(System.in);
        //System.out.println("Enter the rows and columns you want in your checkerboard");
        //int number = graph.nextInt();
        for(int row = 1; row <= n; row++)
        {
            for(int column = 1; column <= n; column++)
            {
                if (column % 2 == 0 )
                {
                    System.out.println("o"+ "#");
                }
                else
                {
                    System.out.println("#" + "o");
                }
            }
            System.out.println();
        }
           
        }
    
    }
  

