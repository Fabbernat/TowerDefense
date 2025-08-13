package levelsElements.towers.towerTypes;

import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public abstract class ArcherTower extends Tower {

  final Type type = Type.ARCHER;
  int cost;
  int sellRefund;
  int level;

  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  int range;


  public ArcherTower(Type type) {
    super(type);
  }
}
