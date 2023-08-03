package access;

public class OverridingTestClass extends MethodOverridingDemo {

	int add(int a, int b) {

		System.out.println("Hello");
		return a+b;
	}

	public static void main(String[] args) {

		MethodOverridingDemo md=new  OverridingTestClass();//Dynamic binding
		System.out.println(md.add(12,13));
		OverridingTestClass otc = new OverridingTestClass();
		System.out.println(otc.add(12, 15));
	}

}
