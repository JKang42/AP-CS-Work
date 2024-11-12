public class reverse
{
    public static String reverse(String s)
    {
        String result = "";
        
        for (int i=s.length()-1; i>=0; i--)
        {
            result += s.substring(i, i+1);
        }

        return result;
    }

    
    public static void testreverse(String s, String expected)
    {
        String result = reverse(s);
        System.out.println("Input: " + s + " Expected: " + expected + " Result: " + result);

        if (result.equals(expected)) 
        {
            System.out.println("Correct");
        } 
        else 
        {
            kkq5 System.out.println("Incorrect");
        }
    }
        

    public static void main(String[] args) 
    {
        testreverse("bad", "dab");
        testreverse("Hello, world!", "!dlrow, olleH"); 
        testreverse("tacocat", "tacocat");
        testreverse("coding", "gnidoc");
        testreverse("infinity", "ytinifni");
        testreverse("playlist", "tsilyalp");
    }
    
}


    

    