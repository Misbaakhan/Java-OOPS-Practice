class Delta{
	int a=10;
	void test(){
		System.out.println("executing test()...");
	}   // default constructor - every class will have a constructor by default
}
public class DefaultConstrucctor {
	public static void main(String[] args) {
		Delta d=new Delta();
		System.out.println(d.a);
		d.test();

	}

}
