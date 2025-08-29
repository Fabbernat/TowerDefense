package levelsElements.towers;

public class TowerAbility {
  private final String name;
  private final String description;

  public TowerAbility(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() { return name; }
  public String getDescription() { return description; }

  @Override
  public String toString() {
    return name + ": " + description;
  }
}
