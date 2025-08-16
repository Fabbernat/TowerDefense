package levelsElements.towers.towerTypes.archer;

import levelsElements.towers.Tower;

public class Level3ArcherTower {
  int cost = 160;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 3;

  double averageAttackDamage = 14.5;
  int minimumAttackDamage = 11;
  int maximumAttackDamage = 18;
  double attackSpeed = 0.7;
  int range = 28;
}
