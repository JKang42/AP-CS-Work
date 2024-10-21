public class factorial 
{
    public static int factorial (int n)
    {
        int result = 1;
        
        for (int i=1; i<=n; i++)
            result *= i;
        
        return result;
    }

    public static void testfactorial(int n, int expected)
    {
        int result = factorial(n);
        System.out.println("Input: " + result + " Expected: " + expected + " Result: " + result);

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
        testfactorial(1, 1);
        testfactorial(3, 6);
        testfactorial(5, 120);
        testfactorial(4, 24);
        testfactorial(8, 40320);
    }
    
}

