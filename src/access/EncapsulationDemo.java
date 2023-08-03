package access;

public class EncapsulationDemo {
	
	private int empId;//101
	private int empSalary;//30000

	public int getEmpId() {
		return empId;//Access emp Salary
	}

	public void setEmpId(int empId) {
		this.empId = empId;//101//Update empSalary
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
public static void main(String[] args) {
int s=64;
	
	System.out.println(Math.pow(5, 5));
	System.out.println(Math.sqrt(s));
}
	
	

}
