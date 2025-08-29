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
  BARRACKS(List.of()),
  MAGE(
          "critical mass":"20/40/60% chance of dealing 20/40/60 extra damage"
          "explode instakill":"every 30/26/22 seconds instakill an enemy (closest to goal) with a 1 second delay, and explode dealing 100/250/400 magic damage to nearby enemies"
          ),

  BOMBARDIER(
          "rockets"
                  "cluster bomb"
  ),

  INFERNO(),

  MORTAR(
          "hot soup":"spills hot soup in a line to the path slowing them by 90%-10% (decaying) over 3 seconds, dealing 30/60/90 damage over 3 seconds and burning them for an additional 50/100/150 damage over 5 seconds."
  ),

  CANNON(),

  TESLA(),

  HOLY_PALADINS(),

  NECROMANCER(),

  SORCERER(
          "Passive:curse":"deal 30 damage over 3 seconds to the enemy, 25% of which is true damage"
                  "empowered curse":"increase damage to 45/60/75 and true damage ratio to 50/75/100%"
  ),

  MUSKETEER(),

  CONTROL_MAGE(
          "Teleport":"every 14/12/10 seconds, teleports back up to 3/5/7 enemies back the way 16/19/22 nodes"
                  "Polymorph":"every 25/20/15 seconds, turns the enemy into an innocent pet for 3/4/5 seconds"
                  "time warp":"every 22/17/12 seconds turns 3/4/5 enemies into glowing balls for 3 seconds and deals 90/135/180 magic damage to each"
  )
}
