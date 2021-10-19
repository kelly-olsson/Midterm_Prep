package midterm_practice_pg34;

public class Driver {

    public static void main(String[] args) {
        Movie m = new DVD();
        m.play();
        DVD d = (DVD) m;
        m = new DVD();
        ((DVD) m).menu();
    }
}
