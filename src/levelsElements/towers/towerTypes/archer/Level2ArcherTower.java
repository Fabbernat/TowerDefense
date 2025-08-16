package levelsElements.towers.towerTypes.archer;

import levelsElements.towers.Tower;

public class Level2ArcherTower {
  int cost = 110;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 2;

  double averageAttackDamage = 9;
  int minimumAttackDamage = 7;
  int maximumAttackDamage = 11;
  double attackSpeed = 0.8;
  int range = 24;
}
