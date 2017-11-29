public class A {
    public int m(int x) {
        return x * x;
    }

    public static void main(String... args) {
        callM(new A(), 6); // 36
        callM(new B(), 6); // 12
    }

    public static void callM(A a, int x) {
        System.out.println(a.m(x));
    }
}

class B extends A {
    @Override
    public int m(int x) {
        return x + x;
    }
}