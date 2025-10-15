package Kr.levelsElements.towers.towerTypes.barracks;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;
import Kr.levelsElements.towers.Type;

public abstract class BarrackTower extends Tower {

  final Type type = Type.BARRACKS;
  private int cost;
  private int sellRefund;
  private int level;

  private double averageAttackDamage;
  private int minimumAttackDamage;
  private int maximumAttackDamage;
  private double attackSpeed;
  private int rallyPointRange;

  protected final int thisSoldiersCount = 3;
  protected final int thisRallyPointRange = 20;
  protected final DamageTypes thisDamageType = DamageTypes.PHYSICAL;
  
  public BarrackTower(Type type) {
    super(type);
  }

  public BarrackTower(int cost, int sellRefund) {
    super(Type.BARRACKS);
    this.cost = cost;
    this.sellRefund = sellRefund;
  }
}

