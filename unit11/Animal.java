public class Animal
{
    private String name; 
    private int legCount; 
    private boolean furry; 
    
    public Animal (String name, int legCount, boolean furry) 
    {
        this.name = name; 
        this.legCount = legCount; 
        this.furry = furry; 
    }
    
    public String getName() 
    {
        return name; 
    }
    
    public int getLegCount()
    {
        return legCount;
    }
    
    public boolean isFurry()
    {
        return furry; 
    }
}

