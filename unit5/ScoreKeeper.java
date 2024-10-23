public class ScoreKeeper
{
    public ScoreKeeper() 
    {
        total = 0;
    }

    public void scoreNormal()
    {
        total += 100;
    }

    public void scoreBonus()
    {
        total += 1000;
    }

     public int getTotal()
    {
        return total;
    }

    private int total;

    public static void main(String[] args)
    {
        System.out.println("This is the total score");


        ScoreKeeper keeper = new ScoreKeeper();
      
        keeper.scoreNormal();
        keeper.scoreBonus();

        System.out.println("The total score is: " + keeper.getTotal());
        
    }
}

