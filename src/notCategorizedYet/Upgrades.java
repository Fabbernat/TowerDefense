package notCategorizedYet;

import java.util.EnumMap;

public class Upgrades {
  final int MAX_UPGRADE_LEVEL = 6;

  public enum UpgradeType {
    ARCHER,
    MAGE,
    BOMBARDIER,
    BARRACK,
    FIRST_SPELL,
    SECOND_SPELL
  }

  private final EnumMap<UpgradeType, Integer> upgradeLevels = new EnumMap<>(UpgradeType.class);

  public Upgrades() {
    for (UpgradeType type : UpgradeType.values()) {
      upgradeLevels.put(type, 0);
    }
  }

  /**
   * Increases the given upgrade level by 1, up to MAX_UPGRADE_LEVEL.
   *
   * @param typeName Name of the upgrade (case-insensitive, e.g. "archer" or "ARCHER")
   */
  public void increaseUpgradeLevel(String typeName) {
    try {
      UpgradeType type = UpgradeType.valueOf(typeName.trim().toUpperCase());
      int current = upgradeLevels.get(type);
      if (current < MAX_UPGRADE_LEVEL) {
        upgradeLevels.put(type, current + 1);
      }
    } catch (IllegalArgumentException e) {
      System.err.println("Not existing upgrade type: " + typeName);
    }
  }

  public int getArcherUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.ARCHER);
  }

  public void reset() {
    for (UpgradeType type : UpgradeType.values()) {
      upgradeLevels.put(type, 0);
    }

  }
}
