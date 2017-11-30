package oop.linking;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void name() {
        assertEquals(
                Singleton.getInstance(),
                Singleton.getInstance());
    }
}