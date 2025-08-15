package levelsElements.enemies.templates;

public abstract class Enemy extends EnemyBluePrint {

  int maxHP;
  int hitPoints;
  int minimumAttackDamage;
  double averageAttackDamage;
  int maximumAttackDamage;

  int speedInNodes = 3;
  double physicalArmor = 0;
  double magicArmor = 0;

  public Enemy(){}

  public Enemy(final int maxHP, int averageAttackDamage) {
    super(maxHP, averageAttackDamage);
  }

  public Enemy(final int maxHP, int minimumAttackDamage, int maximumAttackDamage) {
    super(maxHP, minimumAttackDamage, maximumAttackDamage);
  }

  public void setAverageAttackDamage(double damage) {
    this.averageAttackDamage = damage;
  }
  public void setMinimumAttackDamage(int damage) {
    this.minimumAttackDamage = damage;
  }
  public void setMaximumAttackDamage(int damage) {
    this.maximumAttackDamage = damage;
  }

  public void increaseHitPoints(int amount) {
    this.hitPoints += amount;

    if (hitPoints > maxHP) {
      hitPoints = maxHP;
    }
  }

  public void decreaseHitPoints(int amount) {
    this.hitPoints -= amount;

    if (hitPoints < 0) {
      hitPoints = 0;
    }
  }

  public double getAverageAttackDamage() {
    return averageAttackDamage;
  }

  public int getMinimumAttackDamage() {
    return minimumAttackDamage;
  }

  public int getMaximumAttackDamage() {
    return maximumAttackDamage;
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
