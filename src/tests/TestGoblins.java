package tests;

import levelsElements.enemies.concreteEnemies.Goblin;
import levelsElements.enemies.templates.Enemy;
import notCategorizedYet.Starter;

import java.util.ArrayList;

public class TestGoblins {


  static boolean isAcceptableMargin(double difference) {
    return Math.abs(difference) < 5;
  }

  static void log(Object object) {
    System.out.println(object);
  }

  public static void main(String[] args) {
    Starter.start();
    ArrayList<Enemy> enemies = new ArrayList<>();

    Goblin dobby = new Goblin();
    enemies.add(dobby);
    Goblin sipor = new Goblin();
    double before = sipor.currentAttackDamage.average();
    log(sipor);
    sipor.decreaseAttackDamage(100);
    double after = sipor.currentAttackDamage.average();
    assert isAcceptableMargin(after - before);
    log(sipor);
    sipor.resetAttackDamage();
    log(sipor);
    before = sipor.currentAttackDamage.average();
    sipor.increaseAttackDamage(200);
    after = sipor.currentAttackDamage.average();
    assert isAcceptableMargin(after - before);
    log(sipor);

    log(sipor.getHitPoints());

    sipor.decreaseHitPoints(33);
    System.out.println(sipor);

    sipor.increaseHitPoints(11);
    System.out.println(sipor);

    System.out.println(sipor.getHitPoints());

    enemies.add(sipor);


    for (Enemy enemy : enemies) {
      System.out.println(enemy);
    }
  }
}
