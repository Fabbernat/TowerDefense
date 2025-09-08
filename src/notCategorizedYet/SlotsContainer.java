package notCategorizedYet;

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
}
