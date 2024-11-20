public class countZNames
{
    public static int countZNames(String[] words)
    {
                
        int count = 0;

        for (int i=0; i<words.length; i++)
        {
            String w = words[i];
            if ((w.substring(0,1).equals("Z")) || (w.substring(0,1).equals("z"))){
                count+=w.length();
            }
        }
        
        return count;
    }

    public static void testcountZNames(String[]words, int ExpectedCount)
    {
        int count = countZNames(words);
        
        System.out.print("Input: ");
        for (int i =0; i<words.length; i++)
        {
            System.out.print(words[i]+" ");
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
            String[] values={"Dr. Kessner", "Dr. Sands"};
            String[] values2={"Zarro", "zero", "zippy"};
            String[] values3={"Zoo"};
            String[] values4={"Hello", "World"};
            String[] values5={"Zoology", "Zebra"};
            testcountZNames(values, 0);
            testcountZNames(values2, 14);
            testcountZNames(values3, 3);
            testcountZNames(values4, 0);
            testcountZNames(values5, 12);
    }
}