public class Derived extends Base {
    public Derived(){
        System.out.println("Derived()");
    }

    public Derived(int x) {
        super(x);
        System.out.println("Derived(int x)");

    }
}
