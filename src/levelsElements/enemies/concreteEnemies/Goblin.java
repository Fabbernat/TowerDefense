package levelsElements.enemies.concreteEnemies;

import levelsElements.enemies.traits.Ability;
import levelsElements.enemies.templates.AttackDamage;
import levelsElements.enemies.templates.Enemy;
import levelsElements.enemies.templates.EnemyAttackDamageModifier;
import levelsElements.enemies.traits.canChangeAttackDamage;

import java.util.*;

public class Goblin extends Enemy implements canChangeAttackDamage {


  // base value (useful for reset)
  final int maxHP = 30;

  // current value
  int hitPoints = 30;

  // base values (useful for reset)
  private final AttackDamage baseAttackDamage = new AttackDamage(4.0, 2, 6);
  private ArrayList<Ability> abilities = new ArrayList<Ability>();

  // current values
  private AttackDamage currentAttackDamage = baseAttackDamage;

  int speedInNodes = 5;
  double physicalArmor = 0;
  double magicArmor = 0;

  public Goblin() {
    super();

  }

  /**
   * @param percentage must be an integer, so 10 means a 10-percent boost to damage, and 200 means 200% more damage
   */

  public void increaseAttackDamage(int percentage) {
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.scaleUpAttackDamage(before, percentage);
    currentAttackDamage = after;
  }

  /**
   * @param percentage must be an integer between 0 and 100. 10 means a 10-percent decrease to damage, and 100 means 0 damage - no damage at all.
   */
  public void decreaseAttackDamage(int percentage) {
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.scaleDownAttackDamage(before, percentage);
    currentAttackDamage = after;
  }


  public void increaseAttackDamageByFlat(int flatAmount){
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.increaseAttackDamageByFlat(before, flatAmount);
    currentAttackDamage = after;
  }

  public void decreaseAttackDamageByFlat(int flatAmount){
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.decreaseAttackDamageByFlat(before, flatAmount);
    currentAttackDamage = after;
  }


  public void resetAttackDamage(){
    currentAttackDamage = baseAttackDamage;
  }


  @Override
  public String toString() {
    return "Goblin{" +
            "maxHP=" + maxHP +
            ", hitPoints=" + hitPoints +
            ", minimumAttackDamage=" + currentAttackDamage.min() +
            ", averageAttackDamage=" + currentAttackDamage.average() +
            ", maximumAttackDamage=" + currentAttackDamage.max() +
            '}';
  }

}
