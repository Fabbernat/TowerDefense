package levelsElements.towers;

public abstract class Tower {
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
}
