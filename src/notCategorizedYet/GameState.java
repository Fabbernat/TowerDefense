package notCategorizedYet;

import levels.Level;

import java.util.ArrayList;

public class GameState {
  int stars = 0;
  ArrayList<Level> levels = new ArrayList<>();

  // only need one of this.
  Upgrades upgrades = new Upgrades();

  void increaseStars(int amount){
    stars += amount;
  }


}
