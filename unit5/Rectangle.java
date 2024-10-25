public class Rectangle
{
    private int x;
    private int y;
    
    public Rectangle(int xIn, int yIn)
    {
        x=xIn;
        y=yIn;
    }

    public int perimeter()
    {
        return x + x + y + y;
    }

    public int area()
    {
        return x*y;
    }
}

