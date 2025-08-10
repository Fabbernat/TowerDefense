import gameElements.Position;
import gameElements.Turret;
import gameElements.enemies.templates.EnemyBluePrint;

import java.util.ArrayList;

public class GameState {
  ArrayList<EnemyBluePrint, Position> enemies = new ArrayList<>();
  ArrayList<Turret> turrets = new ArrayList<>();
}