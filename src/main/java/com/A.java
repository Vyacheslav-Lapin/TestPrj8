package com;

public abstract class A {
    public abstract int m(int x);

    public static void main(String... args) {
        callM(new B(), 6); // 12
        callM(new C(), 6); // 36
    }

    public static void callM(A a, int x) {
        System.out.println(a.m(x));
    }
}

class C extends A {
    @Override
    public int m(int x) {
        return x * x;
    }
}