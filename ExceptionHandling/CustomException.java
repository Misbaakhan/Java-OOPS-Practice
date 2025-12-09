
class NegativeAge extends Exception {

    public NegativeAge(String message) {
        super(message);
    }

}

public class CustomException {

    public static void main(String[] args) {
        try {
            int age = -10;
            if (age < 0) {
                throw new NegativeAge("age cannot be negative");
            }

        } catch (NegativeAge e) {
            System.out.println("exception caught : " + e.getMessage());
        }

    }

}
