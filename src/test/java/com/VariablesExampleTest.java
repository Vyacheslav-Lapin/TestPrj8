package com;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VariablesExampleTest {

    private static VariablesExample variablesExample;

    @BeforeClass
    public static void setUp() throws Exception {
        variablesExample = new VariablesExample();
    }

    public void m() {
        System.out.println("jkhgadg");
    }

    @Test
    public void javaMethod() {
        assertEquals("Метод должен возвращать 6", 6,
                variablesExample.javaMethod());

        assertTrue(2 * 2 == 4);
    }
}