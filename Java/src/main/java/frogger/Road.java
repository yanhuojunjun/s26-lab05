package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean canMove(int position) {
        // Check Validation
        if (position < 0) return false;
        if (position > occupied.length) return false;
        // Check Occupation
        if (occupied[position]) return false;
        // Can move
        return true;
    }
    // public boolean[] getOccupied() {
    //     return this.occupied;
    // }
}
