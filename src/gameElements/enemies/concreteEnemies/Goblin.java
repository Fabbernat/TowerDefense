package gameElements.enemies.concreteEnemies;

import gameElements.enemies.templates.Enemy;
import gameElements.enemies.templates.EnemyAttackDamageChanger;
import gameElements.enemies.traits.canChangeAttackDamage;

public class Goblin extends Enemy implements canChangeAttackDamage {

  private final int maxHP = 30;
  private int hitPoints = 30;
  private int minimumAttackDamage = 2;
  private double averageAttackDamage = 4;
  private int maximumAttackDamage = 6;

  public Goblin(){}

  public int getHitPoints() {
    return hitPoints;
  }

  public void increaseHitPoints(int amount) {
    this.hitPoints += amount;

    if (hitPoints > maxHP) {
      hitPoints = maxHP;
    }
  }

  public void decreaseHitPoints(int amount) {
    this.hitPoints -= amount;
  }

  /**
   @param percentage must be an integer, so 10 means a 10 percent boost to damage and 200 means 200% more damage
   */
  @Override
  public void increaseAttackDamage(int percentage) {
    EnemyAttackDamageChanger.increaseAttackDamage(this, percentage);
  }

  /**
   @param percentage must be an integer between 0 and 100. 10 means a 10 percent decrease to damage and 100 means 0 damage - no damage at all.
   */
  @Override
  public void decreaseAttackDamage(int percentage) {
    EnemyAttackDamageChanger.decreaseAttackDamage(this, percentage);
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
