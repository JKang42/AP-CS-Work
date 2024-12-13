import java.util.*;

public class reverseAll
{
    public static ArrayList<String> reverseAll(ArrayList<String> words)
    {
        ArrayList<String> result = new ArrayList<String> ();
        
        
        for (int i = 0; i<words.size(); i++)
        {
            result.add(reverse(words.get(i)));
        }
        
        return result;    
        
    }


public static String reverse(String s)
{
    String result = "";
        
        for (int i=s.length()-1; i>=0; i--)
        {
            result += s.substring(i, i+1);
        }

        return result;
}
    
public static void testreverseAll(ArrayList<String>words, ArrayList<String> ExpectedWord)
{
    ArrayList<String> result = reverseAll (words);
    
    System.out.print("Input: ");
         for (int i =0; i<words.size(); i++)
        {
            System.out.print(words.get(i)+" ");
        }
        System.out.println(" " + " Expected: " + ExpectedWord + " Result: " + result);

        if (result.equals(ExpectedWord))
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
    
    ArrayList<String> words = new ArrayList<String>();
    words.add("abcd");
    words.add("xyz");
    
    ArrayList<String> words2 = new ArrayList<String>();
    words2.add("1234");
    words2.add("5678");
    
    ArrayList<String> words3 = new ArrayList<String>();
    words3.add("racecar");
    words3.add("tacocat");
    words3.add("izzi");
    
    ArrayList<String> words4 = new ArrayList<String>();
    words4.add("hello");
    words4.add("world");
    
    ArrayList<String> words5 = new ArrayList<String>();
    words5.add("4689");
    words5.add("1057");
    
    ArrayList<String> ExpectedWord =  new ArrayList<String> ();
    ExpectedWord.add("dcba");
    ExpectedWord.add("zyx");
    
    ArrayList<String> ExpectedWord2 =  new ArrayList<String> ();
    ExpectedWord2.add("4321");
    ExpectedWord2.add("8765");
    
    ArrayList<String> ExpectedWord3 =  new ArrayList<String> ();
    ExpectedWord3.add("racecar");
    ExpectedWord3.add("tacocat");
    ExpectedWord3.add("izzi");
    
    ArrayList<String> ExpectedWord4 =  new ArrayList<String> ();
    ExpectedWord4.add("olleh");
    ExpectedWord4.add("dlrow");
    
    ArrayList<String> ExpectedWord5 =  new ArrayList<String> ();
    ExpectedWord5.add("9864");
    ExpectedWord5.add("7501");
    
    testreverseAll(words,ExpectedWord);
    testreverseAll(words2,ExpectedWord2);
    testreverseAll(words3,ExpectedWord3);
    testreverseAll(words4,ExpectedWord4);
    testreverseAll(words5,ExpectedWord5);
  

}
}



    
    
    
        