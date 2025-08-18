package levelsElements.towers.towerTypes.archer;

import levels.DamageTypes;
import levelsElements.towers.Tower;

public class Level1ArcherTower extends ArcherTower {
  private int cost = 70;
  private int sellRefund = Tower.setSellRefundBy(cost);
  private final int level = 1;
  private final DamageTypes damageType = DamageTypes.PHYSICAL;

  private double averageAttackDamage = 5;
  private int minimumAttackDamage = 4;
  private int maximumAttackDamage = 6;
  private double attackSpeed = 1;
  private int range = 20;

  public Level1ArcherTower() {
  }

  public Level1ArcherTower(int cost, int sellRefund, double averageAttackDamage, int minimumAttackDamage, int maximumAttackDamage, double attackSpeed, int range) {
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
