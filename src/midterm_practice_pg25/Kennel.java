package midterm_practice_pg25;

public class Kennel {

    public static void main(String[] args) {
        Animal sasha;
        Dog rex;
        rex = new Mastiff();
        sasha = new ShibaInu();
        sasha.draw();
        rex.draw();
        sasha = rex;
        sasha.draw();
    }
}
