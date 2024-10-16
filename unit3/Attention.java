public class Attention 
{
    public static boolean attention(String prefix) 
    {
        return prefix.startsWith("Hey you!"); 
    }

    public static void testAttention(String prefix, boolean expected) 
    {
        boolean result = attention(prefix)
        System.out.println("Input: " + prefix + " Expected: " + expected + " Result: " + result);

        if (result == expected) 
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
        testAttention("Hello, my name is Julia", false);
        testAttention("I love to code!", false);
        testAttention("Hey you! Stop there", true);
    }
}