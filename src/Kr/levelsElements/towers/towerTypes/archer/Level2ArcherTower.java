package Kr.levelsElements.towers.towerTypes.archer;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;

public class Level2ArcherTower extends ArcherTower {
  private int cost = 110;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private final int level = 2;
  private final DamageTypes damageType = DamageTypes.PHYSICAL;

  private double averageAttackDamage = 9;
  private int minimumAttackDamage = 7;
  private int maximumAttackDamage = 11;
  private double attackSpeed = 0.8;
  private int range = 24;

  public Level2ArcherTower() {
  }

  public Level2ArcherTower(int cost, int sellRefund, double averageAttackDamage, int minimumAttackDamage, int maximumAttackDamage, double attackSpeed, int range) {
    this.cost = cost;
    this.sellRefund = sellRefund;
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
}
