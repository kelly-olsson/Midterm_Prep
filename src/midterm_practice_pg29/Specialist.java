package midterm_practice_pg29;

public class Specialist extends Generalist {

    static {
        System.out.println("static Specialist");
    }

    /**
     * Constructs an object of type Specialist.
     */
    public Specialist() {
        System.out.println("Specialist()");
    }

    public static void main(String[] args) {
        System.out.println("starting program");
        new Generalist();
        System.out.println("------------");
        new Generalist();
        System.out.println("------------");
        new Specialist();
        System.out.println("-----------");
        new Specialist();
    }
}
