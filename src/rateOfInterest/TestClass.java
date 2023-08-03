package rateOfInterest;

public class TestClass {

	public static void main(String[] args) {
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		
		System.out.println(s.rateOfInterest());
		System.out.println(i.rateOfInterest());
		System.out.println(a.rateOfInterest());
	}

}
