package Kr.levelsElements.towers.towerTypes.bombardier;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;

public class Level2BombardierTower {
  private int cost = 220;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private int level = 2;
  private DamageTypes damageType = DamageTypes.SPLASH;


  private double averageAttackDamage = 33;
  private int minimumAttackDamage = 22;
  private int maximumAttackDamage = 44;
  private double attackSpeed = 3;
  private int range = 27;

  double splashRadiusInNodes = 3;

}
