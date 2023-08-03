package demo;

public class ConstructorDemo {
	
	public static int x;//10
	private static int k=20;
	
	ConstructorDemo(int y,int z,String str){
		 x=y;
		 System.out.println(str+" "+(y+z));
		System.out.println("Hello Constructor");
		System.out.println("Contr "+x);
	}
	 
	void demo() {
		System.out.println("Demo method");
		System.out.println("Method "+x);
	}

	public static void main(String[] args) {

		ConstructorDemo cd=new ConstructorDemo(10,20,"Hello");
		//cd.demo();
		System.out.println(k);
		System.out.println("Main "+x);
	}

}
