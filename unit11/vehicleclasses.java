public class Car implements Vehicle
{

    public String name()
    {
        return "Car";
    }

    public int wheelCount()
    {
        return 4;
    }

    public boolean isHumanPowered()
    {
        return false;
    }
}

public class Motorcycle implements Vehicle 
{
    public String name() 
    {
        return "Motorcycle";
    }

    public int wheelCount() 
    {
        return 2;
    }

    public boolean isHumanPowered() 
    {
        return false;
    }
}

public class Bicycle implements Vehicle
{
    public String name()
    {
        return "Bicycle";
    }

    public int wheelCount() 
    {
        return 2;
    }

    public boolean isHumanPowered()
    {
        return true;
    }
}

public class Unicycle implements Vehicle
{

    public String name() 
    {
        return "Unicycle";
    }

    public int wheelCount() 
    {
        return 1;
    }

    public boolean isHumanPowered()
    {
        return true;
    }
}
