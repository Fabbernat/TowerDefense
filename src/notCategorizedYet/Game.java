package notCategorizedYet;

import gameParameters.GameParameters;

public class Game {

  public int gameTime = 0;

  public void setParams(){
    GameParameters gameParameters = new GameParameters();  
  }
  
  public void showScreen(){
    
  }

  public boolean notFinished () {
    return gameTime < 100;
  }



  public void repaint() {
  }
}
