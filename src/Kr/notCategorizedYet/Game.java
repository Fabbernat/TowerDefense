package Kr.notCategorizedYet;

import Kr.gameParameters.GameParameters;


public class Game {

  public int gameTime = 0;
  public int maxGameTime = 1_000_000;

  public void setParams(){
    GameParameters gameParameters = new GameParameters();  
  }
  
  public void startFullScreen(){
    try {
      allocateScreen();
      allocateMemory();
      allocateStaticResources();
    } catch (Exception e) {
      System.err.println("Could not allocate full screen from the system");
    }
  }


  private void allocateScreen() {
  }

  private void allocateMemory() {
  }
  private void allocateStaticResources() {
  }

  public boolean notExit() {
    return gameTime < maxGameTime;
  }



  public void repaint() {
  }

  public void showLoadingScreen() {
    Graphics.show(Graphics.LOADING_SCREEN);
  }
}
