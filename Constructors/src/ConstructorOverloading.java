class Sum { 
	Sum(int a, int b) {  // type of argument
		System.out.println("a+b:" + (a + b));
	}

	Sum(float a, float b) {
		System.out.println("a+b:" + (a + b));
	}

	Sum(double a, double b) {
		System.out.println("a+b:" + (a + b));
	}
}

class Multiply {
	Multiply(int x, int y) {    // length of argument
		System.out.println("x*y:" + (x * y));
	}

	Multiply(int x, int y, int z) {
		System.out.println("x*y:" + (x * y * z));
	}

}

class Calc {
	Calc(int a, float b) { // sequence of constructor
		System.out.println("Constructor called with int then float: " + a + ", " + b);
	}

	Calc(float a, int b) {
		System.out.println("Constructor called with float then int: " + a + ", " + b);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Sum sum = new Sum(10, 20);
		Multiply multiply = new Multiply(2, 4);
		Calc calc = new Calc(5, 2.5f);

	}

}
