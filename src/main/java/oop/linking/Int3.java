package oop.linking;

@FunctionalInterface
public interface Int3 {
    void m();

    static void main(String... args) {
        Int3 int3 = () -> System.out.println(5);
        int3.m();
    }
}
