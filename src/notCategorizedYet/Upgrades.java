package notCategorizedYet;

import java.util.Arrays;
import java.util.EnumMap;

public class Upgrades {
  final int MAX_UPGRADE_LEVEL = 6;

  public enum UpgradeType {
    ARCHER(1, 1, 2, 2, 3, 3),
    BARRACK(1, 1, 2, 2, 3, 3),
    MAGE(1, 1, 2, 2, 3, 3),
    BOMBARDIER(1, 1, 2, 3, 3, 3),
    FIRST_SPELL(1, 1, 2, 2, 3, 3),
    SECOND_SPELL(2, 2, 3, 3, 3, 4);

    private final int[] costs;

    UpgradeType(int... costs) {
      this.costs = costs;
    }

    public int[] getCosts() {
      return costs;
    }

    public int getCostAtLevel(int level) {
      if (level < 1 || level > costs.length) {
        throw new IllegalArgumentException("Invalid upgrade level: " + level);
      }
      return costs[level - 1];
    }

    // --- total stars across ALL upgrades ---
    public static final int totalStarsAvailable;

    static {
      int total = 0;
      for (UpgradeType type : values()) {
        total += Arrays.stream(type.costs).sum();
      }
      totalStarsAvailable = total;
    }
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

  /**
   *
   * @return all of the upgrades
   */
  public EnumMap<UpgradeType, Integer> getUpgradeLevels() {
    return upgradeLevels;
  }

  /**
   *
   * And these six @return the types one by one
   */
  public int getARCHERUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.ARCHER);
  }
  public int getBARRACKUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.BARRACK);
  }
  public int getMAGEUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.MAGE);
  }
  public int getBOMBARDIERUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.BOMBARDIER);
  }
  public int getFIRST_SPELLUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.FIRST_SPELL);
  }
  public int getSECOND_SPELLUpgradeLevel() {
    return upgradeLevels.get(UpgradeType.SECOND_SPELL);
  }

  public void reset() {
    for (UpgradeType type : UpgradeType.values()) {
      upgradeLevels.put(type, 0);
    }

  }

  public static void main(String[] args) {
    System.out.println(Upgrades.UpgradeType.ARCHER.getCostAtLevel(3)); // 2
    System.out.println(Upgrades.UpgradeType.totalStarsAvailable);      // 78
  }
}
