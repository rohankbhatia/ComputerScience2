import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();

        setup();
    }

    private void setup()
    {
        
        for (int i = 0; i<18; i++)
        {
            Bubble bubble = new Bubble( 190-10*i, 20+20 *i);
            addObject(bubble, 450, 300);
        }
        
    }
}
