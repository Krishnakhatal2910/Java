package access;

public class Enacap {

	public static void main(String[] args) {
		
		EncapsulationDemo ed=new EncapsulationDemo();
		
		//ed.setEmpId(101);
		int result = ed.getEmpId();//101
		System.out.println(result);
		//ed.setEmpSalary(30000);
		int empsal = ed.getEmpSalary();//30000
		System.out.println(empsal);
	}

}
