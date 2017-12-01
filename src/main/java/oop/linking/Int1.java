package oop.linking;

public interface Int1 {

    void m();

    void n();

    static void main(String... args) {
        Int1 int1 = new Int1() {
            int x;
            {x = 56;}

            @Override
            public void m() {
                System.out.println(1);
            }

            @Override
            public void n() {
                System.out.println(2);
            }
        };

        int1.m();
        int1.n();
    }
}
