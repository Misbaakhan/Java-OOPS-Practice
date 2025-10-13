class A {
    public void test() {
        System.out.println("in test method");
    }

}

public class AnonymousClass {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void test() {
                // super.test(); //if we want to print outer class method
                System.out.println("in new test method");
            }

        };
        a.test();
    }

}
