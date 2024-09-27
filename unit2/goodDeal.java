public class GoodDeal 
{
    public static boolean goodDeal(double originalPrice, double salePrice) 
     {
        return salePrice < 0.75 * originalPrice;
        
     }
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected) // test
     {
        boolean result = goodDeal(originalPrice, salePrice);
        
        System.out.println("Orignal Price: " + originalPrice + "  Sale Price: " + salePrice + "  Expected: " + expected + "  Result: " + result);
        
            if(result == expected)
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
       testGoodDeal(100,30, true);
       testGoodDeal(100,40, true);
       testGoodDeal(100,60, true);
       testGoodDeal(100,50, true);

     }
       
}