
/**
 * Write a description of class Test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test1
{
    public static void main (String [] args) {
      PollDisplayPanel votingMachine = new PollDisplayPanel ("Tami", "Brian", "Liz");
      votingMachine.vote1(); 
      votingMachine.vote2(); 
      votingMachine.vote2();
    }
}
