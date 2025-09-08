package notCategorizedYet;

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