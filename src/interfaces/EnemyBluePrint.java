package interfaces;

public abstract class EnemyBluePrint {
  int maxHP;
  int hitPoints;
  int minimumAttackDamage;
  int maximumAttackDamage;

  public EnemyBluePrint(int maxHP, int averageAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.minimumAttackDamage = (int) (averageAttackDamage * 0.8);
    this.maximumAttackDamage = (int) (averageAttackDamage * 1.2);
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void increaseHitPoints (int amount) {
    this.hitPoints += amount;
  }

  public void decreaseHitPoints (int amount) {
    this.hitPoints -= amount;
  }
}
