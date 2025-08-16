package levels.level2;

import levels.Level;

public class Level2 extends Level {
  private final int NUMBER_OF_TOWER_SPOTS;

  public int getNUMBER_OF_TOWER_SPOTS() {
    return NUMBER_OF_TOWER_SPOTS;
  }

  public Level2(int NUMBER_OF_TOWER_SPOTS) {
    this.NUMBER_OF_TOWER_SPOTS = NUMBER_OF_TOWER_SPOTS;
  }
}
