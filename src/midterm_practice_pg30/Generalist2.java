package midterm_practice_pg30;

public class Generalist2 {
    static int x = print("x initialized in Generalist2");
    static {
        System.out.println("static Generalist2");
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
     * Constructs an object of type Generalist2.
     */
    public Generalist2() {
        System.out.println("Generalist2()");
    }
}
