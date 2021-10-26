public class TestBasketballPlayer
{
  public static void main(String[] args)
  {
    NiclasBasketballPlayer bb1 = new NiclasBasketballPlayer();
    NiclasBasketballPlayer bb2 = new NiclasBasketballPlayer();
    
    bb1.setPlayerName("Julius Randle");
    bb1.setTeam("New York Knicks");
    bb1.setPosition("Power Forward");
    
    bb1.setShotAttempts(78);
    bb1.setShotsMade(34);
    
    bb2.setPlayerName("RJ Barrett");
    bb2.setTeam("New York Knicks");
    bb2.setPosition("Shooting Guard");
    
    bb2.setShotAttempts(93);
    bb2.setShotsMade(41);
    
    System.out.println("Player 1 name: " + bb1.getPlayerName());
    System.out.println("Player 1 team: " + bb1.getTeam());
    System.out.println("Player 1 position: " + bb1.getPosition());
    System.out.println("Player 1 shot attempts: " + bb1.getShotAttempts());
    System.out.println("Player 1 shots made: " + bb1.getShotsMade());
    
    System.out.println();
    System.out.println("Player 2 name: " + bb2.getPlayerName());
    System.out.println("Player 2 team: " + bb2.getTeam());
    System.out.println("Player 2 position: " + bb2.getPosition());
    System.out.println("Player 2 shot attempts: " + bb2.getShotAttempts());
    System.out.println("Player 2 shots made: " + bb2.getShotsMade());
    
    
  }
}