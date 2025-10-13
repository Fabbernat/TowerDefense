package Kr.levelsElements.towers.towerTypes.mortar;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;

public class Level3MortarTower {
  private int cost = 220;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private int level = 3;
  private DamageTypes damageType = DamageTypes.SPLASH;


  private double averageAttackDamage = 49.5;
  private int minimumAttackDamage = 55;
  private int maximumAttackDamage = 64;
  private double attackSpeed = 5;
  private int range = 70;

  private int minimumRange = 25;


  double splashRadiusInNodes = 5;

}
