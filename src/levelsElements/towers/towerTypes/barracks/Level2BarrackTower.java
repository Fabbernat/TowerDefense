package levelsElements.towers.towerTypes.barracks;

import levels.DamageTypes;
import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public class Level2BarrackTower extends BarrackTower  {
  int cost = 110;
  int sellRefund = Tower.setSellRefundBy(cost);
  int level = 2;

  int soldierCount = thisSoldiersCount;
  int rallyPointRange = thisRallyPointRange;

  public Level2BarrackTower(int cost, int sellRefund) {
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
