import java.util.*;

public class countlucky
{
    public static int countlucky(ArrayList<Integer>numbers)
    {
                
        int count = 0;

        for (int i=0; i<numbers.size(); i++)
        {
            if (numbers.get(i)%7 == 0 || numbers.get(i)%10 == 7)
                count++;
        }
        
        return count;
    }

    public static void testcountlucky(ArrayList<Integer>numbers, int ExpectedCount)
    {
        int count = countlucky(numbers);
        
        System.out.print("Input: ");
        for (int i =0; i<numbers.size(); i++)
        {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println(" " + " Expected: " + ExpectedCount + " Result: " + count);

        if (count == ExpectedCount) 
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
            ArrayList<Integer> values = new ArrayList<Integer>();
            values.add(1);
            values.add(2);
            values.add(3);
        
            ArrayList<Integer> values2 = new ArrayList<Integer>();
            values2.add(7);
            values2.add(13);
            values2.add(17);
        
            ArrayList<Integer> values3 = new ArrayList<Integer>();
            
            values3.add(107);
            values3.add(207);
        
            ArrayList<Integer> values4 = new ArrayList<Integer>();
            
            values4.add(307);
            values4.add(7);
            values4.add(13);
        
            ArrayList<Integer> values5 = new ArrayList<Integer>();
            
            values5.add(14);
            values5.add(7);
            values5.add(49);
            
            testcountlucky(values, 0);
            testcountlucky(values2, 2);
            testcountlucky(values3, 2);
            testcountlucky(values4, 2);
            testcountlucky(values5, 3);
    }
}