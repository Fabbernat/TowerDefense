package levels.level1;

import levels.Wave;
import levels.Waves;
import levels.events.EnemySpawn;
import levelsElements.enemies.concreteEnemies.Goblin;
import levelsElements.enemies.concreteEnemies.Orc;

import java.util.List;

public class Level1Waves extends Waves {
  int numberOfEntryPoints = 1;
  int numberOfExits = 1;
  int waitTimeInSecondsUntilAutomaticCall;
  int delayInSeconds;
  Object enemyArrivals;
  private final List<Wave> waves = List.of(
          // Wave 1
          new Wave(
                  List.of(
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Goblin.class, 0.5)
                  ),
                  0
          ),

          // Wave 2
          new Wave(
                  List.of(
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Goblin.class, 6.0),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Goblin.class, 0.5)
                  ),
                  30 // waitTimeInSecondsUntilAutomaticCall
          ),

          // Wave 3
          new Wave(
                  List.of(
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Orc.class, 5.0),
                          new EnemySpawn(Goblin.class, 4.0),
                          new EnemySpawn(Goblin.class, 0.5),
                          new EnemySpawn(Goblin.class, 0.5)
                  ),
                  0
          ),

          // Wave 4
          new Wave(
                  List.of(
                          new EnemySpawn(Orc.class, 0.0),
                          new EnemySpawn(Orc.class, 3.0),
                          new EnemySpawn(Orc.class, 3.0),
                          new EnemySpawn(Goblin.class, 8.0),
                          new EnemySpawn(Goblin.class, 0.7),
                          new EnemySpawn(Goblin.class, 0.7),
                          new EnemySpawn(Goblin.class, 0.7),
                          new EnemySpawn(Goblin.class, 0.7)
                  ),
                  0
          ),

          // Wave 5
          new Wave(
                  List.of(
                          new EnemySpawn(Orc.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Orc.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Orc.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0)
                  ),
                  0
          ),

          // Wave 6
          new Wave(
                  List.of(
                          new EnemySpawn(Goblin.class, 0.0), // repeat 16 times
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0),
                          new EnemySpawn(Goblin.class, 0.0)
                  ),
                  0
          )
  );

  public List<Wave> getWaves() {
    return waves;
  }
}
