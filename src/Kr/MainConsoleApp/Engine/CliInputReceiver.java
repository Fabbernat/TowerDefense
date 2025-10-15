package Kr.MainConsoleApp.Engine;

import Kr.MainConsoleApp.Storage.ValidCommands;

import java.util.Scanner;
import java.util.Set;

import static Kr.MainConsoleApp.App.log;


public class CliInputReceiver {

  static String farewellMessage = "Goodbye Defender!";

  public static void run() {
    Scanner scanner = new Scanner(System.in);
    log("Kingdom Rush CLI started. Type 'help' to get the list of available commands. Examples: \n'add <tower_name>' to add a tower; \n'kill <enemy_name>' to destroy an enemy; \n'exit' to quit.");

    report();
    while (true) {
      if (currentWave > 14) {
        break;
      }

      System.out.print("> ");
      String input = scanner.nextLine().trim();
      input = input.toLowerCase();

      if ("exit".equals(input) || "quit".equals(input)) {
        log(farewellMessage);
        break;
      }

      handleCommand(input);
    }
    log("Press any key to exit...");
    scanner.nextLine();
  }

  static int currentWave = 1;

  private static void handleCommand(String input) {

    if (input.isEmpty())
      return;

    if (input.equals("help")) {
        log("Available commands:" + ValidCommands.ALL_COMMANDS);
        return;
    }

    // First, check simple base commands
    if (ValidCommands.BASE_COMMANDS.contains(input)) {
      log("Executed base command: " + input);
      return;
    }

    // Check slot-related commands like "clickSlot1"
    for (String cmd : ValidCommands.SLOT_COMMANDS) {
      if (input.startsWith(cmd)) {
        String numPart = input.substring(cmd.length());
        if (isInteger(numPart)) {
          int n = Integer.parseInt(numPart);
          if (n >= 1 && n <= 3) {
            log("Executed slot command: " + cmd + " on slot " + n);
          } else {
            log("Invalid slot number (must be 1, 2, or 3).");
          }
        } else {
          log("Invalid format. Example: " + cmd + "1");
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
        if (currentWave > 14) {
          log("Game finished! " + farewellMessage);
          return;
        }
        return;
      }
    }

    // Check 1 param battle action commands
    for (String cmd : ValidCommands.BATTLE_ACTIONS1) {
      if (input.startsWith(cmd.toLowerCase())) {
        String enemy = getRemainder(input, cmd);
        Set<String> enemies = ValidCommands.ENEMIES;
        String exampleEnemy = enemies.iterator().next();

        if (enemy.isEmpty()) {
          log("Invalid format. Example: " + cmd + ' ' + exampleEnemy);
          return;
        }
        if (enemies.contains(enemy)) {
          int bountyGold = 50;
          report("Killed enemy " + enemy + " giving you " + bountyGold + " gold.");
          gold += 50;
        } else {
          log("Invalid enemy. Must be one of these: \n" + enemies);
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
            log("Invalid position (must be 0–30).");
          }
        } else {
          log("Invalid format. Example: " + tower + " 5");
        }
        return;
      }
    }

    // If nothing matched
    log("Unknown command: " + input);
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
     * Reports the current status: hearts, gold, wave.
     * * Overloadable method with helper fields declared above
     **/
    private static void report() {
      log("|--- " + hearts + " hearts | " + gold + " gold | " + currentWave + "th wave" + " ---|" + tabulators + "\n");
    }

  /**
   * Reports the message passed in parameter along with hearts, gold, wave and other metadata.
   * * Overloadable method with helper fields declared above
   **/
  private static void report(String message) {

      String longMessage = "|--- " + hearts + " hearts | " + gold + " gold | " + currentWave + "th wave" + " ---|" + tabulators + "\n" +
              message;
    log(longMessage);
  }

  private void report(String message, int heartsLoss) {

    hearts = Math.max(0, hearts - heartsLoss);
    String longMessage = "|--- " + hearts + " hearts | " + gold + " gold | " + currentWave + "th wave " + tabulators + "\n" + message;
    log(longMessage);
  }
}
