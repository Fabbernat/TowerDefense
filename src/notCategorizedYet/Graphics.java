package notCategorizedYet;

enum Graphics {
  LOADING_SCREEN("views/loadingScreen.png"),
  MAIN_MENU("views/mainMenu.png"),
  WORLD_MAP("views/worldMap.png"),
  LEVEL1("views/levels/level1.png"),
  GOBLIN1("sprites/enemies/goblin.png"),
  SHAMAN1("sprites/enemies/shaman.png"),
  WULF1("sprites/enemies/wulf.png"),
  ARCHER_LEVEL1("sprites/towers/archerTowerLevel1.png"),
  BARRACK_LEVEL1("sprites/towers/barrackTowerLevel1.png"),
  MAGE_LEVEL1("sprites/towers/mageTowerLevel1.png"),
  BOMBARDIER_LEVEL1("sprites/towers/bombardierTowerLevel1.png");

  private final String path;

  Graphics(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }
}