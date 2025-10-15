package Kr.levelsElements.towers;

import Kr.levelsElements.towers.towerTypes.archer.Level1ArcherTower;
import Kr.levelsElements.towers.towerTypes.archer.Level2ArcherTower;
import Kr.levelsElements.towers.towerTypes.archer.Level3ArcherTower;
import Kr.levelsElements.towers.towerTypes.barracks.Level1BarrackTower;
import Kr.levelsElements.towers.towerTypes.barracks.Level2BarrackTower;
import Kr.levelsElements.towers.towerTypes.barracks.Level3BarrackTower;

// to initialize and configure towers
public class TowersInitializer {
  int cost;

  class ArcherInitializer {
    boolean ChepaerByTen = false;

    public ArcherInitializer() {


      cost = 70;
      cost = corrigateIfNeeded(cost);
      Level1ArcherTower level1ArcherTower = new Level1ArcherTower(cost, Tower.setSellRefundBy(cost), 5, 4, 6, 1, 20);


      cost = 110;
      cost = corrigateIfNeeded(cost);
      Level2ArcherTower level2ArcherTower = new Level2ArcherTower(cost, Tower.setSellRefundBy(cost), 9, 7, 11, 0.8, 24);


      cost = 160;
      cost = corrigateIfNeeded(cost);
      Level3ArcherTower level3ArcherTower = new Level3ArcherTower(cost, Tower.setSellRefundBy(cost), 14.5, 11, 18, 0.7, 28);
    }

    private int corrigateIfNeeded(int cost) {
      if (isCheaperByTen()) {
        cost -= 10;
      }
      return cost;
    }

    public boolean isCheaperByTen() {
      return ChepaerByTen;
    }
  }

  class BarracksInitializer {
    public BarracksInitializer() {
      cost = 70;

      Level1BarrackTower Level1BarrackTower = new Level1BarrackTower(cost, Tower.setSellRefundBy(cost));


      cost = 110;


      Level2BarrackTower Level2BarrackTower = new Level2BarrackTower(cost, Tower.setSellRefundBy(cost));


      cost = 160;

      Level3BarrackTower level3BarrackTower = new Level3BarrackTower(cost, Tower.setSellRefundBy(cost));
    }
  }


  class MageInitializer {
  }

  class BombardierInitializer {
  }

  class InfernoInitializer {
  }

  class MortarInitializer {
  }

  class CannonInitializer {
  }

  class TeslaInitializer {
  }

  class TwoKnightsInitializer {
  }

}
