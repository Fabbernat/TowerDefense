package Kr.notCategorizedYet;

import Kr.levelsElements.enemies.position.EnemyPosition;
import Kr.levelsElements.towers.Tower;
import Kr.levelsElements.enemies.templates.EnemyBluePrint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LevelState {
  private Map<EnemyBluePrint, EnemyPosition> enemies = new HashMap<>();
  private ArrayList<Tower> towers = new ArrayList<>();

  public Map<EnemyBluePrint, EnemyPosition> getEnemies() {
    return enemies;
  }

  public void setEnemies(Map<EnemyBluePrint, EnemyPosition> enemies) {
    this.enemies = enemies;
  }

  public ArrayList<Tower> getTowers() {
    return towers;
  }

  public void setTowers(ArrayList<Tower> towers) {
    this.towers = towers;
  }

  public void addTower(Tower tower) {
    this.towers.add(tower);
  }

  public static void main(String[] args) {
    LevelState levelState = new LevelState();

  }
}