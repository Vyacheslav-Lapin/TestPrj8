package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Java7Style {
    public static void main(String... args) {
        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("text.txt")))) {

            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
