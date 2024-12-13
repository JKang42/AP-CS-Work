//
// Ball.java
//


import processing.core.*;


public class Rectangle
{
    public Rectangle(PApplet p)
    {
        this.p = p;
        position = new PVector(150, 150);
        velocity = new PVector(p.random(-2, 3), p.random(-2, 3));
        radius = p.random(3, 26);
        c = p.color(p.random(143), p.random(143), p.random(143));
    }

    public void display()
    {
        p.fill(c);
        p.triangle(position.x-20, position.y, position.x+20, position.y, position.x, position.y-30);

        position.add(velocity);

        if (position.x < radius || position.x > p.width-radius)
            velocity.x *= -1;

        if (position.y < radius || position.y > p.height-radius)
            velocity.y *= -1;
    }

    private PApplet p; // reference to main PApplet
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c; // color
}



