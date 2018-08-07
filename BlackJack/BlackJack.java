import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class BlackJack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackJack
{
    public static void main(String[]Args){
        Random gen = new Random();
        Scanner cardDraw = new Scanner(System.in);
        System.out.println("Welcome to Mister E. Mann's Blackjack Program");
        int x = gen.nextInt(12) ;
        int y = gen.nextInt(12) ;
        int z = gen.nextInt(12) ;
        int e = gen.nextInt(12) ;

        int counter = 0;
        if(x == 11 || x ==1)
        {
            System.out.println ("You have an ace Ace which is worth " + x);
        }
        if (x == 10){
            System.out.println ("A jack, king, or queen which are all each worth 10");
        }
        System.out.println("Your to numbers are " + x + " and " + y );
        System.out.println("Your total is :" + (x + y));

        if(x + y < 21)
        {
            System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
            String round1 = cardDraw.nextLine();
            if(round1.equalsIgnoreCase("HIT")){
                System.out.println("You have chosen to hit");
                int H1 = gen.nextInt(12);
                System.out.println("The dealer has pulled a " + H1);
                System.out.println("Your total is " + (x + y + H1));

                if(x + y + H1 < 21)
                {
                    System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                    String round2 = cardDraw.nextLine();
                    if(round2.equalsIgnoreCase("HIT")){
                        System.out.println("You have chosen to hit");
                        int H2 = gen.nextInt(12);
                        System.out.println("The dealer has pulled a " + H2);
                        System.out.println("Your total is " + (x + y + H2 + H1));

                        if(x + y + H2 + H1 < 21)
                        {
                            System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                            String round3 = cardDraw.nextLine();
                            if(round3.equalsIgnoreCase("HIT")){
                                System.out.println("You have chosen to hit");
                                int H3 = gen.nextInt(12);
                                System.out.println("The dealer has pulled a " + H3);
                                System.out.println("Your total is " + (x + y + H2 + H1 + H3));
                                if (x + y + H2 + H1 + H3 < 21)
                                {
                                    System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                                    String round4 = cardDraw.nextLine();
                                    if(round4.equalsIgnoreCase("HIT")){
                                        System.out.println("You have chosen to hit");
                                        int H4 = gen.nextInt(12);
                                        System.out.println("The dealer has pulled a " + H4);
                                        System.out.println("Your total is " + (x + y + H2 + H1 + H3 + H4));
                                        if (x + y + H2 + H1 + H3 + H4 < 21)
                                        {
                                            System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                                            String round5 = cardDraw.nextLine();
                                            if(round5.equalsIgnoreCase("HIT"))
                                            {
                                                System.out.println("You have chosen to hit");
                                                int H5 = gen.nextInt(12);
                                                System.out.println("The dealer has pulled a " + H5);
                                                System.out.println("Your total is " + (x + y + H2 + H1 + H3 + H4 + H5));
                                                if (x + y + H2 + H1 + H3 + H4 + H5 < 21)
                                                {
                                                    System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                                                    String round6 = cardDraw.nextLine();
                                                    if(round6.equalsIgnoreCase("HIT"))
                                                    {
                                                        System.out.println("You have chosen to hit");
                                                        int H6 = gen.nextInt(12);
                                                        System.out.println("The dealer has pulled a " + H6);
                                                        System.out.println("Your total is " + (x + y + H2 + H1 + H3 + H4 + H5 + H6));
                                                        if(x + y + H2 + H1 + H3 + H4 + H5 + H6 < 21)
                                                        {
                                                            System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                                                            String round7 = cardDraw.nextLine();
                                                            if(round7.equalsIgnoreCase("HIT")){
                                                                System.out.println("You have chosen to hit");
                                                                int H7 = gen.nextInt(12);
                                                                System.out.println("The dealer has pulled a " + H7);
                                                                System.out.println("Your total is " + (x + y + H2 + H1 + H3 + H4 + H5 + H6 + H7));
                                                                if((x + y + H2 + H1 + H3 + H4 + H5 + H6 + H7 < 21))
                                                                {
                                                                    System.out.println("Enter HIT if you would like to hit, or STAY if you would like to stay");
                                                                    String round8 = cardDraw.nextLine();
                                                                    if(round8.equalsIgnoreCase("HIT")){
                                                                        System.out.println("You have chosen to hit");
                                                                        int H8 = gen.nextInt(12);
                                                                        System.out.println("The dealer has pulled a " + H8);
                                                                        System.out.println("Your total is " + (x + y + H2 + H1 + H3 + H4 + H5 + H6 + H7 + H8));
                                                                    }
                                                                    else if(x + y + H2 + H1 + H3 + H4 + H5 + H6 + H7 == 21)
                                                                    {
                                                                        System.out.println("Congratualtions, you have won Blackjack");
                                                                        System.exit(1);
                                                                    }
                                                                    else if(x + y + H2 + H1 + H3 + H4 + H5 + H6 + H7 > 21)
                                                                    {
                                                                        System.out.println("busts, try again!");
                                                                        System.exit(1);
                                                                    }

                                                                }
                                                            }
                                                            else if (x + y + H2 + H1 + H3 + H4 + H5 + H6 == 21)
                                                            {
                                                                System.out.println("Congratualtions, you have won Blackjack");
                                                                System.exit(1);
                                                            }
                                                            else if (x + y + H2 + H1 + H3 + H4 + H5 + H6 == 21)
                                                            {
                                                                System.out.println("busts, try again!");
                                                                System.exit(1);
                                                            }

                                                        }
                                                    }
                                                    else if(x + y + H2 + H1 + H3 + H4 + H5 == 21)
                                                    {
                                                        System.out.println("Congratualtions, you have won Blackjack");
                                                        System.exit(1);
                                                    }
                                                    else if(x + y + H2 + H1 + H3 + H4 + H5 > 21)
                                                    {
                                                        System.out.println("busts, try again!");
                                                        System.exit(1);
                                                    }

                                                }
                                                else if(round5.equalsIgnoreCase("STAY"))
                                                {

                                                }
                                            }
                                            else if (x + y + H2 + H1 + H3 + H4 == 21){
                                                System.out.println("Congratualtions, you have won Blackjack");
                                                System.exit(1);
                                            }
                                            else if(x + y + H2 + H1 + H3 + H4 > 21)
                                            {
                                            }
                                            else if (round4.equalsIgnoreCase("STAY"))
                                            {
                                                System.out.println("busts, try again!");
                                                System.exit(1);
                                            }
                                        }
                                        else if(x + y + H2 + H1 + H3 == 21){
                                            System.out.println("Congratualtions, you have won Blackjack");
                                            System.exit(1);
                                        }
                                        else if (x + y + H2 + H1 + H3 > 21) {
                                            System.out.println("busts, try again!");
                                            System.exit(1);

                                        }

                                    }
                                    else if(round3.equalsIgnoreCase("STAY"))
                                    {
                                        System.out.println("You have chosen to stay, so it is the dealers turn");
                                        int S1 = gen.nextInt(12);
                                        System.out.println("The dealer has pulled a " + S1);
                                        System.out.println("The dealer's total is " + (z + S1));

                                        if((z + S1) < 21)
                                        {
                                            if((z+S1) <=16)
                                            {
                                                System.out.println("The dealer has chosen to hit");
                                                int S2 = gen.nextInt(2);
                                                System.out.println("The dealer has pulled a: " + S2);
                                                System.out.println("The Dealer's total is : " + (S1 + z + S2));
                                            }
                                            else if((z+S1) >= 16){
                                                System.out.println("The dealer has chosen to stay, Gmae Over.");
                                                System.out.println("The Dealer's total was : " + (S1 + z));

                                            }

                                            else if ((z + S1) == 21)
                                            {
                                                System.out.println("Sorry, the dealer has won!");
                                                System.exit(1);
                                            }
                                            else if ((z + S1) > 21) 
                                            {
                                                System.out.println("The dealer busts, Game Over");

                                            }
                                        }
                                    }
                                }

                                else if (x + y == 21)
                                {
                                    System.out.println("Congratualtions, you have won Blackjack");
                                    System.exit(1);
                                }
                                else if(x + y > 21)
                                {
                                    System.out.println("busts, try again!");
                                    System.exit(1);
                                }

                            }
                            else if(round1.equalsIgnoreCase("STAY")){
                                System.out.println("You have chosen to stay, so it is the dealers turn");
                                int S1 = gen.nextInt(12);
                                System.out.println("The dealer has pulled a " + S1 + " and a " + z);
                                System.out.println("The dealer's total is " + (z + S1));
                                if((z + S1) < 21)
                                {
                                    if((z+S1) <=16)
                                    {
                                        System.out.println("The dealer has chosen to hit");
                                        int S2 = gen.nextInt(2);
                                        System.out.println("The dealer has pulled a: " + S2);
                                        System.out.println("The Dealer's total is : " + (S1 + z + S2));
                                    }
                                    else if((z+S1) >= 16){
                                        System.out.println("The dealer has chosen to stay, Game over.");
                                        System.out.println("The Dealer's total was : " + (S1 + z));

                                    }

                                    else if ((z + S1) == 21)
                                    {
                                        System.out.println("Sorry, the dealer has won!");
                                        System.exit(1);
                                    }
                                    else if ((z + S1) > 21) 
                                    {
                                        System.out.println("The dealer busts, Game over");

                                    }
                                }

                            }
                            else if (x + y + H1 + H2 == 21)
                            {
                                System.out.println("Congradulations, you have won Blackjack");
                                System.exit(1);
                            }
                            else if (x + y + H2 + H1 > 21) 
                            {
                                System.out.println("busts, try again!");
                                System.exit(1);

                            }

                            else if(round1.equalsIgnoreCase("STAY")){
                                System.out.println("You have chosen to stay, so it is the dealers turn");
                                int S1 = gen.nextInt(12);
                                System.out.println("The dealer has pulled a " + S1);
                                System.out.println("The dealer's total is " + (z + S1));

                                if((z + S1) < 21)
                                {
                                    if((z+S1) <=16)
                                    {
                                        System.out.println("The dealer has chosen to hit");
                                        int S2 = gen.nextInt(2);
                                        System.out.println("The dealer has pulled a: " + S2);
                                        System.out.println("The Dealer's total is : " + (S1 + z + S2));
                                    }
                                    else if((z+S1) >= 16){
                                        System.out.println("The dealer has chosen to stay, your turn.");
                                        System.out.println("The Dealer's total was : " + (S1 + z));

                                    }

                                    else if ((z + S1) == 21)
                                    {
                                        System.out.println("Sorry, the dealer has won!");
                                        System.exit(1);
                                    }
                                    else if ((z + S1) > 21) 
                                    {
                                        System.out.println("The dealer busts, Game over");

                                    }
                                }
                            }

                            else if (x + y == 21)
                            {
                                System.out.println("Congratualtions, you have won Blackjack");
                                System.exit(1);
                            }
                            else if(x + y > 21)
                            {
                                System.out.println("busts, try again!");
                                System.exit(1);
                            }

                        }
                        else if(round1.equalsIgnoreCase("STAY")){
                            System.out.println("You have chosen to stay, so it is the dealers turn");
                            int S1 = gen.nextInt(12);
                            System.out.println("The dealer has pulled a " + S1 + " and a " + z);
                            System.out.println("The dealer's total is " + (z + S1));
                            if((z + S1) < 21)
                            {
                                if((z+S1) <=16)
                                {
                                    System.out.println("The dealer has chosen to hit");
                                    int S2 = gen.nextInt(2);
                                    System.out.println("The dealer has pulled a: " + S2);
                                    System.out.println("The Dealer's total is : " + (S1 + z + S2));
                                }
                                else if((z+S1) >= 16){
                                    System.out.println("The dealer has chosen to stay, Game over.");
                                    System.out.println("The Dealer's total was : " + (S1 + z));

                                }

                                else if ((z + S1) == 21)
                                {
                                    System.out.println("Sorry, the dealer has won!");
                                    System.exit(1);
                                }
                                else if ((z + S1) > 21) 
                                {
                                    System.out.println("The dealer busts, Game over");

                                }
                            }

                        }

                    }
                    else if (x + y + H1 == 21)
                    {
                        System.out.println("Congradulations, you have won Blackjack");
                        System.exit(1);
                    }
                    else if (x + y + H1 > 21) 
                    {
                        System.out.println("busts, try again!");
                        System.exit(1);

                    }

                    else if(round1.equalsIgnoreCase("STAY")){
                        System.out.println("You have chosen to stay, so it is the dealers turn");
                        int S1 = gen.nextInt(12);
                        System.out.println("The dealer has pulled a " + S1);
                        System.out.println("The dealer's total is " + (z + S1));

                        if((z + S1) < 21)
                        {
                            if((z+S1) <=16)
                            {
                                System.out.println("The dealer has chosen to hit");
                                int S2 = gen.nextInt(2);
                                System.out.println("The dealer has pulled a: " + S2);
                                System.out.println("The Dealer's total is : " + (S1 + z + S2));
                            }
                            else if((z+S1) >= 16){
                                System.out.println("The dealer has chosen to stay, your turn.");
                                System.out.println("The Dealer's total was : " + (S1 + z));

                            }

                            else if ((z + S1) == 21)
                            {
                                System.out.println("Sorry, the dealer has won!");
                                System.exit(1);
                            }
                            else if ((z + S1) > 21) 
                            {
                                System.out.println("The dealer busts, your turn");

                            }
                        }
                    }
                }

                else if (x + y == 21)
                {
                    System.out.println("Congratualtions, you have won Blackjack");
                    System.exit(1);
                }
                else if(x + y > 21)
                {
                    System.out.println("busts, try again!");
                    System.exit(1);
                }

                else if(round1.equalsIgnoreCase("STAY")){
                    System.out.println("You have chosen to stay, so it is the dealers turn");
                    int S1 = gen.nextInt(12);
                    System.out.println("The dealer has pulled a " + S1 + " and a " + z);
                    System.out.println("The dealer's total is " + (z + S1));
                    if((z + S1) < 21)
                    {
                        if((z+S1) <=16)
                        {
                            System.out.println("The dealer has chosen to hit");
                            int S2 = gen.nextInt(2);
                            System.out.println("The dealer has pulled a: " + S2);
                            System.out.println("The Dealer's total is : " + (S1 + z + S2));
                        }
                        else if((z+S1) >= 16){
                            System.out.println("The dealer has chosen to stay, Game over.");
                            System.out.println("The Dealer's total was : " + (S1 + z));

                        }

                        else if ((z + S1) == 21)
                        {
                            System.out.println("Sorry, the dealer has won!");
                            System.exit(1);
                        }
                        else if ((z + S1) > 21) 
                        {
                            System.out.println("The dealer busts, Game over");

                        }
                    }

                }

                else if (x + y  == 21)
                {
                    System.out.println("Congradulations, you have won Blackjack");
                    System.exit(1);
                }
                else if (x + y  > 21) 
                {
                    System.out.println("busts, try again!");
                    System.exit(1);

                }

            }

        }
    }
    }
