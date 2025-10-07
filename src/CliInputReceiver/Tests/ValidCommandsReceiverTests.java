package CliInputReceiver.Tests;

import CliInputReceiver.ValidCommands;

import java.util.Scanner;


public class ValidCommandsReceiverTests {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("KR CLI started. Type 'exit' to quit.");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine().trim();

      String farewellMessage = "Goodbye Defender!";
      if (currentWave > 15){
        System.out.println("Game finished! " + farewellMessage);
        break;
      }
      if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
        System.out.println(farewellMessage);
        break;
      }

      input = input.toLowerCase();
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
        report("Executed battle action: `" + cmd +"`");
        return;
      }
    }

    // Check 1 param battle action commands
    for (String cmd : ValidCommands.battle) {
    if (input.startsWith("kill"){
      String remainder = input.substring(cmd.length()).trim();
    }

    // Check tower + position, e.g., Archer 15
    for (String tower : ValidCommands.TOWERS) {
      if (input.startsWith(tower.toLowerCase())) {
        String remainder = input.substring(tower.length()).trim();
        if (isInteger(remainder)) {
          int pos = Integer.parseInt(remainder);
          if (pos >= 0 && pos <= 30) {
            report("Placed tower " + tower + " at position " + pos);
            gold -= 100; // TODO gold -= tower.price();
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


  // fields for report
  private static int hearts = 20;
  private static int gold = 700;
  private static String tabulators = "\t\t\t\t\t\t\t\t";

  /** Overloadable method with helper fields declared above
   *
   *
   */
  private static void report(String message){

    StringBuilder builder = new StringBuilder();
    builder.append(hearts).append(" hearts | ").append(gold).append(" gold | ").append(currentWave).append("th wave ").append(tabulators).append("\n")
                    .append(message);
    System.out.println(builder);
  }

  private void report(String message, int heartsLoss){

    StringBuilder builder = new StringBuilder();
    hearts = Math.max(0, hearts - heartsLoss);
    builder.append(hearts).append(" hearts | ").append(gold).append(" gold | ").append(currentWave).append("th wave ").append(tabulators).append("\n")
            .append(message);
    System.out.println(builder);
  }
}
