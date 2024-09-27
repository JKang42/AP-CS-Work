public class parrotTrouble 
{
    public static boolean parrotTrouble(boolean talking, int hour)
    {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
    }else {
            return false;
  }
    }

public static void testparrotTrouble(boolean talking, int hour, boolean expected)
    {
        boolean result = parrotTrouble(talking, hour);
    
        System.out.println("Talking: " + talking + "  Hour: " + hour + "  Expected: " + expected + "  Result: " + result);
        
        if(result==expected)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect"); 
        }
    }
    
    
    public static void main(String[] args) //test
    {
        testparrotTrouble(true, 5, true);
        testparrotTrouble(false, 8, true);
        testparrotTrouble(true, 4, true);
        testparrotTrouble(true, 24, true);
    }
}