package levelsElements.enemies.traits;

import levelsElements.enemies.templates.Enemy;

public interface canChangeAttackDamage {
  public Enemy increaseAttackDamage(Enemy enemy, int percentage);
  public Enemy decreaseAttackDamage(Enemy enemy, int parcentage);
}
