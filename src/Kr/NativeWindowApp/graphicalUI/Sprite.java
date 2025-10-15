package Kr.NativeWindowApp.graphicalUI;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Sprite {
  Map<Pixel, Map<Row, Column>> spriteAsMapOfPixels = new HashMap<>();

  BufferedImage image;
  int x, y;


  public Sprite(Map<Pixel, Map<Row, Column>> spriteAsMapOfPixels) {
    this.spriteAsMapOfPixels = spriteAsMapOfPixels;
  }


  Sprite(BufferedImage img, int x, int y) {
    this.image = img;
    this.x = x;
    this.y = y;
  }
}
