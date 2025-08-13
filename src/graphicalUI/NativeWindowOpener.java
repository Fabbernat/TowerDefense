package graphicalUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class NativeWindowOpener {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      // Use the OS look & feel so it blends with Windows 11
      try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}

      JFrame window = new JFrame("Kingdom Rush");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setMinimumSize(new Dimension(360, 240));
      window.setSize(1600, 1000);
      window.setLocationByPlatform(true); // lets Windows decide a nice starting position

      window.setLayout(new BorderLayout());
      window.add(new JLabel("KINGDOM RUSH", SwingConstants.CENTER), BorderLayout.CENTER);

      // Create a panel to draw our sprites
      SpritePanel spritePanel = new SpritePanel();
      window.add(spritePanel, BorderLayout.CENTER);

      window.setVisible(true);




    });
  }
  static class SpritePanel extends JPanel {
    private BufferedImage sprite;

    public SpritePanel() {
      try {
        sprite = ImageIO.read(new File("assets/sprites/goblin.png"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (sprite != null) {
        // Draw at position (100,100) — scale to 64x64
        g.drawImage(sprite, 100, 100, 64, 64, null);
      }
    }
  }
}