public class frontTimes
{
    public static String frontTimes(String str, int n) 
    {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
    
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }

    

    public static void testfrontTimes(String str, int n, String expected)
    {
        String result = frontTimes(str, n);
        System.out.println("Input: " + str + " Expected: " + expected + " Result: " + result);

        if (result.equals(expected))
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
        testfrontTimes("Coding", 2, "CodCod");
        testfrontTimes("Hospital", 3, "HosHosHos");
        testfrontTimes("Marlborough", 1, "Mar");
        testfrontTimes("Airpods", 2, "AirAir");
    }
    
}

