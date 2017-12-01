package oop.linking;

public class Class1 implements Int1, Int2 {

    private final static int x;

    static {
        Object o = new Object();
        try {
            x = o.hashCode();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void m() {

    }

    @Override
    public void n() {
        Int2.super.n();
    }
}
