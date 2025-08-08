public class Main {
  public static void main(String[] args) {

    Game game = new Game();
    game.setParams();
    game.showScreen();
    game.start();
    while (game.notFinished()) {
      ++game.gameTime;
      game.repaint();
    }
  }
}
