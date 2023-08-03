package access;

public class InterfaceTestClass implements InterfaceDemo,Xyz {

	public static void main(String[] args) {
		InterfaceTestClass itc=new InterfaceTestClass();
		//itc.a=50;
		System.out.println(itc.a);
		itc.abc();
		itc.xyz();
		
		//InterfaceDemo id=new InterfaceDemo();
	}

	@Override
	public void abc() {
		
		System.out.println("Inherited from interface");
	}

	@Override
	public void xyz() {
		System.out.println("Inherited from Xyz");
		
	}

}
