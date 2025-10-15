package Kr.levelsElements.towers.towerTypes.archer;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;
import Kr.levelsElements.towers.Type;

public abstract class ArcherTower extends Tower {

  private final Type type = Type.ARCHER;
  private int cost;
  private int sellRefund;
  private int level;
  private final DamageTypes damageType = DamageTypes.PHYSICAL;


  private double averageAttackDamage;
  private int minimumAttackDamage;
  private int maximumAttackDamage;
  private double attackSpeed;
  private int range;

  public ArcherTower() {
    super(Type.ARCHER);
  }

  public ArcherTower(Type type) {
    super(type);
  }

  public ArcherTower(Type type, int cost, int sellRefund, int level, double averageAttackDamage, int minimumAttackDamage, int maximumAttackDamage, double attackSpeed, int range) {
    super(type);
    this.cost = cost;
    this.sellRefund = sellRefund;
    this.level = level;
    this.averageAttackDamage = averageAttackDamage;
    this.minimumAttackDamage = minimumAttackDamage;
    this.maximumAttackDamage = maximumAttackDamage;
    this.attackSpeed = attackSpeed;
    this.range = range;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public int getSellRefund() {
    return sellRefund;
  }

  public void setSellRefund(int sellRefund) {
    this.sellRefund = sellRefund;
  }

  @Override
  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public DamageTypes getDamageType() {
    return damageType;
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
}

