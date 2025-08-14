package levels;

import levels.events.EnemySpawn;
import levelsElements.enemies.templates.Enemy;

import java.util.HashMap;
import java.util.Set;

import java.util.List;

public class Wave {
  private final List<EnemySpawn> enemyArrivals;
  private final int waitTimeInSecondsUntilAutomaticCall;

  public Wave(List<EnemySpawn> enemyArrivals, int waitTimeInSecondsUntilAutomaticCall) {
    this.enemyArrivals = enemyArrivals;
    this.waitTimeInSecondsUntilAutomaticCall = waitTimeInSecondsUntilAutomaticCall;
  }

  public List<EnemySpawn> getEnemyArrivals() {
    return enemyArrivals;
  }

  public int getWaitTimeInSecondsUntilAutomaticCall() {
    return waitTimeInSecondsUntilAutomaticCall;
  }
}