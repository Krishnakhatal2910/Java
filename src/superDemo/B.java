package superDemo;

public class B extends A {
	
	int i=20;
	
	B(){
		super();
		System.out.println("B class constructor");
	}
	
	void add(int a,int b) {
		super.add();
		System.out.println(super.i);//10
		System.out.println(this.i);//20
		System.out.println("Additon of a and b is "+(a+b));
	}
	
	 void demo() {
		this.add(10, 20);
	}

	public static void main(String[] args) {

		B obj=new B();
		obj.demo();;
	}

}
