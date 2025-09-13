package levelsElements.enemies.templates;

import java.util.AbstractCollection;

public class EnemyAttackDamageModifier {

  /**
   * @param preModificationDamage original damage triple
   * @param percentage must be an integer, so 10 means a 10 percent boost to damage and 200 means 200% more damage
   * @return new AttackDamage scaled up
   */
  public static AttackDamage scaleUpAttackDamage(AttackDamage preModificationDamage, double percentage) {
    double factor = 1.0 + percentage / 100.0;

    double newAverageAttackDamage = preModificationDamage.average() * factor;
    int newMinimumAttackDamage = (int) Math.round(preModificationDamage.min() * factor);
    int newMaximumAttackDamage = (int) Math.round(preModificationDamage.max() * factor);
    return new AttackDamage(newAverageAttackDamage, Math.max(0, newMinimumAttackDamage), Math.max(0, newMaximumAttackDamage));
  }

  /**
   * @param percentage must be an integer between 0 and 100. 10 means a 10 percent decrease to damage and 100 means 0 damage - no damage at all.
   */
  public static AttackDamage scaleDownAttackDamage(AttackDamage  preModificationDamage, double percentage) throws IllegalArgumentException {

    if (percentage > 100) {
      throw new IllegalArgumentException("You cannot decrease the damage more than 100%. That would cause the damage to go minimum, which does not make sense.");
    }
    double factor = 1.0 - percentage / 100.0;
    double newAverageAttackDamage = preModificationDamage.average() * factor;
    int newMinimumAttackDamage = (int) Math.round(preModificationDamage.min() * factor);
    int newMaximumAttackDamage = (int) Math.round(preModificationDamage.max() * factor);

    // If the percentage is 100, then the average damage is reduced to zero, and so are the minimumAttackDamage and maximumAttackDamage. They shall not be a negative number, all must be zero.
    if (newAverageAttackDamage <= 0) {
      newAverageAttackDamage = 0;
      newMinimumAttackDamage = 0;
      newMaximumAttackDamage = 0;
    }


    return new AttackDamage(Math.max(0.0, newAverageAttackDamage), Math.max(0, newMinimumAttackDamage), Math.max(0, newMaximumAttackDamage));
    }


  public static AttackDamage increaseAttackDamageByFlat(AttackDamage  preModificationDamage, double flatAmount){

    int additionToMin = (int) Math.round(flatAmount * (preModificationDamage.min() / preModificationDamage.average()));
    int additionToMax = (int) Math.round(flatAmount * (preModificationDamage.max() / preModificationDamage.average()));

    return new AttackDamage(preModificationDamage.average() + flatAmount, preModificationDamage.min() + additionToMin, preModificationDamage.max() + additionToMax);
  }

  public static AttackDamage decreaseAttackDamageByFlat(AttackDamage  preModificationDamage, double flatAmount){
    int additionToMin = (int) Math.round(flatAmount * (preModificationDamage.min() / preModificationDamage.average()));
    int additionToMax = (int) Math.round(flatAmount * (preModificationDamage.max() / preModificationDamage.average()));

    return new AttackDamage(preModificationDamage.average() - flatAmount, preModificationDamage.min() - additionToMin, preModificationDamage.max() - additionToMax);
  }
}
