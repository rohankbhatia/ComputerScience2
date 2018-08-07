public class Stars {
    public static void printStartTriangle(int n)
    {
         int spaces = n-1;
         int stars;                 
         for(int counter = 0; counter < n; counter++)
         {  
            stars = 2*counter+1;
            for(int counter2 = 1; counter2 <= spaces+stars; counter2++)
            {
                if(counter2 <= spaces)
                    System.out.print("     ");
                else
                    System.out.print("    *");
            }
            System.out.println("\n");
            spaces--;
        }    
    }
}