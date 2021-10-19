package midterm_practice_pg17;

public class Circle extends Shape {

    private int radius = 1;

    Circle(int circleRadius) {
        radius = circleRadius;
        System.out.println("Circle has radius = " + radius);
    }

    void draw() {
        System.out.println("Drawing Circle radius = " + radius);
    }

    public static void main(String[] args) {
        Circle orbit = new Circle(5);
    }
}
