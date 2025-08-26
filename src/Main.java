import graphicalUI.Window;
import jdk.jshell.spi.ExecutionControl;
import notCategorizedYet.Starter;

public class Main {
  public static void main(String[] args) throws ExecutionControl.NotImplementedException {
    Window window = Window.get();
    window.run();
    Starter starter = new Starter();
    starter.start();
  }
}
