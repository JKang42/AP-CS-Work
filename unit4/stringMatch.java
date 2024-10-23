public class stringMatch
{
    public static int stringMatch(String a, String b) {
  
    int len = Math.min(a.length(), b.length());
    int count = 0;
  
    for (int i=0; i<len-1; i++) {
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub)) {  
      count++;
    }
  }

    return count;
}
    
    public static void teststringMatch(String a, String b, int expected)
    {
        int result = stringMatch(a, b);
        System.out.println("Input: " + a + " " + b + " Expected: " + expected + " Result: " + result);

        if (result == expected)
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
        teststringMatch("aabbyy", "aabbzzyy", 3);
        teststringMatch("everyone", "smile", 0);
        teststringMatch("abc", "abc", 2);
    }
    
}
    