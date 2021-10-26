// NOTES
// binding: java selecting the appropriate method based on supplied parameters
// overloading functions: paramater lists must differ
public class NiclasBasketballPlayer
{
  private String playerName;
  private String team;
  
  private String position;
  
  private int shotAttempts;
  private int shotsMade;

  // Constructors
  public NiclasBasketballPlayer() {
    this.playerName = "";
    this.team = "";
    this.position = "";

    this.shotAttempts = 0;
    this.shotsMade = 0;
  }

  public NiclasBasketballPlayer(String playerName, String team) {
    this.playerName = playerName;
    this.team = team;
    this.position = "";
    
    this.shotAttempts = 0;
    this.shotsMade = 0;
  }

  public NiclasBasketballPlayer(String playerName, String team, String position) {
    this.playerName = playerName;
    this.team = team;
    this.position = position;
    
    this.shotAttempts = 0;
    this.shotsMade = 0;
  }

  public NiclasBasketballPlayer(String playerName, String team, String position, int shotsMade, int shotAttempts) {
    this.playerName = playerName;
    this.team = team;
    this.position = position;

    this.shotsMade = shotsMade;
    this.shotAttempts = shotAttempts;
  }

  // Method definitions
  public void setPlayerName(String newName) {
    playerName = newName;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setTeam(String newTeam) {
    team = newTeam;
  }

  public String getTeam() {
    return team;
  }

  public void setPosition(String newPosition) {
    position = newPosition;
  }

  public String getPosition() {
    return position;
  }

  public void setShotAttempts(int x) {
    shotAttempts = x;
  }

  public int getShotAttempts() {
    return shotAttempts;
  }

  public void setShotsMade(int x) {
    shotsMade = x;
  }

  public int getShotsMade() {
    return shotsMade;
  }

  public void displayPlayer() {
    makeLine(50);
    System.out.println("Basketball Player: " + this.playerName);
    System.out.println("Team: " + this.team);
    System.out.println();
    System.out.println("Position: " + this.position);
    System.out.println();
    System.out.println("Shots Made: " + this.shotsMade);
    System.out.println("Shot Attempts: " + this.shotAttempts); 
    makeLine(50);
  }

  public static void makeLine(int length) {
    for (int i = 0; i < length; i++) {
        System.out.print('-');
    }
    System.out.println();
  }
}