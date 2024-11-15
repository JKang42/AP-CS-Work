public class sumOfSquaresArray
{
    public static double sumOfSquaresArray (double[]numbers) //class names always same
    {
        double total = 0.0;
        
        for (int i=0; i<numbers.length; i++) 
        {
            total += numbers[i]*numbers[i];
        }

        return total;
    }
    
    public static void testsumOfSquaresArray(double[]numbers, double ExpectedTotal)
    {
        double total = sumOfSquaresArray(numbers);
        
        System.out.print("Input: ");
        for (int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
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
            double[] values={0};
            double[] values2={1.0, 2.0, 3.0};
            double[] values3={2.0, 2.0, 2.0};
            double[] values4={2.0, 3.0, 3.0};
            double[] values5={2.0, 4.0, 5.0};;
            testsumOfSquaresArray(values, 0);
            testsumOfSquaresArray(values2, 14.0);
            testsumOfSquaresArray(values3, 12.0);
            testsumOfSquaresArray(values4, 22.0);
            testsumOfSquaresArray(values5, 45.0);
    }
}
                    