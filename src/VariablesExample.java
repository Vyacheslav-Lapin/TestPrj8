public class VariablesExample {

    boolean statusOn;
    double javaVar = 2.34;

    public static void main(String[] args) {

        int itemsSold = 04;
        System.out.println("itemsSold = " + itemsSold);

        double salary = 1.234e3;
        System.out.println("salary = " + salary);

        float itemCost = 11.0f;
        System.out.println("itemCost = " + itemCost);

        int i = 0xFd45;
        System.out.println("i = " + i);

        int k$;
        double _interestRate;

        new VariablesExample().javaMethod();
    }

    public void javaMethod() {
        long simpleVar = 1_000_000_000_000L;
        System.out.println("simpleVar = " + simpleVar);

        Integer i = 55;
        System.out.println("i = " + i);

        byte byteVar2 = 123;
        System.out.println("byteVar2 = " + byteVar2);
    }
}
