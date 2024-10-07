public class hasTeen
{
    public static boolean hasTeen(int a, int b, int c) 
    {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }

    public static void testhasTeen (int a, int b, int c, boolean expected)
    {
        boolean result = hasTeen(a,b,c);
        System.out.println("Input: " + a + " "+ b + " " + c + " " + " Expected: " + expected + " Result: " + result);

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
        testhasTeen(14 , 15 , 10 ,true);
        testhasTeen(16 , 11, 9 ,true);
        testhasTeen(19 , 13, 18 ,true);
    }
}

