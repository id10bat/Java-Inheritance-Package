public class Test {
    public static void main(String[] args) {
        Number num = new Number();
        num.setIntNumber(100);
        num.setNumber(99.99);

        System.out.println(num.getNumber());
        System.out.println(num.getIntNumber());

    }
}
