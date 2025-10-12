class Alpha{
	int a=10;
	Alpha(int i){   //User defined parameter argument
		System.out.println("parameterized constructor");
		System.out.println("value of i is : "+i);
	}
	void test(){
		System.out.println("executing test()...");
	}   // default constructor - every class will have a constructor by default
}
public class UserDefined {
	public static void main(String[] args) {
		Alpha a=new Alpha(5);
		System.out.println(a.a);
		a.test();

	}

}
