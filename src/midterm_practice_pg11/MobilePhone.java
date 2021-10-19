package midterm_practice_pg11;

abstract public class MobilePhone implements Phone{

    public void dialNumber(int number){
        System.out.println("You are phoning " + number);
    }

    public void hangUp(){
        System.out.println("Hanging up");
    }
}
