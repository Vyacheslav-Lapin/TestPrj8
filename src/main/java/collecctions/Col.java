package collecctions;

import java.util.*;

public class Col {

    public static void main(String... args) {
        Map<Integer, String> integers = new HashMap<>();

        integers.put(1, "erg");
        integers.put(3, "gad");
        integers.put(5, "jhgasd");
        integers.put(10, "sdgfasdfg");

        System.out.println(integers.get(3));

        for (Map.Entry<Integer, String> integer : integers.entrySet()) {
            System.out.println(integer.getKey());
            System.out.println(integer.getValue());
        }
    }
}
