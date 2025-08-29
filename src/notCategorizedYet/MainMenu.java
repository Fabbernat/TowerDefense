package notCategorizedYet;

public class MainMenu {
  boolean slotsOpened = false;
  SlotsContainer slotsContainer = new SlotsContainer();

  public class SlotsContainer {
    private final Slot[] slots;

    public SlotsContainer() {
      slots = new Slot[3]; // fixed size
    }

    public void initializeNewSlot(int index, Slot slotToInit) {
      if (index < 0 || index >= 3) throw new IndexOutOfBoundsException();
      slots[index] = slotToInit;
    }

    public void clickSlot(int index) {
      if (index < 0 || index >= 3) throw new IndexOutOfBoundsException();
      slots[index].openSlot();
    }

    public void deleteSlot(int index) {
      slots[index] = null;
    }

    public Slot getSlot(int index) {
      if (index < 0 || index >= 3) throw new IndexOutOfBoundsException();
      else {
        return slots[index];
      }
    }

    public SlotsContainer clickSlots() {
      slotsOpened = true;
      slotsContainer = new SlotsContainer();
      return slotsContainer;
    }

    public void closeSlots() {
      slotsOpened = false;
      slotsContainer = null;
    }

    public class Slot {
      private int id;
      boolean attemptingToDelete = false;

      public Slot(int id) {
        this.id = id;
      }

      public void openSlot() {

      }

      public void attemptToDeleteSlot() {
        attemptingToDelete = true;
      }

      public void deleteSlot() {
        if (!attemptingToDelete) {
          return;
        }
        attemptingToDelete = false;
      }

      public boolean isAttemptingToDelete() {
        return attemptingToDelete;
      }

      public void setAttemptingToDelete(boolean attemptingToDelete) {
        this.attemptingToDelete = attemptingToDelete;
      }

      public void cancelDeletingSlot() {
        if (!attemptingToDelete) {
          return;
        }
        attemptingToDelete = false;


      }


    }
  }
}
