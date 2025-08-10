import gameElements.enemies.concreteEnemies.Goblin;
import gameElements.enemies.templates.Enemy;

public class Main {

  public static void start() {
    Game game = new Game();
    game.setParams();
    game.showScreen();
    while (game.notFinished()) {
      ++game.gameTime;
      game.repaint();
    }
  }

  public static void main(String[] args) {
    start();
    Enemy enemy = new Goblin();
  }
}
