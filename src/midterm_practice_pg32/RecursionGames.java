package midterm_practice_pg32;

public class RecursionGames {
    private static final int UPPER_BOUND = 5;

    private RecursionGames() { }

    /**
     * Combobulates.
     * @param operand
     */
    public static void combobulate(int operand){
        System.out.println(operand);
        if (operand < UPPER_BOUND) {
            combobulate(operand+1);
        }
        System.out.println(operand);
    }
    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        combobulate(1);
    }
}
