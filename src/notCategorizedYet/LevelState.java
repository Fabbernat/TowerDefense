package notCategorizedYet;

import levelsElements.Position;
import levelsElements.Turret;
import levelsElements.enemies.templates.EnemyBluePrint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LevelState {
  Map<EnemyBluePrint, Position> enemies = new HashMap<>();
  ArrayList<Turret> turrets = new ArrayList<>();
}