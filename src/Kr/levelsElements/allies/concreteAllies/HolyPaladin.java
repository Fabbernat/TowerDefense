package Kr.levelsElements.allies.concreteAllies;

public abstract class HolyPaladin {
  int maxHP;
  int hitPoints;
  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed = 2;
  
  int speedInNodes = 4;
  double physicalArmor;

  public HolyPaladin(){}

  public HolyPaladin(int maxHP, int averageAttackDamage) {
    this.maxHP = maxHP;
    this.hitPoints = maxHP;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = (int) (averageAttackDamage * 0.8);
    this.maximumAttackDamage = (int) (averageAttackDamage * 1.2);
  }

  public HolyPaladin(int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
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

class level1HolyPaladin extends HolyPaladin {
  int maxHP = 100;
  int hitPoints;
  double averageAttackDamage = 2;
  int minimumAttackDamage = 1;
  int maximumAttackDamage = 3;
  double attackSpeed = 2;

  int speedInNodes = 4;
  double physicalArmor = 40;


}

class level2HolyPaladin extends HolyPaladin {
  int maxHP = 175;
  int hitPoints;
  double averageAttackDamage = 3.5;
  int minimumAttackDamage = 3;
  int maximumAttackDamage = 4;
  double attackSpeed = 2;

  int speedInNodes = 4;
  double physicalArmor = 50;


}

class level3HolyPaladin extends HolyPaladin {
  int maxHP = 250;
  int hitPoints;
  double averageAttackDamage = 8;
  int minimumAttackDamage = 6;
  int maximumAttackDamage = 10;
  double attackSpeed = 2;

  int speedInNodes = 4;
  double physicalArmor = 60;


}