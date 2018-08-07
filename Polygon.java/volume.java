import java.util.Scanner;
import java.lang.Math.*;
/**
 * Write a description of class nSided here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volume
{

    public static void main (String [] args)
    {
        boolean isSidesPGram;
        boolean isLengthPGram;
        boolean isHeight;
        boolean isWidth;
        boolean isLengthPrism;
        boolean isBase;
        boolean isSidesPrism;
        boolean isString;
        int nBase = 0;
        int nWidth = 0;
        double nLength = 0;
        int nSides2 = 0;
        double nLength2 = 0;
        double nHeight = 0;
        int nSides = 0;
        String prism;
        Scanner nScanInt = new Scanner(System.in); //Creation of a new scanner for integer variables
        Scanner nScanDouble = new Scanner(System.in); //Creation of a new scanner for Double variables
        Scanner nScanString = new Scanner(System.in); //Creation of a new scanner for String variables
        
        //private static final String[] PossibleAnswere = {"Yes","No"};
      
        System.out.println("Is the fiqure a 3d prism?Enter Yes or NO");
        prism = nScanString.nextLine();
            if(prism.equalsIgnoreCase("Yes")){
                System.out.println("How many sides will the prism have? Enter as an INT");
                do{
                    if(nScanInt.hasNextInt())
                    {
                        nSides = nScanInt.nextInt();
                        isSidesPrism = true; 
                    }
                    else 
                    {
                        System.out.println("I can not comprehend anything besides an INT here.");
                        isSidesPrism = false;
                        nScanInt.next();
                    }
                }
                while(!(isSidesPrism == true));
                System.out.println("How many sides does the base shape of the prism have?");
                do{
                    if(nScanDouble.hasNextDouble()){
                        nBase = nScanDouble.nextInt();
                        isBase = true;
                    }
                    else{
                        System.out.println("I can not comprehend anything besides a DOUBLE here.");
                        isBase = false;
                        nScanDouble.next();
                    }
                } while(!(isBase == true));
                System.out.println("What is the length of each side of the base of the prism in a double?");
                do{
                    if(nScanDouble.hasNextDouble()){
                        nLength = nScanDouble.nextInt();
                        isLengthPrism = true;
                    }
                    else{
                        System.out.println("I can not comprehend anything besides a DOUBLE here.");
                        isLengthPrism = false;
                        nScanDouble.next();
                    }
                } while(!(isLengthPrism == true));

                System.out.println("What is the height of the prism? Enter as a double.");
                do{
                    if(nScanDouble.hasNextDouble()){
                        nHeight = nScanDouble.nextDouble();
                        isHeight = true;
                    }
                    else{
                        System.out.println("I can not comprehend anything besides a DOUBLE here.");
                        isHeight = false;
                        nScanDouble.next();
                    }
                } while(!(isHeight == true));
                double a = (nBase * Math.pow(nLength, 2)) / (4 * Math.tan ((Math.PI) / nBase)); //For the area of the base pGram
                if(nSides == 6)
                {
                    System.out.println("The perimeter of a prism with " + nSides + " sides, a base side length of " + nLength + " for a base with " + nBase + " sides is " + ((nBase*nLength)*nSides));
                    //applies to cubes and rectangular prisms
                }
                else if(nSides >6)
                {
                    System.out.println("The perimeter of this prism is " + ((2*a)+(nHeight*(nSides-2))));
                    //Any other prism
                }
                //System.out.println("The perimeter of a prism with " + nSides + " sides, a base side length of " + nLength + " for a base with " + nBase + " sides is " + ((nBase*nLength)*nSides));
                if(nBase <=2)
                {
                    System.out.println("Please enter an integer greater than 2");
                }
                else if(nBase == 3)
                {
                    double angle = 180/nSides; //Triange only has 180 degrees
                    //System.out.println(angle);
                }
                else if(nBase >= 3){
                    double angle = 360/nSides;
                    //System.out.println(angle);
                }

                //System.out.println(a);
                System.out.println("The area of the base with " + nBase + " sides and a length of " + nLength + " and a width of " + nWidth + " is " + a);
                if(nBase <=2)
                {
                    System.out.println("Please enter an integer greater than 2");
                }
                else if (nBase == 3)
                {
                    double TriVol = a*nHeight;
                    System.out.println("The volume of the triangluar prism is " + TriVol);
                }
                else if(nBase == 4)
                {
                    double CubeVol = a*nHeight;
                    System.out.println("The volume of the cube or rectangular prism is " + CubeVol);
                }
                else if(nBase >=5)
                {
                    double QuadArea = ((nSides*nSides) * nLength) / (4 * Math.tan(3.14 / 4));
                    double QuadVol = QuadArea*nHeight;
                    System.out.println("The volume of the prism is " + QuadVol);
                }
            }
            else if(prism.equalsIgnoreCase("NO"))
            {
                System.out.println("How many sides will the polygon be?Enter as an INT");
                do{
                    if(nScanInt.hasNextInt())
                    {
                        nSides2 = nScanInt.nextInt();
                        isSidesPGram = true; 
                    }
                    else 
                    {
                        System.out.println("I can not comprehend anything besides an INT here.");
                        isSidesPGram = false;
                        nScanInt.next();
                    }
                }
                while(!(isSidesPGram == true));
                System.out.println("What is the length of each side in a double?");
                do{
                    if(nScanDouble.hasNextDouble()){
                        nLength2 = nScanDouble.nextInt();
                        isLengthPGram = true;
                    }
                    else{
                        System.out.println("I can not comprehend anything besides a DOUBLE here.");
                        isLengthPGram = false;
                        nScanDouble.next();
                    }
                } while(!(isLengthPGram == true));

                System.out.println("The perimeter of a polygon with " + nSides2 + " sides and a length of " + nLength2 + " is " + (nLength2*nSides2));
                if(nSides2 <=2)
                {
                    System.out.println("Please enter an integer greater than 2");
                }
                else if(nSides2 == 3)
                {
                    double angle = 180/nSides2;
                    //System.out.println(angle);
                }
                else if(nSides2 >= 3){
                    double angle = 360/nSides2;
                    //System.out.println(angle);
                }
                double a = (nSides2 * Math.pow(nLength2, 2)) / (4 * Math.tan ((Math.PI) / nSides2));
                //System.out.println(a);
                System.out.println("The area of a polygon with " + nSides + " sides and a length of " + nLength + " is " + a);

            }
            //else if(!PossibleAnswers[0].equalsIgnoreCase(grade ){
            //{
            //If it is not a string
            //System.out.println("I can only comprehend a String answer here.");
            //isSidesPrism = false;
            //nScanString.next();
                        
        }
        }
     
       
     

