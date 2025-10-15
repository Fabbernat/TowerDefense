package Kr.levelsElements.towers.towerTypes.bombardier;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.traits.hasSplashRadius;
import Kr.levelsElements.towers.Tower;
import Kr.levelsElements.towers.Type;

public class BombardierTower extends Tower implements hasSplashRadius {
  final Type type = Type.BOMBARDIER;
  int cost;
  int sellRefund;
  int level;
  private final DamageTypes damageType = DamageTypes.SPLASH;

  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed;
  int range;

  double splashRadiusInNodes;

  public BombardierTower(Type type) {
    super(type);
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public int getSellRefund() {
    return sellRefund;
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
  public double getSplashRadiusInNodes() {
    return splashRadiusInNodes;
  }

  @Override
  public void setSplashRadiusInNodes(double splashRadiusInNodes) {
    this.splashRadiusInNodes = splashRadiusInNodes;
  }
}
