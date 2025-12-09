
public class MultipleCatchDemo {

    public static void main(String[] args) {
        int a = 10;
        try {
            int result = a /10;
            System.out.println(result);
            int[] arr = {10, 20, 30};
            System.out.println(arr[4]);

        } catch (ArithmeticException e) {
            System.out.println("cannnot divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e1) {
            {
                System.out.println("array index is out of bound " + e1);

            }

        }

    }

}
