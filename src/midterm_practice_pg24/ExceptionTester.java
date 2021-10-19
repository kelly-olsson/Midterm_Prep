package midterm_practice_pg24;

public class ExceptionTester {

    public ExceptionTester() {
        // TODO Auto-generated constructor stub
    }

    public void firstMethod() {
        try {
            System.out.println("starting firstMethod");
            System.out.println("calling secondMethod");
            secondMethod();
            System.out.println("returned from secondMethod");
        } catch (Exception e) {
            System.out.println("firstMethod has caught an exception");
        } finally {
            System.out.println("firstmethod finally!");
        }
    }
    public void secondMethod() {
        try {
            System.out.println("starting secondMethod");
            System.out.println("calling thirdMethod");
            thirdMethod();
            System.out.println("returned from thirdMethod");
        } catch (Exception e) {
            System.out.println("secondMethod has caught an exception");
        } finally {
            System.out.println("secondMethod finally!");
        }
    }
    public void thirdMethod() throws Exception {
        System.out.println("starting thirdMethod");
        throw new Exception();
    }

    public static void main(String[] args) {
        ExceptionTester tester = new ExceptionTester();
        tester.firstMethod();
    }
}
