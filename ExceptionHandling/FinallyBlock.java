
public class FinallyBlock {

    public static void main(String[] args) {

        int a = 10;
        try {
            int result = a / 0;
            System.out.println(result);
            System.out.println("risky code is written inside try");

        } catch (ArithmeticException e) {
            System.out.println("cannnot divide by zero "+e);
            System.out.println("this block catches the exceptions");
        }
        finally{
            System.out.println("this will always execute no matter whether an exception is caught or not");
        }

    }

}
