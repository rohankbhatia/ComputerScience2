import java.util.Scanner;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String[]args)
    {
        boolean isTorC; //Booleans to type validate string inputs
        boolean isfloor;
        boolean isExitorShop;
        boolean isJumporHelicopter;
        boolean isCaforGym;
        boolean isRiskorSteal;
        Scanner scInt = new Scanner(System.in); //Creation of scanners
        Scanner scDouble = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("You are in school on a Saturday all alone. Would you like to go to Tillinghast or the Cafeteria?");
        String TorC = scString.nextLine();

        
        if (TorC.equalsIgnoreCase("Tillinghast") || TorC.equalsIgnoreCase("Cafeteria"))
        {
            isTorC = true;
        }
        else
        {
            isTorC = false;
        }
        if(TorC.equalsIgnoreCase("Tillinghast"))
        {
            System.out.println("In Tillinghast you can go to the basement or third floor. Enter Basement or 3 for Third Floor.");
            String floor = scString.nextLine();
            if (floor.equalsIgnoreCase("Basement") || floor.equalsIgnoreCase("3")) //If it is these string variables then:
                {
                    isfloor = true; // let the boolean = true
                }
                else
                {
                    isfloor = false; //let the boolean = false
                }
            if(floor.equalsIgnoreCase("Basement"))
            {
                
                System.out.println("You are in the Basement, the door to the shop is unlocked. But, the secret exit from the school in the basement is locked. Do you try to unlock the exit, or enter the shop? Enter Exit or Shop.");
                String ExitorShop = scString.nextLine();
                if(ExitorShop.equalsIgnoreCase("Shop"))
                {
                    System.out.println("You enter the shop and fall into a secret room where you discover 80 billion dollars and escape as the richest person in the world.");
                }
                else if(ExitorShop.equalsIgnoreCase("Exit"))
                {
                    System.out.println("You attempt to exit but a asteroid flies down and splits your body in half.");
                }
                if (ExitorShop.equalsIgnoreCase("Exit") || floor.equalsIgnoreCase("Shop"))
                {
                    isExitorShop = true;
                }
                else
                {
                    isExitorShop = false;
                }
            }
            else if(floor.equalsIgnoreCase("3"))
            {
                System.out.println("You are on the third floor, you find a parachute. Do you jump to leave the school, or call ur personal helicopter? ENter Jump or Helicopter.");
                String JumporHelicopter = scString.nextLine();
                if (JumporHelicopter.equalsIgnoreCase("JUMP") || floor.equalsIgnoreCase("HELICOPTER"))
                {
                    isJumporHelicopter = true;
                }
                else
                {
                    isJumporHelicopter = false;
                }
                
                if(JumporHelicopter.equalsIgnoreCase("JUMP"))
                {
                    System.out.println("You jump, then a drift breeze glides you back to your house where you go to sleep.");
                }
                else if(JumporHelicopter.equalsIgnoreCase("Helicopter"))
                {
                    System.out.println("You call a helicopter, but as you get in, God shoots an RPG at you and you die.");
                }
                else if(isJumporHelicopter == false)
                {
                    System.out.println("I can only comprehend the two answers I mentioned in my question. Restart the program");
                }
                
            }
            else if(isfloor == false)
            {
                System.out.println("I can only comprehend the two answers I mentioned in my question. Restart the program");
            }
        }
        else if(TorC.equalsIgnoreCase("Cafeteria"))
        {
            System.out.println("In the Caf, you can go into the Dining commons, or make a run for the Gym. Enter Gym or Dining.");
            String CaforGym = scString.nextLine();
            if (CaforGym.equalsIgnoreCase("DINING") || CaforGym.equalsIgnoreCase("GYM"))
                {
                    isCaforGym = true;
                }
                else
                {
                    isCaforGym = false;
                }
            if(CaforGym.equalsIgnoreCase("Gym"))
            {
                
                System.out.println("You are in the GYM, you can hide in the locker room, or jump through the construction and get home. Do you try to jump, or hide? Enter Jump or Hide.");
                String ExitorShop = scString.nextLine();
                if(ExitorShop.equalsIgnoreCase("JUMP"))
                {
                    System.out.println("Your jump failed. You slipped and fell 300 feet. Your head was smashed open and now the animals feed off of your corpse.");
                }
                else if(ExitorShop.equalsIgnoreCase("HIDE"))
                {
                    System.out.println("You hide for an hour, but then you get locked in. You start to eat clothes. When you try to open the door, it blows up. You Die.");
                }
            }
            else if(CaforGym.equalsIgnoreCase("Dining"))
            {
                System.out.println("You are in the CDC, you can break the glass and take a risk by jumping, or try to grab some food. Do you tke the risk, or steal? Enter Risk or Steal.");
                String RiskorSteal = scString.nextLine();
                if (RiskorSteal.equalsIgnoreCase("RISK") || RiskorSteal.equalsIgnoreCase("SEAL"))
                {
                    isRiskorSteal = true;
                }
                else
                {
                    isRiskorSteal = false;
                }
                if(RiskorSteal.equalsIgnoreCase("Risk"))
                {
                    System.out.println("You take the risk. As you break the window and jump, a plane comes under you and flies you to the bahamas where you live a stress free life with many smoothies.");
                }
                else if(RiskorSteal.equalsIgnoreCase("Steal"))
                {
                    System.out.println("As you try to steal the food, the guy form the walking dead jumps out at you and beats your head in. You are dead.");
                }else if(isRiskorSteal)
                {
                    System.out.println("I can only comprehend the two answers I mentioned in my question. Restart the program");
                }
                
            }else if(isCaforGym == false)
            {
                System.out.println("I can only comprehend the two answers I mentioned in my question. Restart the program");
            }

        } else if(isTorC == false)
        {
            System.out.println("I can only comprehend the two answers I mentioned in my question. Restart the program");
        }

    }

}