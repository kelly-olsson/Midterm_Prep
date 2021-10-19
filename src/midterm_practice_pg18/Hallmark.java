package midterm_practice_pg18;

public class Hallmark {

    static Greeting cardOne, cardTwo;

    public static void swap(Object a, Object b){
        Object temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){
        cardOne = new GetWellSoon();
        cardTwo = new HappyBirthday();
        System.out.println(cardOne.sendGreeting());
        swap(cardOne, cardTwo);
        System.out.println(cardOne.sendGreeting());
    }
}
