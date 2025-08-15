package tests;

import levelsElements.enemies.concreteEnemies.Goblin;
import levelsElements.enemies.templates.Enemy;
import notCategorizedYet.Starter;

import java.util.ArrayList;

public class TestGoblins {



  public static void main(String[] args) {
    Starter.start();
    ArrayList<Enemy> enemies = new ArrayList<>();
    Goblin dobby = new Goblin();
    enemies.add(dobby);

    Goblin sipor = new Goblin();
    sipor = (Goblin) sipor.decreaseAttackDamage(sipor,100);
    System.out.println(sipor);

    sipor = (Goblin) sipor.increaseAttackDamage(sipor,200);
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
