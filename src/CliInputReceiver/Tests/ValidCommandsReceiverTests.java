package CliInputReceiver.Tests;

import CliInputReceiver.ValidCommands;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class ValidCommandsReceiverTests {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("KR CLI started. Type 'exit' to quit.");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine().trim();
      input = input.toLowerCase();

      String farewellMessage = "Goodbye Defender!";
      if (currentWave > 15) {
        System.out.println("Game finished! " + farewellMessage);
        break;
      }
      if ("exit".equals(input) || "quit".equals(input)) {
        System.out.println(farewellMessage);
        break;
      }

      handleCommand(input);
    }
  }

  static int currentWave = 1;

  private static void handleCommand(String input) {

    if (input.isEmpty())
      return;

    // First, check simple base commands
    if (ValidCommands.BASE_COMMANDS.contains(input)) {
      System.out.println("Executed base command: " + input);
      return;
    }

    // Check slot-related commands like "clickSlot1"
    for (String cmd : ValidCommands.SLOT_COMMANDS) {
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


    // Check 0 param battle action commands like "callWave"
    for (String cmd : ValidCommands.BATTLE_ACTIONS0) {
      if (input.startsWith(cmd)) {
        if ("callwave".equals(cmd))
          ++currentWave;
        report("Executed battle action: `" + cmd + "`");
        return;
      }
    }

    // Check 1 param battle action commands
    for (String cmd : ValidCommands.BATTLE_ACTIONS1) {
      if (input.startsWith(cmd.toLowerCase())) {
        String enemy = getRemainder(input, cmd);
        Set<String> enemies = Set.of("goblin", "orc", "wulf");
        String exampleEnemy = enemies.iterator().next();

        if (enemy.isEmpty()) {
          System.out.println("Invalid format. Example: " + cmd + ' ' + exampleEnemy);
        }
        if (enemies.contains(enemy)) {
          int bountyGold = 50;
          report("Killed enemy " + enemy + " giving you " + bountyGold + " gold.");
          gold += 50;
        } else {
          System.out.println("Invalid enemy. Must be one of these: \n" + enemies);
        }
        return;
      }
    }

    // Check tower + position, e.g., Archer 15
    for (String tower : ValidCommands.TOWERS) {
      if (input.startsWith(tower.toLowerCase())) {
        String remainder = getRemainder(input, tower);
        if (isInteger(remainder)) {
          int pos = Integer.parseInt(remainder);
          if (pos >= 0 && pos <= 30) {
            gold -= 100; // TODO gold -= tower.price();
            report("Placed tower " + tower + " at position " + pos);
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

  private static String getRemainder(String input, String cmd) {
    return input.substring(cmd.length()).trim();
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


  // fields for report
  private static int hearts = 20;
  private static int gold = 700;
  private static String tabulators = "\t\t\t\t\t\t\t\t";


  /**
   * Reports the message passed in parameter along with hearts, gold, wave and other metadata.
   * * Overloadable method with helper fields declared above
   **/
  private static void report(String message) {

    StringBuilder builder = new StringBuilder();
    builder.append("|--- ").append(hearts).append(" hearts | ").append(gold).append(" gold | ").append(currentWave).append("th wave").append( " ---|").append(tabulators).append("\n")
            .append(message);
    System.out.println(builder);
  }

  private void report(String message, int heartsLoss) {

    StringBuilder builder = new StringBuilder();
    hearts = Math.max(0, hearts - heartsLoss);
    builder.append(hearts).append(" hearts | ").append(gold).append(" gold | ").append(currentWave).append("th wave ").append(tabulators).append("\n")
            .append(message);
    System.out.println(builder);
  }
}
