package tests;

import levelsElements.enemies.concreteEnemies.Goblin;
import levelsElements.enemies.templates.Enemy;
import notCategorizedYet.Starter;

import java.util.ArrayList;

public class TestGoblins {


    static boolean isAcceptableMargin(double difference){
        return Math.abs(difference) < 5;
    }

    static void log(Object object){
        System.out.println(object);
    }

  public static void main(String[] args) {
    Starter.start();
    ArrayList<Enemy> enemies = new ArrayList<>();
    Goblin dobby = new Goblin();
    enemies.add(dobby);

    Goblin sipor = new Goblin();

    double atckDamageBefore = sipor.getAverageAttackDamage();
      log(sipor);

      sipor.decreaseAverageAttackDamage(100);
    assert isAcceptableMargin(sipor.getAverageAttackDamage() - atckDamageBefore);
    log(sipor);

    sipor.increaseAverageAttackDamage(200);
    System.out.println(sipor);

    System.out.println(sipor.getHitPoints());

    sipor.decreaseHitPoints(33);
    System.out.println(sipor);

    sipor.increaseHitPoints(11);
    System.out.println(sipor);

    System.out.println(sipor.getHitPoints());

    enemies.add(sipor);


    for (Enemy enemy : enemies){
      System.out.println(enemy);
    }
  }
}
