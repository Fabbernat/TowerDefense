package Kr.levelsElements.towers.towerTypes.twoknights;

import Kr.levels.DamageTypes;
import Kr.levelsElements.towers.Tower;
import Kr.levelsElements.towers.Type;

public abstract class TwoKnightsTower extends Tower {

  final Type type = Type.HOLY_PALADINS;
  private int cost;
  private int sellRefund;
  private int level;

  private double averageAttackDamage;
  private int minimumAttackDamage;
  private int maximumAttackDamage;
  private double attackSpeed;
  private int rallyPointRange;

  protected final int thisSoldiersCount = 2;
  protected final int thisRallyPointRange = 23;
  protected final DamageTypes thisDamageType = DamageTypes.PHYSICAL;
  
  public TwoKnightsTower(Type type) {
    super(type);
  }

  public TwoKnightsTower(int cost, int sellRefund) {
    super(Type.BARRACKS);
    this.cost = cost;
    this.sellRefund = sellRefund;
  }
}

