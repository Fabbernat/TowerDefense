package Kr.levels;

import Kr.levels.events.EnemySpawn;

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