public class ThreadSafetyDemo {

    static StringBuffer buffer = new StringBuffer();
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {

        // StringBuffer
        Thread t1 = new Thread(() -> buffer.append("A"));
        Thread t2 = new Thread(() -> buffer.append("B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("StringBuffer (Thread-safe): " + buffer);

        // StringBuilder
        Thread t3 = new Thread(() -> builder.append("A"));
        Thread t4 = new Thread(() -> builder.append("B"));
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("StringBuilder (Not Thread-safe): " + builder);
    }
}
