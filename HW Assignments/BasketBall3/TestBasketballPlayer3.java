public class TestBasketballPlayer3
{
  public static void main(String[] args)
  {
    
    NiclasBasketballPlayer bb1 = new NiclasBasketballPlayer("James Harden", "Houston Rockets", "Point Guard");
    NiclasBasketballPlayer bb2 = new NiclasBasketballPlayer("Damian Lillard", "Portland Trail Blazers", "Point Guard", 118, 245);                                                                 
    NiclasBasketballPlayer bb3 = new NiclasBasketballPlayer("Giannis Antetokounmpo", "Milwaukee Bucks", "Power Forward", 120, 207 );
    
    bb1.displayPlayer();
    bb2.displayPlayer(); 
    bb3.displayPlayer();
   
  }
}