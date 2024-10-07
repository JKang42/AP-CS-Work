public class nearHundred 
{
    public static boolean nearHundred(int n) 
    {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10); //math.abs is absolute value
    }

    public static void testnearHundred(int n, boolean expected) 
    {
        boolean result = nearHundred(n);
        System.out.println("Number: " + n + " Expected: " + expected + " Result: " + result);

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
        testnearHundred(195, true);
        testnearHundred(80, false);
        testnearHundred(90,true);
    }
}