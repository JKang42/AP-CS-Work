public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        System.out.println("This is the total score");


        ScoreKeeper keeper = new ScoreKeeper();
      
        keeper.scoreNormal();
        keeper.scoreBonus();
        keeper.scoreBonus();
        keeper.scoreBonus();

        System.out.println("The total score is: " + keeper.getTotal());
        
    }
}
