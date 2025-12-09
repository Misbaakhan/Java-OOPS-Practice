public class TryCatchBlock {

    public static void main(String[] args) {
        int a = 10;
        try {
            int result = a / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("cannnot divide by zero");
        }

    }

}
