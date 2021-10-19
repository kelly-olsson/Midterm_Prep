package midterm_practice_pg35;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Die {

    private static final int SEED = 17;
    private static final int SCRAMBLER = 37;
    private static final int ROLL_LOWER_BOUND = 1;

    private static HashMap<Integer, Die> currentDie = new HashMap<>();
    private int sides;

    private Die() {}

    public static Die getInstance(int numberOfSides) {
        if (numberOfSides <= 0) {
            throw new IllegalArgumentException("A dice must have at least one side");
        }
        if (!currentDie.containsKey(numberOfSides)) {
            Die dice = new Die();
            dice.setSides(numberOfSides);
            currentDie.put(numberOfSides, dice);
        }
        return currentDie.get(numberOfSides);
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random generator = new Random();
        return generator.nextInt(this.sides) + ROLL_LOWER_BOUND;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Die die = (Die) otherObject;
        return sides == die.sides;
    }

    @Override
    public int hashCode() {
        int result = SEED;
        result = SCRAMBLER * result + this.sides;
        return result;
    }

    @Override
    public String toString() {
        return "Die[ sides= " + this.sides + " ]";
    }
}
