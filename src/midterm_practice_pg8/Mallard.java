package midterm_practice_pg8;

public class Mallard  extends Duck{

    public void quack(double x){
        System.out.println(x + 5);
    }

    public static void main(String[] args){
        Duck ren = new Mallard();
        ren.quack(3.14);
    }
}
