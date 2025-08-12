package notCategorizedYet;

public class Starter {
  public static void start() {
    Game game = new Game();
    game.setParams();
    game.showScreen();
    while (game.notFinished()) {
      ++game.gameTime;
      game.repaint();
    }
  }
}
