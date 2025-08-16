package levelsElements.towers.towerTypes.archer;

import levels.DamageTypes;
import levelsElements.towers.Tower;
import levelsElements.towers.Type;

public abstract class ArcherTower extends Tower {

  final Type type = Type.ARCHER;
  int cost;
  int sellRefund;
  int level;
  private DamageTypes damageType = DamageTypes.PHYSICAL;


  double averageAttackDamage;
  int minimumAttackDamage;
  int maximumAttackDamage;
  double attackSpeed;
  int range;

  public ArcherTower() {
    super(Type.ARCHER);
  }

  public ArcherTower(Type type) {
    super(type);
  }

  @Override
  public Type getType() {
    return type;
  }
}

