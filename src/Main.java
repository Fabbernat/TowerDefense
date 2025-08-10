import gameElements.enemies.concreteEnemies.Goblin;
import gameElements.enemies.templates.Enemy;

import java.util.ArrayList;

public class Main {



  public static void main(String[] args) {
    Starter.start();
    ArrayList<Enemy> enemies = new ArrayList<>();
    Goblin dobby = new Goblin();
    enemies.add(dobby);

    Goblin sipor = new Goblin();
    sipor.decreaseAttackDamage(100);
    System.out.println(sipor);

    sipor.increaseAttackDamage(200);
    System.out.println(sipor);

    System.out.println(sipor.getHitPoints());

    sipor.decreaseHitPoints(33);
    System.out.println(sipor);

    sipor.increaseHitPoints(11);
    System.out.println(sipor);

    System.out.println(sipor.getHitPoints());

    enemies.add(sipor);


//    for (Enemy enemy : enemies){
//      System.out.println(enemy);
//    }
  }
}
