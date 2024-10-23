public class Person
{
    public Person(String nameIn, int petCountIn)
    {
        name = nameIn;
        petCount = petCountIn;
    }

    public void greeting()
    {
        System.out.println("Hello, my name is " + name);
        System.out.println("and I have this many pets: " + petCount);
    }

    public void setName(String newName)
    {
        name = newName;  
    }

    public String getName()
    {
        return name;
    }

    private String name;
    private int petCount;

   
}

    