import java.awt.*;
import java.applet.*;
/**
 * Write a description of class seventyFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Mathew, Jeffrey, Pratham, and Ben helped me.
public class hunnedFive extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,980,630);
        for(int counter = 0; counter <= 50; counter++)
        {
            g.drawLine(x1,y1,x2,y2);
            x1+= width/50;
            y2-= height/50;
        }
        x1 = width+10;
        y1 = height+10;
        x2 = 10; 
        y2 = height + 10;
        for(int counter = 0; counter <= 50; counter++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1-= width/50;
            y2-= height/50;
        }
        x1 = width + 10;
        y1 = 10;
        x2 = 10;
        y2 = 10;
        for(int counter = 0; counter <= 50; counter++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1-= width/50;
            y2+= height/50;
        }
        x1 = 10;
        y1 = 10;
        x2 = width + 10;
        y2 = 10;
        for(int counter = 0; counter <= 50; counter++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1+= width/50;
            y2+= height/50;
        }
  
        g.drawRect(275,153,445,350);

        x1 = 275;
        y1 = 508;
        x2 = 725;
        y2 = 508;
        for (int counter = 0; counter <37; counter++) {
            g.drawLine(x1,y1,x2,y2);
            x1+=12;
            y2-=10;
        }
        x1 = 275;
        y1 = 508;
        x2 = 725;
        y2 = 508;
        for (int counter = 0; counter <37; counter++) {
            g.drawLine(x1,y1,x2,y2);
            x2-=12;
            y1-=10;
        }
        x1 = 725;
        y1 = 153;
        x2 = 275;
        y2 = 153;
        for (int counter = 0; counter <37; counter++){
            g.drawLine(x1,y1,x2,y2);
            x2+=12;
            y1+=10;
        }
        x1 = 725;
        y1 = 153;
        x2 = 275;
        y2 = 153;
        for (int counter = 0; counter <37; counter++){
            g.drawLine(x1,y1,x2,y2);
            x1-=12;
            y2+=10;

        }
    }
}
            
        


