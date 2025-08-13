package levelsElements.towers.towerTypes;

import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public abstract class ArcherTower extends Tower {

  final Type type = Type.ARCHER;
  int cost;
  int sellRefund;
  int level;

  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed;
  int range;


  public ArcherTower(Type type) {
    super(type);
  }
}

class Level1ArcherTower {
  int cost = 70;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 1;

  double averageAttackDamage = 5;
  int minimumAttackDamage = 4;
  int maximumAttackDamage = 6;
  double attackSpeed = 1;
  int range = 20;
}

class Level2ArcherTower {
  int cost = 110;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 2;

  double averageAttackDamage = 9;
  int minimumAttackDamage = 7;
  int maximumAttackDamage = 11;
  double attackSpeed = 0.8;
  int range = 24;
}

class Level3ArcherTower {
  int cost = 160;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 3;

  double averageAttackDamage = 14.5;
  int minimumAttackDamage = 11;
  int maximumAttackDamage = 18;
  double attackSpeed = 0.7;
  int range = 28;
}