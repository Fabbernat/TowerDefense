package CliInputReceiver;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ValidCommands {
  private static final Set<String> baseCommands = Set.of(
          "clickSlots", "closeSlots"
  );

  private static final Set<String> slotCommands = Set.of(
          "clickSlot", "initializeNewSlot", "attemptToDeleteSlot",
          "deleteSlot", "cancelDeletingSlot"
  );

  private static final Set<String> towers = Set.of(
          "archer", "barracks", "mage", "bombardier",
          "inferno", "mortar", "cannon", "tesla",
          "holyPaladins", "necromancer", "sorcerer", "musketeer"
  );

  private static final Set<String> battleActionsWith0 = Set.of(
          "viewWaveLaneEnemiesToCome", "callWave",
          "clickOnFirstSpell", "putFirstSpell",
          "clickOnSecondSpell", "putSecondSpell"
  );

  private static final Set<String> battleActionsWith1 = Set.of(
    "kill"
  );

  // --- Wrappers ---
  public static final Set<String> BASE_COMMANDS =
          toUnmodifiableLowercaseSet(baseCommands);

  public static final Set<String> SLOT_COMMANDS =
          toUnmodifiableLowercaseSet(slotCommands);

  public static final Set<String> TOWERS =
          toUnmodifiableLowercaseSet(towers);

  public static final Set<String> BATTLE_ACTIONS0 =
          toUnmodifiableLowercaseSet(battleActionsWith0);

  public static final Set<String> BATTLE_ACTIONS1 =
          toUnmodifiableLowercaseSet(battleActionsWith1);

  // --- Global collector ---
  public static final Set<String> ALL_COMMANDS = collectAllCommandSets();


  // --- Helpers ---

  private static Set<String> toUnmodifiableLowercaseSet(Set<String> input) {
    return Collections.unmodifiableSet(
            (Set<? extends String>) input.stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toCollection(LinkedHashSet::new))
    );
  }


  private static Set<String> collectAllCommandSets() {
    Set<String> all = new HashSet<>();
    try {
      for (Field field : ValidCommands.class.getDeclaredFields()) {
        // Collect only uppercase public sets
        if (Modifier.isStatic(field.getModifiers())
                && Modifier.isFinal(field.getModifiers())
                && Set.class.isAssignableFrom(field.getType())
                && field.getName().equals(field.getName().toUpperCase()) // only uppercase
                && !field.getName().equals("ALL_COMMANDS")) { // skip self
          @SuppressWarnings("unchecked")
          Set<String> subset = (Set<String>) field.get(null);
          all.addAll(subset);
        }
      }
    } catch (IllegalAccessException e) {
      throw new RuntimeException("Reflection failed while collecting commands", e);
    }
    return Collections.unmodifiableSet(all);
  }
}
