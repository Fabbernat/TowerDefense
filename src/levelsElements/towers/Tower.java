package levelsElements.towers;

import levels.DamageTypes;

public abstract class Tower {
  private static final double refundModifier = 0.7;

  private final Type type;
  private int cost;
  private int sellRefund;
  private int level;
  private DamageTypes damageType;

  public Tower(Type type) {
    this.type = type;
  }

  public abstract Type getType();

  public abstract int getCost();

  public abstract int getSellRefund();

  public abstract int getLevel();

  public abstract DamageTypes getDamageType();

  public static int setSellRefundBy(int cost) {
    return (int) (cost * refundModifier);
  }
}
