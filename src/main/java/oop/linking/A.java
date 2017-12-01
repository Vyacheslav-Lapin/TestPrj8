package oop.linking;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class A {

    public int m() {
        return 1;
    }

    public static int ms() {
        return 11;
    }

    public static void main(String... args) {
        A a = new A();
        System.out.println(a.m()); //1

        A a1 = new A() {
            @Override
            public int m() {
                return 2;
            }
        };

        System.out.println(a1.m()); // 2
    }
}
