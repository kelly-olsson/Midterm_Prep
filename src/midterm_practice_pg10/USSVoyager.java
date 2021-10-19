package midterm_practice_pg10;

public class USSVoyager {

    private String captain;

    public static void main(String[] args) {
        USSVoyager vg = new USSVoyager();
        if (args[0] != null)
            vg.captain = args[0];
    }
}
