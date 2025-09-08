package levelsElements.enemies.concreteEnemies;

import levelsElements.enemies.templates.Enemy;
import levelsElements.enemies.templates.EnemyAttackDamageChanger;
import levelsElements.enemies.traits.canChangeAttackDamage;

public class Goblin extends Enemy implements canChangeAttackDamage {



  final int maxHP = 30;
  int hitPoints = 30;
  double averageAttackDamage = 4;
  int minimumAttackDamage = 2;
  int maximumAttackDamage = 6;
  int speedInNodes = 5;
  double physicalArmor = 0;
  double magicArmor = 0;

  public Goblin() {
  }


  /**
   * @param percentage must be an integer between 0 and 100. 10 means a 10 percent decrease to damage and 100 means 0 damage - no damage at all.
   */
  public void decreaseAttackDamage(int percentage) {
    this.averageAttackDamage -= averageAttackDamage * (double) percentage / 100;
    this.minimumAttackDamage -= minimumAttackDamage * percentage / 100;
    this.maximumAttackDamage -= maximumAttackDamage * percentage / 100;
  }

  /**
   * @param percentage must be an integer, so 10 means a 10 percent boost to damage and 200 means 200% more damage
   */

  public void increaseAttackDamage(int percentage) {
    this.averageAttackDamage += averageAttackDamage * (double) percentage / 100;
    this.minimumAttackDamage += minimumAttackDamage * percentage / 100;
    this.maximumAttackDamage += maximumAttackDamage * percentage / 100;
  }

  public void resetAttackDamage(){
    this.averageAttackDamage = 4;
    this.minimumAttackDamage = 2;
    this.maximumAttackDamage = 6;
  }


  @Override
  public String toString() {
    return "Goblin{" +
            "maxHP=" + maxHP +
            ", hitPoints=" + hitPoints +
            ", minimumAttackDamage=" + minimumAttackDamage +
            ", averageAttackDamage=" + averageAttackDamage +
            ", maximumAttackDamage=" + maximumAttackDamage +
            '}';
  }

}
