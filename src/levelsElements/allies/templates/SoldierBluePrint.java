package levelsElements.allies.templates;

public abstract class SoldierBluePrint {
  int maxHP;
  int hitPoints;
  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  int speedInNodes = 6;
  double physicalArmor;

  public SoldierBluePrint(int maxHP, int averageAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = (int) (averageAttackDamage * 0.8);
    this.maximumAttackDamage = (int) (averageAttackDamage * 1.2);
  }

  public SoldierBluePrint(int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.minimumAttackDamage = minimumAttackDamage;
    this.maximumAttackDamage = maximumAttackDamage;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void increaseHitPoints(int amount) {
    this.hitPoints += amount;
  }

  public void decreaseHitPoints(int amount) {
    this.hitPoints -= amount;
  }
}
