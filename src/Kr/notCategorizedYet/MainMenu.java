package Kr.notCategorizedYet;

public class MainMenu {
    boolean slotsOpened = false;

    private SlotsContainer slotsContainer = new SlotsContainer();

    public SlotsContainer getSlotsContainer() {
        return slotsContainer;
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
}
