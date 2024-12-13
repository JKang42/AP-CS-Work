import java.util.*;

public class maximumvalue
{
    public static double maximumvalue(ArrayList<Double>values)
    {
        for (int i =0; i<values.size(); i++)
        {
            System.out.print(values.get(i)+" ");
        }
        if (values == null || values.size() == 0)
        {
            return Double.NaN;
        }
        
        double result = values.get(0);
        
        for (double value: values)
        {
            if (value > result)
                result = value;
        }

        return result; 
    }
    

public static void testmaximumvalue(ArrayList<Double>values, double ExpectedValue)
{
    double result = maximumvalue(values);
    
    System.out.print("Input: ");
        for (int i =0; i<values.size(); i++)
        {
            System.out.print(values.get(i)+" ");
        }
        System.out.println(" " + " Expected: " + ExpectedValue + " Result: " + result);

        if (result == ExpectedValue) 
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
    
    ArrayList<Double> values = new ArrayList<Double>();
    values.add(1.0);
    values.add(2.1);
    values.add(5.3);
    
    ArrayList<Double> values2 = new ArrayList<Double>();
    values2.add(0.0);
    values2.add(-35.0);
    values2.add(90.2);
    
    ArrayList<Double> values3 = new ArrayList<Double>();
    values3.add(2.0);
    values3.add(3.1);
    values3.add(4.6);
    
    ArrayList<Double> values4 = new ArrayList<Double>();
    values4.add(9.0);
    values4.add(1.4);
    values4.add(3.5);
    
    testmaximumvalue(values,5.3);
    testmaximumvalue(values2,90.2);
    testmaximumvalue(values3,4.6);
    testmaximumvalue(values4,9.0);
  

}
}






