package levelsElements.enemies.templates;

public abstract class Enemy extends EnemyBluePrint {

  // base value (useful for reset)
  final int maxHP;

  // current value
  int hitPoints;

  // base values (useful for reset)
  private final AttackDamage baseAttackDamage;

  // current values
  private AttackDamage currentAttackDamage;


  int speedInNodes = 3;
  double physicalArmor = 0;
  double magicArmor = 0;

  public Enemy(int maxHP, AttackDamage baseAttackDamage){
    this.maxHP = maxHP;
    this.baseAttackDamage = baseAttackDamage;
    currentAttackDamage = baseAttackDamage;
  }

  public Enemy(final int maxHP, int averageAttackDamage, int maxHP1, AttackDamage baseAttackDamage) {
    super(maxHP, averageAttackDamage);
    this.maxHP = maxHP1;
    this.baseAttackDamage = baseAttackDamage;
    currentAttackDamage = baseAttackDamage;
  }

  public Enemy(final int maxHP, int minimumAttackDamage, int maximumAttackDamage, int maxHP1, AttackDamage baseAttackDamage) {
    super(maxHP, minimumAttackDamage, maximumAttackDamage);
    this.maxHP = maxHP1;
    this.baseAttackDamage = baseAttackDamage;
    currentAttackDamage = baseAttackDamage;
  }

  public Enemy() {
    maxHP = 0;
    baseAttackDamage = new AttackDamage(0, 0, 0);
  }


  /**
   * @param percentage must be an integer, so 10 means a 10-percent boost to damage, and 200 means 200% more damage
   */

  public void increaseAttackDamage(int percentage) {
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.scaleUpAttackDamage(before, percentage);
    currentAttackDamage = after;
  }

  /**
   * @param percentage must be an integer between 0 and 100. 10 means a 10-percent decrease to damage, and 100 means 0 damage - no damage at all.
   */
  public void decreaseAttackDamage(int percentage) {
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.scaleDownAttackDamage(before, percentage);
    currentAttackDamage = after;
  }


  public void increaseAttackDamageByFlat(int flatAmount){
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.increaseAttackDamageByFlat(before, flatAmount);
    currentAttackDamage = after;
  }

  public void decreaseAttackDamageByFlat(int flatAmount){
    AttackDamage before = currentAttackDamage;
    AttackDamage after = EnemyAttackDamageModifier.decreaseAttackDamageByFlat(before, flatAmount);
    currentAttackDamage = after;
  }


  public void resetAttackDamage(){
    currentAttackDamage = baseAttackDamage;
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


  @Override
  public String toString() {
    return "Enemy{" +
            "maxHP=" + maxHP +
            ", hitPoints=" + hitPoints +
            ", minimumAttackDamage=" + currentAttackDamage.min() +
            ", averageAttackDamage=" + currentAttackDamage.average() +
            ", maximumAttackDamage=" + currentAttackDamage.max() +
            '}';
  }


}
