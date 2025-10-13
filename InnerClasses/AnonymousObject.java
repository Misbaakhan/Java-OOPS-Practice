class A {
    public A() {
        System.out.println("object  created");
    }

    public void test() {
        System.out.println("In test method");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A();     // it will not have any reference variable
        new A().test();

    }
}
