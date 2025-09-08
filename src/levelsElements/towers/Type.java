package levelsElements.towers;

import java.util.List;

public enum Type {
  ARCHER,
  BARRACKS,
  MAGE,
  BOMBARDIER,
  INFERNO,
  MORTAR,
  CANNON,
  TESLA,
  HOLY_PALADINS,
  NECROMANCER,
  SORCERER,
  MUSKETEER,
}

enum TowerAbilities {
  ARCHER(List.of(
          new TowerAbility(
                  "Poison Arrows", "The archers inflict their arrows with poison that deals 15 poison damage per second for 3 seconds"),
          new TowerAbility("Fiery Arrows", "Every 20 sec, the archers set an arrow's head on fire that deals 10 extra damage to the target and sets the area on fire for 5 seconds, dealing 10 damage per second")
  )),
  BARRACKS(List.of(
          new TowerAbility("Critical Mass", "20/40/60% chance of dealing 20/40/60 extra damage"),
          new TowerAbility("Explode Instakill", "every 30/26/22 seconds instakill an enemy (closest to goal) with a 1 second delay, and explode dealing 100/250/400 magic damage to nearby enemies")
  )),
  MAGE(List.of(

  )),

  BOMBARDIER(List.of(
          new TowerAbility(
                  "Rockets",
                  "Launches 2/4/6 rockets at a target within 150/170/200% of the range, that deal 90-130 area damage each on a 24/22.5/21 second cooldown. The cooldown decays twice as fast, if there is no enemy in the base range."),
          new TowerAbility(
                  "Cluster Bomb",
                  "Fires a bomb that explodes into 6/8/10 smaller bombs, dealing 30-50 damage each on a 10/9/8 second cooldown")
  )),

  INFERNO(List.of(

  )),

  MORTAR(List.of(
          new TowerAbility(
                  "Hot Soup",
                  "Spills hot soup in a line on the path slowing enemies by 90%-10% (decaying) over 3 seconds, "
                          + "dealing 30/60/90 damage over 3 seconds and burning them for an additional 50/100/150 damage over 5 seconds")
  )),

  CANNON(List.of(
          // empty
  )),

  TESLA(List.of(
          // empty
  )),

  HOLY_PALADINS(List.of(
          // empty
  )),

  NECROMANCER(List.of(

  )),

  SORCERER(List.of(
          new TowerAbility(
                  "Passive: Curse",
                  "Deals 30 damage over 3 seconds to the enemy, 25% of which is true damage"),
          new TowerAbility(
                  "Empowered Curse",
                  "Increases damage to 40/50/60 and true damage ratio to 50/75/100%")
  )),

  MUSKETEER(List.of(
          // empty
  )),

  CONTROL_MAGE(List.of(
          new TowerAbility(
                  "Teleport",
                  "Every 14/12/10 seconds, teleports back up to 3/5/7 enemies back the way 16/19/22 nodes"),
          new TowerAbility(
                  "Polymorph",
                  "Every 25/20/15 seconds, turns the enemy into an innocent pet for 3/4/5 seconds"),
          new TowerAbility(
                  "Time Warp",
                  "Every 22/17/12 seconds turns 3/4/5 enemies into glowing balls for 3 seconds and deals 90/135/180 magic damage to each")
  ));


  private final List<TowerAbility> abilities;

  TowerAbilities(List<TowerAbility> abilities) {
    this.abilities = abilities;
  }

  public List<TowerAbility> getAbilities() {
    return abilities;
  }
}
