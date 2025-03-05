public class Shape
{
    private String name; 
    private int sides; 
    
    public Shape(String name, int sides)
    {
        this.name = name;
        this.sides = sides;
    }
    
    public String getname()
    {
        return this.name; 
    }
    
    public int getsides() 
    {
        return this.sides;
    }
    
    public void setname(String x) 
    {
        this.name = x; 
    }
    
    public void setsides(int y)
    {
        this.sides = y; 
    }
    
    
}