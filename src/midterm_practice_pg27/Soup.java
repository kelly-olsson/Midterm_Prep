package midterm_practice_pg27;

public class Soup {
    private Alphabet[] bowl;
    /**
     * Makes some soup.
     */
    public void simmer() {
        bowl = new Alphabet[5];
        bowl[0] = new E();
        bowl[1] = new C();
        bowl[2] = new D();
        bowl[3] = new B();
        bowl[4] = new A();
        for (int i = 0; i < bowl.length; i++) {
            bowl[i].display();
        }
        System.out.println("");

        change(bowl[0], new A());
        bowl[0].display();
        System.out.println("");

        bowl[0] = new E();
        change(bowl, new A(), 0);
        bowl[0].display();
    }
    /**
     * Sets the first parameter to be the second parameter.
     * @param a an Alphabet
     * @param b an Alphabet
     */
    public void change(Alphabet a, Alphabet b) {
        a = b;
    }
    /**
     * Sets the specified index of the specified array to be
     * the specified element.
     * @param a an Alphabet array
     * @param b an Alphabet
     * @param index an int
     */
    public void change(Alphabet[] a, Alphabet b, int index) {
        a[index] = b;
    }
    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        Soup pho = new Soup();
        pho.simmer();
    }
}
