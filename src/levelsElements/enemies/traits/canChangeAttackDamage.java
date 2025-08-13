package levelsElements.enemies.traits;

import levelsElements.enemies.templates.Enemy;

public interface canChangeAttackDamage {
  public Enemy increaseAttackDamage(int percentage);
  public Enemy decreaseAttackDamage(int parcentage);
}
