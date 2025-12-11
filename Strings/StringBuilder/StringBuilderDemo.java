public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        System.out.println("after appending : " + sb);
        sb.insert(5, " java ");
        System.out.println(" after inserting : " + sb);
        sb.replace(6, 10, "python");
        System.out.println(" after replacing : " + sb);
        sb.delete(6, 12);
        System.out.println(" after deleting : " + sb);
        System.out.println("character stored at index 3 is : "+sb.charAt(3));
        sb.reverse();
        System.out.println(" after reverse : " + sb);
        System.out.println("length of string : "+sb.length());
       

    }

}
