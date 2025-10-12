public class Narrowing {

	static int convert() {
        return (int) 20.5; // double → int, explicit cast needed
    }
	static char test(){
		return (char) 105;     //int->char
	}

	public static void main(String[] args) {
		System.out.println(convert());
		System.out.println(test());
		double a=10.5;
		int b=(int)a;           //double->int
		System.out.println(b);
	}

}
