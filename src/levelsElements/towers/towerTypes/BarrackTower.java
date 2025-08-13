package levelsElements.towers.towerTypes;

import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public abstract class BarrackTower extends Tower {

  final Type type = Type.BARRACKS;
  int cost;
  int sellRefund;
  int level;

  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed;
  int rallyPointRange;
  
  
  public BarrackTower(Type type) {
    super(type);
  }
}

class Level1BarrackTower {
  int cost = 70;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 1;

  int soldierCount = 3;
  int rallyPointRange = 20;
}

class Level2BarrackTower {
  int cost = 110;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 2;

  int soldierCount = 3;
  int rallyPointRange = 20;
}

class Level3BarrackTower {
  int cost = 160;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 3;

  int soldierCount = 3;
  int rallyPointRange = 20;
}
