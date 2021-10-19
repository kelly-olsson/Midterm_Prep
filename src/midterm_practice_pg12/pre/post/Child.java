package midterm_practice_pg12.pre.post;

import midterm_practice_pg12.pre.Parent;

public class Child extends Parent {

    public Child(int x, int y) {
        this.x = x; /* COMPILER ERROR! */
        this.y = y;
    }
}
