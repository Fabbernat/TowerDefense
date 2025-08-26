package notCategorizedYet;

public class Starter {


  public static void start() {
    Game game = new Game();
    game.setParams();
    try {
      game.startFullScreen();
    } catch (Exception e) {
      System.err.println("Could not start the game full-screen");
    }
    game.showLoadingScreen();
    MainMenu mainMenu = new MainMenu();
    while (game.notExit()) {
      ++game.gameTime;
      ActionsExecuter.executeActions();
      game.repaint();
    }
  }
}
