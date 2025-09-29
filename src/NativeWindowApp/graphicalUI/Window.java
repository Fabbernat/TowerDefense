package NativeWindowApp.graphicalUI;

import jdk.jshell.spi.ExecutionControl;

public class Window {
  public static int width = 1920;
  public static int height = 1080;
  String title;

  private static Window window = null;

  private Window() {
    this.title = "Tower Defense";
  }

  public static Window get() {
    if (Window.window == null) {
      Window.window = new Window();
    }

    return Window.window;
  }

  public void run() {
    init();
    loop();
  }

  private void init() {

  }
  

  private void loop() {

  }
}
