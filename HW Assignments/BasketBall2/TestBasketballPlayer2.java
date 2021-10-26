public class TestBasketballPlayer2
{
  public static void main(String[] args)
  {
    NiclasBasketballPlayer bb1 = new NiclasBasketballPlayer();
    NiclasBasketballPlayer bb2 = new NiclasBasketballPlayer("Deandre Jordan", "Brooklyn Nets");
    NiclasBasketballPlayer bb3 = new NiclasBasketballPlayer("Kevin Durant", "Brooklyn Nets", "Forward");
    NiclasBasketballPlayer bb4 = new NiclasBasketballPlayer("Kyrie Irving", "Brooklyn Nets", "Guard", 75, 159);
    
    bb1.displayPlayer();
    bb2.displayPlayer();
    bb3.displayPlayer();
    bb4.displayPlayer();
    
    
   
    
  }
}