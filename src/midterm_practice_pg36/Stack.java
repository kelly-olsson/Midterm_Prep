package midterm_practice_pg36;

public final class Stack {

    private static int DEFAULT_STACK_SIZE = 10;

    private Entity[] stackValues;

    public Stack() {
        this.stackValues = new Entity[DEFAULT_STACK_SIZE];
    }

    public Stack(final int initialCapacity) {
        this.stackValues = new Entity[initialCapacity];
    }

    public boolean empty() {
        for (Entity stackValue : this.stackValues) {
            if (stackValue != null) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        int counter = 0;
        for (Entity stackValue : this.stackValues) {
            if (stackValue != null) {
                counter++;
            }
        }
        return counter;
    }

    public int capacity() {
        return this.stackValues.length;
    }

    public Entity pop() {
        if (this.size() == 0) {
            return null;
        } else {
            Entity poppedObject = stackValues[this.size() - 1];
            stackValues[this.size() - 1] = null;
            return poppedObject;
        }
    }

    public int search(Entity e) {
        for (int i = 0; i < this.capacity(); i++) {
            if (stackValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void push(Entity e) {
        this.resize();
        this.stackValues[this.size()] = e;
    }

    public void resize() {
        if ((double)(this.size() / this.capacity()) >= 0.8) {
            int currentCapacity = this.capacity();
            Entity[] newStack = new Entity[currentCapacity * 2];
            System.arraycopy(this.stackValues, 0, newStack, 0, currentCapacity);
            this.stackValues = newStack;
        }
    }
}
