package Kr.levelsElements.enemies.templates;

public abstract class EnemyBluePrint {
  int maxHP;
  int hitPoints;
  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  int speedInNodes = 3;
  double physicalArmor = 0;
  double magicArmor = 0;

  public EnemyBluePrint(){}


  public EnemyBluePrint(int maxHP, int averageAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = (int) (averageAttackDamage * 0.8);
    this.maximumAttackDamage = (int) (averageAttackDamage * 1.2);
  }

  public EnemyBluePrint(int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
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
