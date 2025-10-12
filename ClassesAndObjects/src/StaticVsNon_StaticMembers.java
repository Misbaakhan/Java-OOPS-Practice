public class StaticVsNon_StaticMembers {
	static int a=10;    
	int b=20; 
	static void test() {          // static method
		System.out.println("test starts");
		System.out.println("value of a is : "+a);
		System.out.println("test ends");
	}
 
	void display() {                   //non-static method
		System.out.println("display starts");
		test();
		System.out.println("value of b is : "+b);
		System.out.println("display ends");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Demo d=new Demo();
		d.display();
		System.out.println("main ends");

	}

}
