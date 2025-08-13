package notCategorizedYet;

import levelsElements.enemies.position.EnemyPosition;
import levelsElements.towers.Tower;
import levelsElements.enemies.templates.EnemyBluePrint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LevelState {
  Map<EnemyBluePrint, EnemyPosition> enemies = new HashMap<>();
  ArrayList<Tower> turrets = new ArrayList<>();
}