package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Java6Style {
    public static void main(String... args) {
        PrintWriter pw = null;
        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("text.txt");

            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);

            pw = new PrintWriter(br);

            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (pw != null) {
                pw.close(); // закрытие потока
            }
        }
    }
}
