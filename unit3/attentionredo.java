public class attentionredo
{
    public static boolean attention(String s)
    {
        if(s.length()<8)
        {
            return false;
        }

        String begin = s.substring(0,8);
            if (begin.equals("Hey you!"))
            {
                return true; 
            }
            else 
            {
                return false;
            }
    }

    public static void testattentionredo(String s, boolean expected) 
    {
        boolean result = attention(s);
        System.out.println("Input: " + s + " Expected: " + expected + " Result: " + result);

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
        testattentionredo("Hello, my name is Julia", false);
        testattentionredo("I love to code!", false);
        testattentionredo("Hey you! Stop there", true);
    }
}