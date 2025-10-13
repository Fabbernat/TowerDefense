package Kr.levelsElements.towers.towerTypes.archer;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;

public class Level3ArcherTower extends ArcherTower {
  int cost = 160;
  int sellRefund = Tower.setSellRefundBy(cost);
  final int level = 3;
  private final DamageTypes damageType = DamageTypes.PHYSICAL;

  double averageAttackDamage = 14.5;
  int minimumAttackDamage = 11;
  int maximumAttackDamage = 18;
  double attackSpeed = 0.7;
  int range = 28;

  public Level3ArcherTower() {
  }

  public Level3ArcherTower(int cost, int sellRefund, double averageAttackDamage, int minimumAttackDamage, int maximumAttackDamage, double attackSpeed, int range) {
    this.cost = cost;
    this.sellRefund = sellRefund;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = minimumAttackDamage;
    this.maximumAttackDamage = maximumAttackDamage;
    this.attackSpeed = attackSpeed;
    this.range = range;
  }

  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public int getSellRefund() {
    return sellRefund;
  }

  @Override
  public void setSellRefund(int sellRefund) {
    this.sellRefund = sellRefund;
  }

  @Override
  public int getLevel() {
    return level;
  }

  @Override
  public DamageTypes getDamageType() {
    return damageType;
  }

  @Override
  public double getAverageAttackDamage() {
    return averageAttackDamage;
  }

  @Override
  public void setAverageAttackDamage(double averageAttackDamage) {
    this.averageAttackDamage = averageAttackDamage;
  }

  @Override
  public int getMinimumAttackDamage() {
    return minimumAttackDamage;
  }

  @Override
  public void setMinimumAttackDamage(int minimumAttackDamage) {
    this.minimumAttackDamage = minimumAttackDamage;
  }

  @Override
  public int getMaximumAttackDamage() {
    return maximumAttackDamage;
  }

  @Override
  public void setMaximumAttackDamage(int maximumAttackDamage) {
    this.maximumAttackDamage = maximumAttackDamage;
  }

  @Override
  public double getAttackSpeed() {
    return attackSpeed;
  }

  @Override
  public void setAttackSpeed(double attackSpeed) {
    this.attackSpeed = attackSpeed;
  }

  @Override
  public int getRange() {
    return range;
  }

  @Override
  public void setRange(int range) {
    this.range = range;
  }
}
