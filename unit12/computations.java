public class computations
{
    public static int findingMin (int[][] array2D)
    {
        int minValue = array2D[0][0]; 
        
        for (int row = 0; row < array2D.length; row++)
        {
            for (int column = 0; column < array2D[row].length; column++) 
            {
                if (array2D[row][column] < minValue)
                    minValue = array2D[row][column]; 
            }
        }
            return minValue; 
    }
   
    
    public static float calculateSum (float[][] array2D)
    {
        float total = 0.0f; 
        for (int row = 0; row < array2D.length; row++)
        {
            for (int column = 0; column < array2D[row].length; column++)
            {
                total += array2D[row][column]; 
            }
        }
            
            return total;
        
        
    }
        
    public static int countA (String[][] array2D)
    {
        int totalstring = 0; 
        
        for (int row = 0; row < array2D.length; row++)
        {
            for (int column = 0; column < array2D[row].length; column++)
            {
                if (array2D[row][column].substring(0,1).equals ("A")) 
                {
                    totalstring += 1; 
                }
            
            }
        }
            
            return totalstring; 
    }
    public static void main(String[]args)
    {
        int min[][]={{1,3,4},{2,-5,6}};
        System.out.println(findingMin(min)); 
        
        float sum[][]={{0.0f, 0.5f, 1.3f}, {4.5f,6.6f, 9.4f}};
        System.out.println(calculateSum(sum)); 
        
        String count[][]={{"Apple", "Amelia", "world"}, {"Tiger", "Bobcat", "A"}}; 
        System.out.println(countA(count)); 
    }
}