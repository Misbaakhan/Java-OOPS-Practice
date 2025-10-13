class A {
    public void test() {
        System.out.println("in test method");
    }

    class B {                 //inner class
        public void display() {
            System.out.println("in display method");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        A.B b = a.new B();   //inner class object creation
        b.display();

    }

}
