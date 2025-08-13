package levelsElements.enemies.templates;

public class EnemyAttackDamageChanger {
  private int maxHP;
  private int hitPoints;
  private int minimumAttackDamage;
  private double averageAttackDamage;
  private int maximumAttackDamage;

  /**
   @param percentage must be an integer, so 10 means a 10 percent boost to damage and 200 means 200% more damage
   */
  public static void increaseAttackDamage(Enemy enemy, int percentage) {
    double modifier =  ((double) percentage /100);

    enemy.averageAttackDamage += enemy.averageAttackDamage * modifier;

    enemy.minimumAttackDamage = (int) (enemy.minimumAttackDamage * modifier);

    enemy.maximumAttackDamage = (int) (enemy.maximumAttackDamage * modifier);
  }

  /**
   @param percentage must be an integer between 0 and 100. 10 means a 10 percent decrease to damage and 100 means 0 damage - no damage at all.
   */
  public static void decreaseAttackDamage(Enemy enemy, int percentage) throws IllegalArgumentException {

    if (percentage > 100) {
      throw new IllegalArgumentException("You cannot decrease the damage more than 100%. That would cause the damage to go minimum, which does not make sense.");
    }
    double modifier =  ((double) percentage /100);

    enemy.averageAttackDamage -= enemy.averageAttackDamage * modifier;

    // If the percentage is 100, then the average damage is reduced to zero, and so are the minimumAttackDamage and maximumAttackDamage. They shall not be a negative number, all must be zero.
    if (enemy.averageAttackDamage < 0) {
      enemy.averageAttackDamage = 0;
      enemy.minimumAttackDamage = 0;
      enemy.maximumAttackDamage = 0;
      return;
    }

    enemy.minimumAttackDamage -= (int) (enemy.minimumAttackDamage * modifier);

    enemy.maximumAttackDamage -= (int) (enemy.maximumAttackDamage * modifier);
  }
}
