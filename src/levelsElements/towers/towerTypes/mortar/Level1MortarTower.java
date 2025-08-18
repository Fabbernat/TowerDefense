package levelsElements.towers.towerTypes.mortar;

import levels.DamageTypes;
import levelsElements.towers.Tower;
import levelsElements.towers.towerTypes.archer.ArcherTower;

public class Level1MortarTower extends ArcherTower {
  private int cost = 60;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private int level = 1;
  private DamageTypes damageType = DamageTypes.SPLASH;


  private double averageAttackDamage = 11.5;
  private int minimumAttackDamage = 10;
  private int maximumAttackDamage = 13;
  private double attackSpeed = 5;
  private int range = 50;

  private int minimumRange = 25;

  double splashRadiusInNodes = 3;

  public Level1MortarTower() {
  }

  public Level1MortarTower(int cost, int sellRefund, int level, double averageAttackDamage, int minimumAttackDamage, int maximumAttackDamage, double attackSpeed, int range) {
    this.cost = cost;
    this.sellRefund = sellRefund;
    this.level = level;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = minimumAttackDamage;
    this.maximumAttackDamage = maximumAttackDamage;
    this.attackSpeed = attackSpeed;
    this.range = range;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getSellRefund() {
    return sellRefund;
  }

  public void setSellRefund(int sellRefund) {
    this.sellRefund = sellRefund;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public double getAverageAttackDamage() {
    return averageAttackDamage;
  }

  public void setAverageAttackDamage(double averageAttackDamage) {
    this.averageAttackDamage = averageAttackDamage;
  }

  public int getMinimumAttackDamage() {
    return minimumAttackDamage;
  }

  public void setMinimumAttackDamage(int minimumAttackDamage) {
    this.minimumAttackDamage = minimumAttackDamage;
  }

  public int getMaximumAttackDamage() {
    return maximumAttackDamage;
  }

  public void setMaximumAttackDamage(int maximumAttackDamage) {
    this.maximumAttackDamage = maximumAttackDamage;
  }

  public double getAttackSpeed() {
    return attackSpeed;
  }

  public void setAttackSpeed(double attackSpeed) {
    this.attackSpeed = attackSpeed;
  }

  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  @Override
  public DamageTypes getDamageType() {
    return damageType;
  }

  public void setDamageType(DamageTypes damageType) {
    this.damageType = damageType;
  }
}
