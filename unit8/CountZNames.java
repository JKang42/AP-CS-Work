import java.util.*;

public class CountZNames
{
    public static int CountZNames(ArrayList<String> words)
    {
                
        int count = 0;

        for (int i=0; i<words.size(); i++)
        {
            String w = words.get(i);
            if ((w.substring(0,1).equals("Z")) || (w.substring(0,1).equals("z"))){
                count+=w.length();
            }
        }
        
        return count;
    }

    public static void testCountZNames(ArrayList<String> words, int ExpectedCount)
    {
        int count = CountZNames(words);
        
        System.out.print("Input: ");
        for (int i =0; i<words.size(); i++)
        {
            System.out.print(words.get(i)+" ");
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
        
            ArrayList<String> values = new ArrayList<String>();
            values.add("Dr.Kessner");
            values.add("Dr.Sands");
        
            ArrayList<String> values2 = new ArrayList<String>();
            values2.add("Zarro");
            values2.add("zero");
            values2.add("zippy");
        
            ArrayList<String> values3 = new ArrayList<String>();
            values3.add("Zoo");
        
            ArrayList<String> values4 = new ArrayList<String>();
            values4.add("Hello");
            values4.add("World");
        
            ArrayList<String> values5 = new ArrayList<String>();
            values5.add("Zoology");
            values5.add("Zebra");
        
            testCountZNames(values, 0);
            testCountZNames(values2, 14);
            testCountZNames(values3, 3);
            testCountZNames(values4, 0);
            testCountZNames(values5, 12);
    }
}