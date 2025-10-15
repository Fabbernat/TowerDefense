package Kr.levelsElements.towers.towerTypes.bombardier;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;

public class Level3BombardierTower {
  private int cost = 320;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private int level = 3;
  private DamageTypes damageType = DamageTypes.SPLASH;


  private double averageAttackDamage = 49.5;
  private int minimumAttackDamage = 33;
  private int maximumAttackDamage = 66;
  private double attackSpeed = 3;
  private int range = 31;

  double splashRadiusInNodes = 3;

}
