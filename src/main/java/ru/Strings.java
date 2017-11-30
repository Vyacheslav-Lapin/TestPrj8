package ru;

import com.B;

import java.util.Date;

public class Strings {

    public static void main(String... args) {
        String s = "Мама мыла раму!";
        String s1 = new String("Мама мыла раму!");
        String s2 = "Мама мыла раму!";
        System.out.println(s == s1); // false
        System.out.println(s == s2); // true
        System.out.println(s.equals(s1)); // true
        s1 = s1.intern();
        System.out.println(s == s1); // true

        int[] ints = new int[10];
        int x = 5;

        new B().m(56);

        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(345);
    }
}
