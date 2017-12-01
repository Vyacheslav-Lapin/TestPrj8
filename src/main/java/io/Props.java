package io;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.util.Properties;

public class Props {

    @SneakyThrows
    public static void main(String... args) {
        Properties properties = new Properties();
        try (InputStream resource =
                     Props.class.getResourceAsStream("/sdf.properties")) {
            properties.load(resource);
        }

        String hbsdf = properties.getProperty("hbsdf");
        System.out.println(hbsdf.equals("8345"));
    }
}
