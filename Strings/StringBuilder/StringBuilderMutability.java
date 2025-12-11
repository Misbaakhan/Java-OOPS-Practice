package Strings;

public class StringBuilderMutability {
    public static void main(String[] args) {
        // String (immutable)
        String str = "Hello";
        str.concat(" World"); // creates a new  anonymous object in heap
        System.out.println("String value: " + str);

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // this modifies the same object
        System.out.println("StringBuilder value: " + sb);
    }
    
}
