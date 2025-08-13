package levelsElements.allies.concreteAllies;

public abstract class BarrackSoldier {
  int maxHP;
  int hitPoints;
  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  int speedInNodes = 6;
  double physicalArmor;

  public BarrackSoldier(int maxHP, int averageAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = (int) (averageAttackDamage * 0.8);
    this.maximumAttackDamage = (int) (averageAttackDamage * 1.2);
  }

  public BarrackSoldier(int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
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

class level1BarrackTower {
  int maxHP = 50;
  int hitPoints;
  double averageAttackDamage = 2;
  int minimumAttackDamage = 1;
  int maximumAttackDamage = 3;
  int speedInNodes = 6;
  double physicalArmor = 0;
}

class level2BarrackTower {
  int maxHP = 100;
  int hitPoints;
  double averageAttackDamage = 3.5;
  int minimumAttackDamage = 3;
  int maximumAttackDamage = 4;
  int speedInNodes = 6;
  double physicalArmor = 25;
}

class level3BarrackTower {
  int maxHP = 150;
  int hitPoints;
  double averageAttackDamage = 8;
  int minimumAttackDamage = 6;
  int maximumAttackDamage = 10;
  int speedInNodes = 6;
  double physicalArmor = 50;
}