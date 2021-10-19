package midterm_practice_pg35;

public class Driver {

    public static void main(String[] args) {
        Die d20 = Die.getInstance(20);

        // This will generate a number between 1 and 20 inclusive
        System.out.println(d20.roll());

        Die d20_2 = Die.getInstance(20);

        // Prints true
        System.out.println(d20 == d20_2 && d20.equals(d20_2));

        // Throws an IllegalArgumentException
//        Die d4 = Die.getInstance(-1);

        Die d8 = Die.getInstance(8);

        // This will print false
        System.out.println(d20 == d8);

        // Must print something meaningful.
        System.out.println(d20);
    }
}
