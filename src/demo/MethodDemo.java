package demo;

public class MethodDemo {
	int c=50;//Global variables
	void addition() {
		
		
		System.out.println(c);//50
		
		int c=30;//Local variables
		
		System.out.println(c);//30
	}
	void demo()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		MethodDemo md=new MethodDemo();
		md.addition();
	//	md.demo();
		
	}

}
