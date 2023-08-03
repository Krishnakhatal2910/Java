package access;

public class TestAbsratct extends Abc {

	public static void main(String[] args) {
		
		TestAbsratct ta=new TestAbsratct();
		System.out.println(ta.a);
		System.out.println(ta.add(10, 20));
		ta.demo();
		
		//Abc a=new Abc();
	}

	@Override
	void demo() {
	System.out.println("Hello ");
		
	}

}