package Kr.levels.events;

public class EnemySpawn {
  private final Class<?> enemyType; // Goblin.class, Orc.class, etc.
  private final double delayInSeconds;

  public EnemySpawn(Class<?> enemyType, double delayInSeconds) {
    this.enemyType = enemyType;
    this.delayInSeconds = delayInSeconds;
  }

  public Class<?> getEnemyType() {
    return enemyType;
  }

  public double getDelayInSeconds() {
    return delayInSeconds;
  }
}
