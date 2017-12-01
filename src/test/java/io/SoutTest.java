package io;

import org.junit.Test;

import static commons.TestUtils.fromSystemOut;
import static org.junit.Assert.assertEquals;

public class SoutTest {
    @Test
    public void name() {
        String s = fromSystemOut(Sout::m);
        assertEquals(s, "Мама мыла раму!\n");
    }
}