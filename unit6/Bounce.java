//
// Bounce.java
//


import processing.core.*;
import java.util.*;   // for ArrayList


public class Bounce extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        balls = new ArrayList<Rectangle>();
        balls.add(new Rectangle(this));
    }

    public void draw()
    {
        background(0);
        for (Rectangle b : balls)
            b.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<100; i++)
            balls.add(new Rectangle(this));        
    }

    private ArrayList<Rectangle> balls;

    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}

