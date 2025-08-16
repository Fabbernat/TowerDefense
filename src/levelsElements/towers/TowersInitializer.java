package levelsElements.towers;

import levelsElements.towers.towerTypes.archer.Level1ArcherTower;
import levelsElements.towers.towerTypes.archer.Level2ArcherTower;
import levelsElements.towers.towerTypes.archer.Level3ArcherTower;

// to initialize and configure towers
public class TowersInitializer {
  class ArcherInitializer {
    Level1ArcherTower level1ArcherTower = new Level1ArcherTower();
    Level2ArcherTower level2ArcherTower = new Level2ArcherTower();
    Level3ArcherTower level3ArcherTower = new Level3ArcherTower();
  }
  class BarracksInitializer {
    /*
    .
    .
    .
     */
  }
  class MageInitializer {}
  class BombardierInitializer {}
  class InfernoInitializer {}
  class MortarInitializer {}
  class CannonInitializer {}
  class TeslaInitializer {}
  class TwoKnightsInitializer {}

}
