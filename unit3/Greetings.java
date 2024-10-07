public class Greetings 
{

    public static String greetings(String name) 
    {
        return "Hello, " + name + ", how are you?";
    }

    public static void testGreetings(String name, String expected) {
        String result = greetings(name);
        System.out.println("Input: " + name + " Expected: " + expected + " Result: " + result);

        if (result.equals(expected)) // result.equals is used for strings instead of ==
        {
            System.out.println("Correct");
        }
        else 
        {
            System.out.println("Incorrect");
        }
    }

    public static void main(String[] args) 
    {
        testGreetings("Julia", "Hello, Julia, how are you?");
        testGreetings("Kathy", "Hello, Kathy, how are you?");
        testGreetings("Jason", "Hello, Jason, how are you?");
    }
}