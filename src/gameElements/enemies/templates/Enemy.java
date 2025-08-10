package gameElements.enemies.templates;

public abstract class Enemy extends EnemyBluePrint {

  private int maxHP;
  private int hitPoints;
  int minimumAttackDamage;
  double averageAttackDamage;
  int maximumAttackDamage;

  public Enemy(){}

  public Enemy(final int maxHP, int averageAttackDamage) {
    super(maxHP, averageAttackDamage);
  }

  public Enemy(final int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
    super(maxHP, minimumAttackDamage, maximumAttackDamage);
  }

  @Override
  public String toString() {
    return "Enemy{" +
            "maxHP=" + maxHP +
            ", hitPoints=" + hitPoints +
            ", minimumAttackDamage=" + minimumAttackDamage +
            ", averageAttackDamage=" + averageAttackDamage +
            ", maximumAttackDamage=" + maximumAttackDamage +
            '}';
  }
}
