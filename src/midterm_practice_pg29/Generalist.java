package midterm_practice_pg29;

public class Generalist {
    static int x = print("x initialized in Generalist");
    static {
        System.out.println("static Generalist");
    }
    /**
     * Prints the specified String and returns an int.
     * @param s
     * @return answer to life the universe and everything
     */
    public static int print(String s) {
        System.out.println(s);
        return 42;
    }
    /**
     * Constructs an object of type Specialist.
     */
    public Generalist() {
        System.out.println("Generalist()");
    }
}
