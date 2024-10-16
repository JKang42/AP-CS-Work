public class sumOfSquares
{
    public static int sumOfSquares(int n)
    {
        int total = 0;
        
        for (int i=1; i<=n; i++) 
        {
            total += i*i;
        }

        return total;
    }
    

    public static void testsumOfSquares(int n, int expected)
    {
        int result = sumOfSquares(n);
        System.out.println("Input: " + n + " Expected: " + expected + " Result: " + result);

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
        testsumOfSquares(1, 1);
        testsumOfSquares(2, 5);
        testsumOfSquares(3, 14);
        testsumOfSquares(4, 30);
        testsumOfSquares(5, 55);
    }
    
}

