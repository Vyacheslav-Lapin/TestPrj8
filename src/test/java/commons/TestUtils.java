package commons;

import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public interface TestUtils {

    @SneakyThrows
    static String fromSystemOut(Runnable runnable) {

        PrintStream realOut = System.out;

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             PrintStream printStream = new PrintStream(out)) {

            System.setOut(printStream);
            runnable.run();

            return new String(out.toByteArray()); // .intern()

        } finally {
            System.setOut(realOut);
        }
    }
}
