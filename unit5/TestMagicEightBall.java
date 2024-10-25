public class TestMagicEightBall
{
    public static void main(String[]args)
    {   
        MagicEightBall ball = new MagicEightBall();
        
        System.out.println(ball.ask("Will I be rich?"));
       
        System.out.println(ball.ask("Will I be happy?"));
        
    }
}