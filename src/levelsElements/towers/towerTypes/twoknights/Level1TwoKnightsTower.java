package levelsElements.towers.towerTypes.twoknights;

import levels.DamageTypes;
import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public class Level1TwoKnightsTower extends TwoKnightsTower {
  int cost = 70;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 1;

  int soldierCount = thisSoldiersCount;
  int rallyPointRange = thisRallyPointRange;

  public Level1TwoKnightsTower(int cost, int sellRefund) {
    super(cost, sellRefund);
  }

  @Override
  public Type getType() {
    return Type.BARRACKS;
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
    return thisDamageType;
  }
}
