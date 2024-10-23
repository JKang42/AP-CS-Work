public class TestPerson
{
    public static void main(String[] args)
    {
        System.out.println("Hello, Person!");


        Person drkessner = new Person("Dr. Kessner", 3);
      
        drkessner.greeting();

        System.out.println("That guy's name is " + drkessner.getName());


        Person luna = new Person("Luna", 5);
        luna.greeting();
    }
}
