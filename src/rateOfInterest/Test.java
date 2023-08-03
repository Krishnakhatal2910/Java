package rateOfInterest;

public class Test {
	public static void main(String[] args) {
		
		A a=new A();
		A.B b=a.new B();
		int c=b.b+a.a;
		System.out.println(c);
		
	}
}
