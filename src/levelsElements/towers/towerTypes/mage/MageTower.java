package levelsElements.towers.towerTypes.mage;

import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public abstract class MageTower extends Tower {

  final Type type = Type.MAGE;
  int cost;
  int sellRefund;
  int level;

  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed;
  int range;


  public MageTower(Type type) {
    super(type);
  }
}

class Level1MageTower {
  int cost = 100;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 1;

  double averageAttackDamage = 13;
  int minimumAttackDamage = 9;
  int maximumAttackDamage = 17;
  double attackSpeed = 1.8;
  int range = 17;
}

class Level2MageTower {
  int cost = 160;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 2;

  double averageAttackDamage = 33;
  int minimumAttackDamage = 23;
  int maximumAttackDamage = 43;
  double attackSpeed = 1.6;
  int range = 21;
}

class Level3MageTower {
  int cost = 240;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 3;

  double averageAttackDamage = 57;
  int minimumAttackDamage = 40;
  int maximumAttackDamage = 74;
  double attackSpeed = 1.5;
  int range = 25;
}