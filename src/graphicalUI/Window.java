package graphicalUI;

import jdk.jshell.spi.ExecutionControl;

public class Window {
  int width, height;
  String title;

  private static Window window = null;

  private Window() {
    this.width = 1920;
    this.height = 1080;
    this.title = "Tower Defense";
  }

  public static Window get() {
    if (Window.window == null) {
      Window.window = new Window();
    }

    return Window.window;
  }

  public void run() throws ExecutionControl.NotImplementedException {
    init();
    loop();
  }

  private void init() throws ExecutionControl.NotImplementedException {
    throw new ExecutionControl.NotImplementedException("Method not implemented");
  }
  

  private void loop() throws ExecutionControl.NotImplementedException {
    throw new ExecutionControl.NotImplementedException("Method not implemented");
  }
}
