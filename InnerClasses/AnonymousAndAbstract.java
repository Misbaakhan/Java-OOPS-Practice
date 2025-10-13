abstract class A {
    public abstract void test();
}

public class AnonymousAndAbstract {
    public static void main(String[] args) {
        A a = new A() {                   // this object works for anonymous class
            public void test() {
                System.out.println("in test method");
            }
        };
        a.test();
    }

}
