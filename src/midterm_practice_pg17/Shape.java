package midterm_practice_pg17;

abstract class Shape {

    public Shape() {
        System.out.println("Instantiating shape");
        draw();
        System.out.println("Finished drawing shape");
    }
    /**
     * Draws the Shape.
     */
    void draw() {
        System.out.println("Drawing shape");
    }
}
