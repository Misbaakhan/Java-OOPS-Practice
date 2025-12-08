package Strings;
public class StringMethods {

    public static void main(String[] args) {
        String str = "  Hello Java World  ";

        // length()
        System.out.println("Original String: =" + str);
        System.out.println("Length: " + str.length());

        // trim()
        String trimmed = str.trim();
        System.out.println("After trim: \"" + trimmed + "\"");

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // charAt()
        System.out.println("Char at index 1: " + trimmed.charAt(1));

        // substring()
        System.out.println("Substring (6 to 10): " + trimmed.substring(6, 10)); // "Java"

        // contains()
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // indexOf()
        System.out.println("Index of 'Java': " + trimmed.indexOf("Java"));

        // replace()
        String replaced = trimmed.replace("Java", "String");
        System.out.println("After replace: " + replaced);

        // startsWith() and endsWith()
        System.out.println("Starts with 'Hello'? " + trimmed.startsWith("Hello"));
        System.out.println("Ends with 'World'? " + trimmed.endsWith("World"));
    }
}

