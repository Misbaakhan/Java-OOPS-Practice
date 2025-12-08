public class StringBasics {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1); // stored  in String constant pool
        System.out.println(s2); //stored in heap
    }

}
