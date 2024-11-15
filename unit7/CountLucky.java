public class CountLucky
{
    public static int CountLucky(int[] numbers)
    {
                
        int count = 0;

        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]%7 == 0 || numbers[i]%10 == 7)
                count++;
        }
        
        return count;
    }

    public static void testCountLucky(int[]numbers, int ExpectedCount)
    {
        int count = CountLucky(numbers);
        
        System.out.print("Input: ");
        for (int i =0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
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
            int[] values={1,2,3};
            int[] values2={7,13,17};
            int[] values3={107,207};
            int[] values4={307,7,13};
            int[] values5={14,7,49};;
            testCountLucky(values, 0);
            testCountLucky(values2, 2);
            testCountLucky(values3, 2);
            testCountLucky(values4, 2);
            testCountLucky(values5, 3);
    }
}