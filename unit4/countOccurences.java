public class countOccurences
{
    public static int countOccurences(String a, String b)
    {
        int total = 0;

        for (int i=0; i+b.length()<=a.length(); i++)
        {
            String sub = a.substring(i, i+b.length());
            if (sub.equals(b))
                total += 1; 
        }

        return total;
}

public static void testcountOccurences(String a, String b, int expected)
{
    int result = countOccurences(a,b);
    System.out.println("Input: " + a + " " + b + " Expected: " + expected + " Result: " + result);
    
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
        testcountOccurences("Mississippi", "iss", 2);
        testcountOccurences("banananana", "na", 4);
        testcountOccurences("knockknock", "knock", 2);
        testcountOccurences("Gooooogle", "o", 5);
    }
}