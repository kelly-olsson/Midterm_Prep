package midterm_practice_pg5;

public class RussianBlue extends Tiger{

    public void walk(){
        super.walk();
        System.out.println("Walk like a RussianBlue");
    }
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args){
        Feline katya = new RussianBlue();
        katya.walk();
    }
}
