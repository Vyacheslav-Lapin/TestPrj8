package oop.linking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {

    @Test
    public void m() {
        assertEquals(1, new A().m());
        A b = new B();
        assertEquals(2, b.m());
    }

    @Test
    public void ms() {
        assertEquals(11, new A().ms());
        A b = new B();
        assertEquals(22, new B().ms());
        assertEquals(11, b.ms()); // раннее связывание
        assertEquals(11, A.ms());
    }
}