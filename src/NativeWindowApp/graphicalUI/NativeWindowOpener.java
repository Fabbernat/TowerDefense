package NativeWindowApp.graphicalUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NativeWindowOpener {


  public static void run(String[] args) {
    SwingUtilities.invokeLater(() -> {

      // Use the OS look & feel so it blends with Windows 11
      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception ignored) {
      }

      JFrame mainFrame = new JFrame("Kingdom Rush");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setMinimumSize(new Dimension(360, 240));
      mainFrame.setSize(Window.width, Window.height);
      mainFrame.setLocationByPlatform(true); // lets Windows decide a nice starting position

      mainFrame.setLayout(new BorderLayout());
      mainFrame.add(new JLabel("KINGDOM RUSH", SwingConstants.CENTER), BorderLayout.CENTER);

      SpritePanel spritePanel = new SpritePanel();
      GamePanel gamePanel = new GamePanel();

      JPanel container = new JPanel(new GridLayout(1, 2)); // side-by-side
      container.add(spritePanel);
      container.add(gamePanel);

      mainFrame.add(spritePanel, BorderLayout.CENTER);

      mainFrame.setVisible(true);

      gamePanel.startGameLoop();
    });
  }

  static class SpritePanel extends JPanel {
    private class Sprite {
      BufferedImage image;
      int x, y;
      int deltaX, deltaY; // movement speed

      Sprite(String path, int startX, int startY, int deltaX, int deltaY) {
        try {
          image = ImageIO.read(new File(path));
        } catch (IOException e) {
          e.printStackTrace();
        }
        this.x = startX;
        this.y = startY;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
      }

      void update() {
        x += deltaX;
        y += deltaY;
      }

      void draw(Graphics g) {
        if (image != null) {
          g.drawImage(image, x, y, 64, 64, null);
        }
      }
    }

    private final java.util.List<Sprite> sprites = new java.util.ArrayList<>();

    public SpritePanel() {
      paintBackground();
      loadMobiles();

      // simple timer loop for movement
      Timer timer = new Timer(16, e -> {
        for (Sprite s : sprites) {
          s.update();
        }
        repaint();
      });
      timer.start();
    }


    private void paintBackground() {
      int backGroundSpriteHeightAndWidth = 127;
      int gapToNextBackGroundSpriteRow = backGroundSpriteHeightAndWidth * 2;

      for (int y = 0; y < Window.height; y += backGroundSpriteHeightAndWidth) {
        if (y % gapToNextBackGroundSpriteRow == 0) {
          for (int x = 0; x < Window.width; x += backGroundSpriteHeightAndWidth) {
            sprites.add(new Sprite("assets/sprites/territory/upperBorderOfThePath.png", x, y, 0, 0));
          }
        } else {
          for (int x = 0; x < Window.width; x += backGroundSpriteHeightAndWidth) {
            sprites.add(new Sprite("assets/sprites/territory/lowerBorderOfThePath.png", x, y, 0, 0));
          }
        }
      }
    }

    private void loadMobiles() {
      // load goblin, wulf, shaman, etc.
      sprites.add(new Sprite("assets/sprites/goblin.png", 40, 100, 2, 0));
      sprites.add(new Sprite("assets/sprites/enemies/wulf.png", 60, 150, 3, 0));
      sprites.add(new Sprite("assets/sprites/enemies/shaman.png", 80, 200, 1, 0));
      sprites.add(new Sprite("assets/sprites/enemies/mageLevel1.png", 110, 300, 1, 0));
      sprites.add(new Sprite("assets/sprites/enemies/mageLevel2.png", 123, 400, 4, 0));
      sprites.add(new Sprite("assets/sprites/enemies/mageLevel3.png", 146, 500, 9, 0));
      sprites.add(new Sprite("assets/sprites/enemies/kidGoblin.png", 166, 600, 1, 0));
      sprites.add(new Sprite("assets/sprites/towers/mageTower.png", 200, 700, 1, 0));
      sprites.add(new Sprite("assets/sprites/enemies/bow.png", 256, 800, 1, 0));
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      for (Sprite s : sprites) {
        s.draw(g);
      }
    }
  }
}

