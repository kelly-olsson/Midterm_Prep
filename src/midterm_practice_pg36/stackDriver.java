package midterm_practice_pg36;

public class stackDriver {

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Expect the default stack to be 10
        System.out.println(stack.capacity() + "\n");

        // Check that we can add and remove an item
        Entity rabbit = new Animal();
        stack.push(rabbit);
        System.out.println(stack.empty()); // should be false
        System.out.println(stack.size()); // should be 1
        System.out.println(stack.pop()); // we should get rabbit toString
        System.out.println(stack.size()); // should be 0
        System.out.println(stack.empty() + "\n"); // should be true

        // Check that search will work
        Entity carrot = new Vegetable();
        stack.push(carrot);
        System.out.println(stack.search(carrot)); // should return 0
        stack.pop();
        System.out.println(stack.search(carrot) + "\n"); // should return -1

        // Check that resize works
        for (int i = 0; i < 11; i++) {
            stack.push(carrot);
        }
        System.out.println(stack.capacity()); // should be 20
        System.out.println(stack.size()); // should be 11
    }
}
