package Java;

public class PvtConstructor {
    private PvtConstructor() {
        System.out.println("This is private constructor");
    }

    PvtConstructor(String test) {
        System.out.println("This is second constructor");
    }

    public void method1() {
        System.out.println("This is method1");
    }

    public static void main(String args[]) {
        PvtConstructor pvtConstructor = new PvtConstructor();
        pvtConstructor.method1();
    }
}
