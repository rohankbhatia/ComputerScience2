import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String whichImageUp;
    private String whichImageDown;
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String whichImage1, String whichImage2)
    {
        key = keyName;
        sound = soundFile;
        whichImageUp = whichImage1;
        whichImageDown = whichImage2;
        setImage(whichImageUp);
        isDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key))
        {
            play();
            setImage(whichImageDown);
            isDown = true;
        }
        if (isDown && !Greenfoot.isKeyDown(key))
        {
            setImage(whichImageUp);
            isDown = false;
        }
    }
    public void play()
    {
        if (Greenfoot.isKeyDown(key))
        {
            Greenfoot.playSound(sound);
        }
       
    }
}

