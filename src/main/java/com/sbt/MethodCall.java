package com.sbt;

public class MethodCall {
    public int getInfo(
            int index,
            boolean securitySupported,
            float height,
            double money,
            char gender) {
        return 1;
    }

    public static void main(String... args) {
        Boolean securitySupported = new Boolean(true);
        new MethodCall().getInfo(
                87345,
                securitySupported,
                1.78f,
                10_000.56,
                'f');
    }
}
