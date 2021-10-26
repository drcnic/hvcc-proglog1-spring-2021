public class NiclasBasketballPlayer
{
  private String playerName;
  private String team;
  
  private String position;
  
  private int shotAttempts;
  private int shotsMade;
  
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
}