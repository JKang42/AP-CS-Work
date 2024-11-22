import java.util.*;

public class sumofsquares
{

    public static double sumofsquares (ArrayList<Double>numbers)
    {
        double total = 0.0;
        
        for (int i=0; i<numbers.size(); i++) 
        {
            total += numbers.get(i)*numbers.get(i); 
        }

        return total;
    }
    
    public static void testsumofsquares(ArrayList<Double>numbers, double ExpectedTotal)
    {
        double total = sumofsquares(numbers);
        
        System.out.print("Input: ");
        for (int i=0; i<numbers.size(); i++)
        {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println(" " + " Expected: " + ExpectedTotal + " Result: " + total);

        if (total == ExpectedTotal) 
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
        
            ArrayList<Double> values = new ArrayList<Double>();
            values.add(0.0);
        
            ArrayList<Double> values2 = new ArrayList<Double>();
            values2.add(1.0);
            values2.add(2.0);
            values2.add(3.0);
        
            ArrayList<Double> values3 = new ArrayList<Double>();
            values3.add(2.0);
            values3.add(2.0);
            values3.add(2.0);
        
            ArrayList<Double> values4 = new ArrayList<Double>();
            values4.add(2.0);
            values4.add(3.0);
            values4.add(3.0);
        
            ArrayList<Double> values5 = new ArrayList<Double>();
            values5.add(2.0);
            values5.add(4.0);
            values5.add(5.0);
        
            testsumofsquares(values, 0);
            testsumofsquares(values2, 14.0);
            testsumofsquares(values3, 12.0);
            testsumofsquares(values4, 22.0);
            testsumofsquares(values5, 45.0);
    }
}
                    