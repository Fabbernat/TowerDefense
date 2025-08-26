package notCategorizedYet;

public class MainMenu {
  boolean slotsOpened = false;
  class Slots {
    private final Slot[] slots;

    public Slots() {
      slots = new Slot[3]; // fixed size
    }

    public void set(int index, Slot value) {
      if (index < 0 || index >= 3) throw new IndexOutOfBoundsException();
      slots[index] = value;
    }

    public Slot get(int index) {
      if (index < 0 || index >= 3) throw new IndexOutOfBoundsException();
      return slots[index];
    }
  }

  public void touchSlots(){
    slotsOpened = true;
    slots.set(0, new Slot(0));
    slots.set(1, new Slot(1));
    slots.set(2, new Slot(2));
  }

  public void closeSlots(){
    slotsOpened = false;
  }

  private class Slot {
    private int id;

    public Slot(int id) {
      this.id = id;
    }

    public void openSlot(){

    }


  }

  Slots slots = new Slots();
}
