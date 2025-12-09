public class ThrowDemo {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("not eligible to  vote");
        }else{
            System.out.println("you can vote!");
        }
    }
    public static void main(String[] args) {
        checkAge(10);
        
    }
    
}
