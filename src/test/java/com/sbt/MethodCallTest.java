package com.sbt;

import org.junit.Test;

import static org.junit.Assert.*;

public class MethodCallTest {

    @Test
    public void getInfo() {
        Boolean securitySupported = Boolean.TRUE;
        int info = new MethodCall().getInfo(
                87345,
                securitySupported,
                1.78f,
                10_000.56,
                'f');

        assertEquals(1, info);
    }
}