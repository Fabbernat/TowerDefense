package gameElements.enemies.concreteEnemies;

import gameElements.enemies.templates.Enemy;
import gameElements.enemies.traits.canChangeAttackDamage;

public class Goblin extends Enemy implements canChangeAttackDamage {

  private int maxHP = 30;
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
  }

  public void decreaseHitPoints(int amount) {
    this.hitPoints -= amount;
  }


  /**
  @param percentage must be an integer, so 10 means a 10 percent boost to damage and 200 means 200% more damage
  */
  @Override
  public void increaseAttackDamage(int percentage) {
    double modifier =  ((double) percentage /100);

    averageAttackDamage += averageAttackDamage * modifier;

    minimumAttackDamage = (int) (minimumAttackDamage * modifier);

    maximumAttackDamage = (int) (maximumAttackDamage * modifier);
  }

  /**
   @param percentage must be an integer between 0 and 100. 10 means a 10 percent decrease to damage and 100 means 0 damage - no damage at all.
   */
  @Override
  public void decreaseAttackDamage(int percentage) throws IllegalArgumentException {

    if (percentage > 100) {
      throw new IllegalArgumentException("You cannot decrease the damage more than 100%. That would cause the damage to go minimum, which does not make sense.");
    }
    double modifier =  ((double) percentage /100);

    averageAttackDamage -= averageAttackDamage * modifier;

    // If the percentage is 100, then the average damage is reduced to zero, and so are the minimumAttackDamage and maximumAttackDamage. They shall not be a negative number, all must be zero.
    if (averageAttackDamage < 0) {
      averageAttackDamage = 0;
      minimumAttackDamage = 0;
      maximumAttackDamage = 0;
      return;
    }

    minimumAttackDamage -= (int) (minimumAttackDamage * modifier);

    maximumAttackDamage -= (int) (maximumAttackDamage * modifier);
  }
}
