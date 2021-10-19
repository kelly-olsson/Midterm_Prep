package midterm_practice_pg28;

public class Ranger extends PathFinder {

    Point terminus;
    /**
     * Constructs a Ranger
     *
     * @param origin
     * @param terminus
     */
    public Ranger(Point origin, Point terminus) {// ERROR
        super(origin);
        this.terminus = terminus;
    }

    /**
     Page 28
     * Finds the specified path.
     *
     * @param origin
     * @param terminus
     */
    public void find(Point origin, Point terminus) {
    }
}
