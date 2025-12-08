public class StringReverse {

    public static void main(String[] args) {
        String str = "Misba Khanum";

        String reversed1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed1 = reversed1 + str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("String after reverse : " + reversed1);
    }
}
