package demo;

public class DataTypes {

	int addition() {
		return 10;
	}
	
	
	
	public static void main(String[] args) {
		
		byte b1=-128;
		byte b2=127;
		short s=32_767;
		
		float f=2.11111111f;
		double d=4.563467975788877;
		
		
		boolean k=true;
		boolean l=false;
		
		char c='A';
		char ch=65;
		
		char ch1=90;
		System.out.println(c);//A
		System.out.println(ch);//A
		System.out.println(ch1);//Z
		
		
		char s1=97;
		System.out.println(s1);//a
		
		char s2=122;
		System.out.println(s2);//z
		
		String greeting = "Hello World";
		System.out.println(greeting);
		
		DataTypes dt=new DataTypes();
		int i=dt.addition();
		System.out.println(dt.addition());//10
		System.out.println(i);//10
		
		String greet=null;
	}

	
	
	
}
