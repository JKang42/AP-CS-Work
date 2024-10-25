public class MagicEightBall
{
    public String ask (String s)
    {
        if (Math.random() < .1)
            return response1;
        else if (Math.random() < .3)
            return response2;
        else if (Math.random() < .3)
            return response3;
        else if (Math.random() < .4)
            return response4;
        else if (Math.random() < .5)
            return response5;
        else if (Math.random() < .6)
            return response6;
        else if (Math.random() < .7)
            return response7;
        else 
            return response8;    
    }
    
    private final static String response1 = "Yes";
    private final static String response2 = "No";
    private final static String response3 = "Please stop asking questions";
    private final static String response4 = "I'm not sure";
    private final static String response5 = "What do you mean?";
    private final static String response6 = "There is infintely many possible solutions";
    private final static String response7 = "I'm busy right now";
    private final static String response8 = "Hello!";
    
}