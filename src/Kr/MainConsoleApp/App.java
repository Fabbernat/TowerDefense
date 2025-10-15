package Kr.MainConsoleApp;

import static Kr.MainConsoleApp.Engine.CliInputReceiver.run;

public class App {

  public static void log(String message){
    System.out.println(message);
  }
  public static void main(String[] args) {
    run();
  }
}
