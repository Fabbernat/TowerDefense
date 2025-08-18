package levelsElements.towers.towerTypes.mortar;

import levels.DamageTypes;
import levelsElements.towers.Tower;

public class Level2MortarTower {
  private int cost = 120;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private int level = 2;
  private DamageTypes damageType = DamageTypes.SPLASH;


  private double averageAttackDamage = 33;
  private int minimumAttackDamage = 25;
  private int maximumAttackDamage = 31;
  private double attackSpeed = 5;
  private int range = 60;

  private int minimumRange = 25;

  double splashRadiusInNodes = 4;

}
