import gameParameters.GameParameters;

public class Game {

  public int gameTime;

  public void setParams(){
    GameParameters gameParameters = new GameParameters();  
  }
  
  public void showScreen(){
    
  }

  public boolean notFinished () {
    return !GameParameters.finished;
  }



  public void repaint() {
  }
}
