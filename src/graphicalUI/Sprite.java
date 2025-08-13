package graphicalUI;

import java.util.HashMap;
import java.util.Map;

public class Sprite {
  Map<Pixel, Map<Row, Column>> spriteAsMapOfPixels = new HashMap<>();

  public Sprite(Map<Pixel, Map<Row, Column>> spriteAsMapOfPixels) {
    this.spriteAsMapOfPixels = spriteAsMapOfPixels;
  }
}
