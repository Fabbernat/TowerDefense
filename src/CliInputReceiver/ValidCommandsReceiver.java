package CliInputReceiver;

import java.util.*;

public class ValidCommandsReceiver {

  // Valid commands
  private static final Set<String> BASE_COMMANDS = Set.of(
          "clickSlots", "closeSlots"
  );

  private static final Set<String> SLOT_COMMANDS = Set.of(
          "clickSlot", "initializeNewSlot", "attemptToDeleteSlot", "deleteSlot", "cancelDeletingSlot"
  );

  private static final Set<String> TOWERS = Set.of(
          "archer", "barracks", "mage", "bombardier",
          "inferno", "mortar", "cannon", "tesla",
          "holyPaladins", "necromancer", "sorcerer", "musketeer"
  );

  private static final Set<String> BATTLE_ACTIONS = Set.of(
          "viewWaveLaneEnemiesToCome", "callWave", "clickOnFirstSpell", "putFirstSpell", "clickOnSecondSpell",
          "putSecondSpell"
  );

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("KR CLI started. Type 'exit' to quit.");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine().trim();

      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Program exited.");
        break;
      }

      input = input.toLowerCase();
      handleCommand(input);
    }
  }

  private static void handleCommand(String input) {
    // First, check simple base commands
    if (BASE_COMMANDS.contains(input)) {
      System.out.println("Executed base command: " + input);
      return;
    }

    // Check slot-related commands like "clickSlot1"
    for (String cmd : SLOT_COMMANDS) {
      if (input.startsWith(cmd)) {
        String numPart = input.substring(cmd.length());
        if (isInteger(numPart)) {
          int n = Integer.parseInt(numPart);
          if (n >= 1 && n <= 3) {
            System.out.println("Executed slot command: " + cmd + " on slot " + n);
          } else {
            System.out.println("Invalid slot number (must be 1, 2, or 3).");
          }
        } else {
          System.out.println("Invalid format. Example: " + cmd + "1");
        }
        return;
      }
    }

    // Check tower + position, e.g., Archer 15
    for (String tower : TOWERS) {
      if (input.startsWith(tower.toLowerCase())) {
        String remainder = input.substring(tower.length()).trim();
        if (isInteger(remainder)) {
          int pos = Integer.parseInt(remainder);
          if (pos >= 0 && pos <= 30) {
            System.out.println("Placed tower " + tower + " at position " + pos);
          } else {
            System.out.println("Invalid position (must be 0–30).");
          }
        } else {
          System.out.println("Invalid format. Example: " + tower + " 5");
        }
        return;
      }
    }

    // If nothing matched
    System.out.println("Unknown command: " + input);
  }

  private static boolean isInteger(String s) {
    if (s == null || s.isEmpty()) return false;
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
