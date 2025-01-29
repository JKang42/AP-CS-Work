import java.util.*;

public class filterGoodScores
{
    public static ArrayList<Integer> filterGoodScores (ArrayList<Integer> values)
    {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        
        for (int i = 0; i<values.size(); i++)
        {
            if (values.get(i) > 90)
                result.add(values.get(i));
        }
    
        return result; 
    }

public static void testfilterGoodScores(ArrayList<Integer>values, ArrayList<Integer> ExpectedValue)
{
    ArrayList<Integer> result = filterGoodScores (values);
    
    System.out.print("Input: ");
         for (int i =0; i<values.size(); i++)
        {
            System.out.print(values.get(i)+" ");
        }
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
    
    ArrayList<Integer> values = new ArrayList<Integer>();
    values.add(51);
    values.add(52);
    values.add(53);
    values.add(100);
    
    ArrayList<Integer> values2 = new ArrayList<Integer>();
    values2.add(92);
    values2.add(89);
    values2.add(90);
    values2.add(99);
    
    ArrayList<Integer> values3 = new ArrayList<Integer>();
    values3.add(40);
    values3.add(50);
    values3.add(97);
    values3.add(98);
    
    ArrayList<Integer> values4 = new ArrayList<Integer>();
    values4.add(50);
    values4.add(104);
    values4.add(101);
    values4.add(102);
    
    ArrayList<Integer> ExpectedValues =  new ArrayList<Integer> ();
    ExpectedValues.add(100);
    
    ArrayList<Integer> ExpectedValues2 =  new ArrayList<Integer> ();
    ExpectedValues2.add(92);
    ExpectedValues2.add(99);
    
    ArrayList<Integer> ExpectedValues3 =  new ArrayList<Integer> ();
    ExpectedValues3.add(97);
    ExpectedValues3.add(98);
    
    ArrayList<Integer> ExpectedValues4 =  new ArrayList<Integer> ();
    ExpectedValues4.add(104);
    ExpectedValues4.add(101);
    ExpectedValues.add(102);
    
    testfilterGoodScores(values,ExpectedValues);
    testfilterGoodScores(values2,ExpectedValues2);
    testfilterGoodScores(values3,ExpectedValues3);
    testfilterGoodScores(values4,ExpectedValues4);
  

}
}


