import NativeWindowApp.graphicalUI.Window;
import jdk.jshell.spi.ExecutionControl;
import notCategorizedYet.MainMenu;
import notCategorizedYet.SlotsContainer;
import notCategorizedYet.Starter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ExecutionControl.NotImplementedException {
    Window window = Window.get();
    window.run();
    Starter.start();

    MainMenu mainMenu = new MainMenu();
    SlotsContainer slotsContainer = new SlotsContainer();
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    switch (line) {
      case "open 1":
        slotsContainer.clickSlot(0);
      case "open 2":
        slotsContainer.clickSlot(1);
      case "open 3":
        slotsContainer.clickSlot(2);
      case "delete 1":
        slotsContainer.getSlot(0).attemptToDeleteSlot();

    }
  }
}
