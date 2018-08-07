import java.awt.Image; 
import java.awt.Graphics;
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//I worked with Pratham, Christian, Matthew, and Ms. Screen
//described everything in comment to show you I know what the code means.
public class Coin
{ 
    private Image Heads;
    private Image Tails;
    //2 fields
    private boolean isHeads;
    //Boolean because i want a true or false response returned.
    /**
     * Constructor for objects of class Coin
     */
    public Coin(Image h, Image t)
    {
        Heads = h;
        Tails = t;
        isHeads = true;
    }

    public void flip() 
    {
        isHeads =!isHeads;
        //this is basically saying that it should change isHeads to not isHeads, effictively flipping the coin to tails.
    }
        
    public void draw(Graphics g, int x, int y)
    {
        if (isHeads == true)
        {
            int h = Heads.getHeight(null);
            int w = Heads.getWidth(null);
            //storing the height and width of the images into variable so I can use those in my g.drawImage to calculate the x and y coordinates.
            g.drawImage (Heads, x-w/2, y-h/2, null);
            //drawing the image selected with the x coordinate, and y coordinate. 
        }
        else
        {
            int h = Tails.getHeight(null);
            int w = Tails.getWidth(null);
            //storing the height and width of the images into variable so I can use those in my g.drawImage to calculate the x and y coordinates.
            g.drawImage (Tails, x-w/2, y-h/2, null);
            //drawing the image selected with the x coordinate, and y coordinate.
        }
        
    }
    
    
}
