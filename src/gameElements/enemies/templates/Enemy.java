package gameElements.enemies.templates;

public abstract class Enemy extends EnemyBluePrint {

  public Enemy(){}
  public Enemy(int maxHP, int averageAttackDamage) {
    super(maxHP, averageAttackDamage);
  }

  public Enemy(int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
    super(maxHP, minimumAttackDamage, maximumAttackDamage);
  }
}
