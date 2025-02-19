public class ArrayInitalization
{
    
    public static void main(String[] args)
    {
        //Part A 
        
        int[][] array2D = new int[10][10]; 
        
        for (int row = 0; row < array2D.length; row++)
        {
            for (int column = 0; column < array2D[row].length; column++)
            {
                if (row == column)
                
                    array2D[row][column] = 1; 
            }
        }
        
        //Part B 
        
        String [][] stringarray2D = new String[10][10];
        
        //Part C
        
        double [][] array2Dc = new double[5][5]; 
        
        double val = 10.0; 
        
        for (int row = 0; row < array2Dc.length; row++)
        {
            for (int column = 0; column < array2Dc[row].length; column++)
            {
                val += 1; 
                array2Dc[row][column] = val; 
            }
            
            val += 5;
        }
        
        //Part D 
        
        int[][] array2Dd = new int[6][5];
        
        int value = 1; 
        
        for (int row = 0; row < array2Dd.length; row++)
        {
            for (int column = 0; column < array2Dd[row].length; column++)
            {
                array2Dd[row][column] = value; 
            }
            
            value += 1;
        }

    }
}

