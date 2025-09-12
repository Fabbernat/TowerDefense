package NativeWindowApp.graphicalUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GamePanel extends JPanel {
  private BufferedImage sprite;
  private int x = 100, y = 100; // sprite position

  public GamePanel() {
    try {
      // Load your sprite (PNG/JPG)
      sprite = ImageIO.read(new File("assets/sprites/enemies/goblin.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Background color
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, getWidth(), getHeight());

    // Draw sprite
    if (sprite != null) {
      g.drawImage(sprite, x, y, null);
    }
  }

  // Basic game loop
  public void startGameLoop() {
    Timer timer = new Timer(16, e -> { // ~60 FPS
      update();
      repaint();
    });
    timer.start();
  }

  private void update() {
    // Example movement
    x += 2;
    if (x > getWidth()) x = -sprite.getWidth();
  }
}
