package Kr.levels;

import java.util.ArrayList;

public class Level {
  private ArrayList<Lane> lanes = new ArrayList<>();

  public Level() {
  }

  public Level(ArrayList<Lane> lanes) {
    this.lanes = lanes;
  }

  public ArrayList<Lane> getLanes() {
    return lanes;
  }

  public void setLanes(ArrayList<Lane> lanes) {
    this.lanes = lanes;
  }

  public void addLane(Lane lane) {
    this.lanes.add(lane);
  }
}
