package demo;

public class MethodOverloading {
	
	
	
	void myMethod(int a,float y) {
		System.out.println(a*y);
	}
	void myMethod(float y,int a) {
		System.out.println(y+a);
	}
	void myMethod(String s1,String s2) {
		System.out.println(s1+" "+s2);
	}
	void myMethod(float e,float f) {
		System.out.println(e-f);
	}
	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.myMethod("Hello", "Java");
		mo.myMethod(10, 20.0f);
		mo.myMethod(5.5F, 5);
		mo.myMethod(6.5f, 4.5f);
		

	}

}
