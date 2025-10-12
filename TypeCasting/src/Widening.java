public class Widening {

	static double convert() {
		return 20;     // int → double widening happens automatically
	}
	static int test(){
		return 'A';     //char->int
	}

	public static void main(String[] args) {
		System.out.println(convert());
		System.out.println(test());
	}

}
