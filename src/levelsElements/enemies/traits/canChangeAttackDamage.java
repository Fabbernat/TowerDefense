package levelsElements.enemies.traits;

import levelsElements.enemies.templates.Enemy;

public interface canChangeAttackDamage {
  public void increaseAttackDamage(int percentage);
  public void decreaseAttackDamage(int parcentage);
}
