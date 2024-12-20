import java.util.*;

public class fibonacci
{
    public static ArrayList<Integer> fibonacci(int n)
    {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        
        int a = 0;
        int b = 1; 
        
        for (int i=1;i < n; i++)
        {
            if(i == 1)
            {
                result.add(b);
            }
            int c = a + b;
            result.add(c);
            a=b;
            b=c;    
        }
        
        return result; 
    }

public static void testfibonacci(int n, ArrayList<Integer> ExpectedValue)
{
    ArrayList<Integer> result = fibonacci(n);
    
    System.out.print("Input: ");
    System.out.println(n);

    System.out.println(" " + " Expected: " + ExpectedValue + " Result: " + result);

        if (result.equals(ExpectedValue))
        {
            System.out.println("Correct");
        } 
        else 
        {
            System.out.println("Incorrect");
        }
}

public static void main(String[]args)
{
    
    int n1 = 2;
    int n2 = 3;
    int n3 = 4;
    int n4 = 5;
    
    ArrayList<Integer> ExpectedValues1 =  new ArrayList<Integer> ();
    ExpectedValues1.add(1);
    ExpectedValues1.add(1);
    
    ArrayList<Integer> ExpectedValues2 =  new ArrayList<Integer> ();
    ExpectedValues2.add(1);
    ExpectedValues2.add(1);
    ExpectedValues2.add(2);
    
    ArrayList<Integer> ExpectedValues3 =  new ArrayList<Integer> ();
    ExpectedValues3.add(1);
    ExpectedValues3.add(1);
    ExpectedValues3.add(2);
    ExpectedValues3.add(3);
    
    ArrayList<Integer> ExpectedValues4 =  new ArrayList<Integer> ();
    ExpectedValues4.add(1);
    ExpectedValues4.add(1);
    ExpectedValues4.add(2);
    ExpectedValues4.add(3);
    ExpectedValues4.add(5);
    
    testfibonacci(n1,ExpectedValues1);
    testfibonacci(n2,ExpectedValues2);
    testfibonacci(n3,ExpectedValues3);
    testfibonacci(n4,ExpectedValues4);
}
}