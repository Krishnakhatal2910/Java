package polyDemo;

public class MethodOverloading {
	
	int addition(int a,float b) {
		return (int) (a+b);
	}
	long addition(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		//int result = mo.addition(10, 20,30);
		int result = mo.addition(10, 20.5f);
		System.out.println(result);
//		float fResult = mo.addition(10.5f, 20.8f);
//		System.out.println(fResult);

	}

}
