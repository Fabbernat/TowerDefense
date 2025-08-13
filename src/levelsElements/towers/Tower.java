package levelsElements.towers;

public abstract class Tower {
  private static final double refundModifyer = 0.7;

  final Type type;
  int cost;
  int sellRefund;
  int level;

  public Tower(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public int getCost() {
    return cost;
  }

  public int getSellRefund() {
    return sellRefund;
  }

  public int getLevel() {
    return level;
  }

  public static int setSellRefundBy(int cost) {
    return (int) (cost * refundModifyer);
  }
}
