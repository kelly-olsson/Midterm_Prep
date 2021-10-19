package midterm_practice_pg26;

public class MindBender {

    void gimble(int v) throws Exception {
        if (v == 0)
            throw new Exception();
    }

    void turlywoops(int v) throws Exception {
        System.out.println("starting turlywoops");
        try {
            System.out.println("calling foo");
            gimble(v);
            System.out.println("after foo");
        } catch (Exception e) {
            System.out.println("handling exception");
            throw e;
        } finally {
            System.out.println("finally");
        }
        System.out.println("ending function turlywoops");
    }

    public static void main(String[] args) {
        MindBender mindBender = new MindBender();
        try {
            System.out.println("main");
            mindBender.turlywoops(0);
            System.out.println("after turlywoops");
        } catch (Exception e) {
            System.out.println("main - catch");
        } finally {
            System.out.println("main - finally");
        }
        System.out.println("finished program");
    }
}
