public class StringComparison {

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // true - same pool
        System.out.println(a == c); // false - different memory
        System.out.println(a.equals(c)); // true - same value
        System.out.println(a.equals(b)); //true -same content
    }}
