import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[] whitekeys =
    {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "/"};
    private String[] whitenotes =
    {"2c", "2d","2e", "2f", "2g", "2a", "2b", "3c", "3d", "3e", "3f", "3g"};
    private String[] blackkeys =
    {"w", "e", "", "t", "y", "u", "", "o", "p", "", "]"};
    private String [] blacknotes =
    {"2c#", "2d#", "","2f#", "2g#", "2a#", "", "3c#", "3d#", "","3f#"};

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }

    /**
     * Make new keys in this world
     */
    public void makeKeys()
  
    {
        //addObject(new Key("g", "3a.wav"), 403, 140);
        //addObject(new Key("f", "3g.wav"), 768, 140);
        //executes 11 times and the value of i is 0
        int i = 0;
        while ( i < whitekeys.length)
        {
            Key key = new Key(whitekeys[i], whitenotes[i] + ".wav", "white-key.png","white-key-down.png");
            addObject(key, i*63 +54, 140);
            i = i + 1;
        } 
        int x = 0;
        while ( x < blackkeys.length)
        {
            if(blackkeys[x] != "")
            {
                Key key = new Key(blackkeys[x], blacknotes[x] + ".wav", "black-key.png", "black-key-down.png");
                addObject(key, (x*63) + 85, 84);
              
            }
              x = x + 1;
      
        }
    }
}