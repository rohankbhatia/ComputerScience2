import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static void main (String[]args) {
        Random gen = new Random();
        Scanner math = new Scanner(System.in); 
           System.out.println("Choose your maximum number in your range.");
        int max = math.nextInt();
        System.out.println("Choose your minimum number in your range.");
        int min = math.nextInt();
        for (int counter2 = 0; counter2 < 1; counter2++){

        }
        int number = gen.nextInt(max+1);
        System.out.println(number);
        
        
        System.out.println("Type a number between " + min + " and " + max + ", you have 5 guesses");
        int guess = math.nextInt();
        if(guess > max || guess <min){
            System.out.println("Please enter a valid integer between the 2 numbers");
        }
        
       
        if(guess == number)
        {
            System.out.println("Congratulations you win. You guessed the correct number");
            System.exit(1);
        }
        else
        {
            if(guess < number)
            { 
                System.out.println("Guess again, the number is higher");
                
            }
            else
                System.out.println("Guess Again, the number is lower");
        }
        
        System.out.println("Type a number between 1 and 50 you have 4 guesses");
        int guess2 = math.nextInt();
        
       
        if(guess2 == number)
        {
            System.out.println("Congratulations you win. You guessed the correct number");
            System.exit(1);
        }
        else
        {
            if(guess2 < number)
            { 
                System.out.println("Guess again, the number is higher");
                
            }
            else
                System.out.println("Guess Again, the number is lower");
        }
        
        System.out.println("Type a number between 1 and 50 you have 3 guesses");
        int guess3 = math.nextInt();
        
       
        if(guess3 == number)
        {
            System.out.println("Congratulations you win. You guessed the correct number");
            System.exit(1);
        }
        else
        {
            if(guess3 < number)
            { 
                System.out.println("Guess again, the number is higher");
                
            }
            else
                System.out.println("Guess Again, the number is lower");
        }
        
        System.out.println("Type a number between 1 and 50 you have 2 guesses");
        int guess4 = math.nextInt();
        
       
        if(guess4 == number)
        {
            System.out.println("Congratulations you win. You guessed the correct number");
            System.exit(1);
        }
        else
        {
            if(guess4 < number)
            { 
                System.out.println("Guess again, the number is higher");
                
            }
            else
                System.out.println("Guess Again, the number is lower");
        }
        
        System.out.println("Type a number between 1 and 50 you have 1 guess");
        int guess5 = math.nextInt();
        
       
        if(guess5 == number)
        {
            System.out.println("Congratulations you win. You guessed the correct number");
            System.exit(1);
        }
        else
        {
            if(guess5 < number)
            { 
                System.out.println("Ooops, game over, you loose!");
                
            }
            else
                System.out.println("Ooops, game over, you loose!");
        }

    }

}



